package GurobiliKnapsack;

import java.util.HashMap;

import gurobi.*;
/*
 * Store the Gurobi decision variables for our Knapsack code in a 
 * HashMap<Item, GRBVar>, instead of an array. 
 * Then, use an enhanced for loop over all items to report each item's value, weight, and value at optimality.
 * Use one row for each item, with the required information separated with tabs.
 */

public class ExactSolution2 {

	private ProblemData problemData;
	HashMap<Item, GRBVar> hashmap = new HashMap<Item, GRBVar>();

	ExactSolution2(ProblemData problemData) {
		this.problemData = problemData;
	}

	public void solveExact() {
		try {
			GRBEnv env = new GRBEnv("knapsack.log");
			GRBModel model = new GRBModel(env);
			int n = this.problemData.item.length;

			for (int i = 0; i < n; i++) {
				hashmap.put(this.problemData.item[i],
						model.addVar(0, 1, 0, GRB.BINARY, "x_" + this.problemData.item[i].getId()));
			}

			GRBLinExpr expr = new GRBLinExpr();
			for (int i = 0; i < n; i++) {
				// We will give the weigth of item(key) and get the value(item) from hashmap.
				expr.addTerm(this.problemData.item[i].getWeight(), hashmap.get(this.problemData.item[i]));
			}
			model.addConstr(expr, GRB.LESS_EQUAL, this.problemData.knapsackCapacity, "Knapsack Contraint");

			GRBLinExpr exprObj = new GRBLinExpr();
			for (int i = 0; i < n; i++) {
				// We will give the value of item(key) and get the value(item) from hashmap.
				// value ile o item  var mý yok mu'yu çarpýyor.
				exprObj.addTerm(this.problemData.item[i].getValue(), hashmap.get(this.problemData.item[i]));
			}
			model.setObjective(exprObj, GRB.MAXIMIZE);

			model.write("knapsack.lp");
			model.optimize();
			// For each item i from hashmap's key set, we will printout the features.
			for (Item i : hashmap.keySet()) {
				System.out.println("Id:" + i.getId() + "  Weigth:" + i.getWeight() + "  Value:" + i.getValue()
						+ "  Optimal value:" + hashmap.get(i).get(GRB.DoubleAttr.X));
			}

			model.dispose();
			env.dispose();

		} catch (GRBException e) {
			System.out.println("Error code: " + e.getErrorCode() + ". " + e.getMessage());
		}

	}
}
