
package GurobiliKnapsack;
import gurobi.*;

public class ExactSolution {
	private ProblemData problemData;
	ExactSolution(ProblemData problemData)
	{
		this.problemData=problemData;
	}
	public void solveExact() {
		try {
			GRBEnv env = new GRBEnv("knapsack.log");
			GRBModel model = new GRBModel(env);
			int n=this.problemData.item.length;
			
			GRBVar[] x = new GRBVar[n];
			for(int i=0;i<n;i++)
			{                   //minimum-maximum-setobjective(ben bunu maximumum yapmak istiyor muyum?)-türü-ismi
				x[i]=model.addVar(0,1,0,GRB.BINARY,"x_"+this.problemData.item[i].getId());
			}
			
			GRBLinExpr expr = new GRBLinExpr();
			for(int i=0;i<n;i++)
			{   //katsayý-grbvar(0,1 aldýðý için) alýr --> aðýrlýk x 1 veya 0
				expr.addTerm(this.problemData.item[i].getWeight(), x[i]);
			}
			model.addConstr(expr, GRB.LESS_EQUAL, this.problemData.knapsackCapacity , "Knapsack Contraint");
			
			GRBLinExpr exprObj = new GRBLinExpr();
			for(int i=0;i<n;i++)
			{
				exprObj.addTerm(this.problemData.item[i].getValue(), x[i]);
			}
			model.setObjective(exprObj, GRB.MAXIMIZE);
			
			model.write("knapsack.lp");
			model.optimize();
			
			/*
			System.out.println("Optimal value of 643 "+x[4].get(GRB.DoubleAttr.X));
			System.out.println("Optimal value of 7373 "+x[5].get(GRB.DoubleAttr.X));
			System.out.println("Optimal value of 7646 "+x[6].get(GRB.DoubleAttr.X));
			System.out.println("Optimal value of 7566 "+x[7].get(GRB.DoubleAttr.X));
			*/
			
			model.dispose();
			env.dispose();
			
			// I cannot access the variable values here
			
		}
		catch(GRBException e) {	
		      System.out.println("Error code: " + e.getErrorCode() + ". " +
                      e.getMessage());
		}
	
	}
}
