package GurobiliKnapsack;

import java.io.*;

public class Knapsack {
	public static void main(String[] args) {
		ProblemData problemData = ReadData();
		Solution solution1 = new Solution(problemData);
		solution1.useAlgorithm();
		ExactSolution2 exactsolution = new ExactSolution2(problemData);
	    exactsolution.solveExact();
	}

	private static ProblemData ReadData() {
		ProblemData problemData=new ProblemData();
		FileReader fileReader;
		int knapsackCapacity;
		Item[] item;
		try {
			fileReader = new FileReader("src/GurobiliKnapsack/data.csv");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line=bufferedReader.readLine();
			String[] names=line.split(",");
			int numberofItems=names.length-1;

			item=new Item[numberofItems];
			for(int i=0;i<numberofItems;i++)
			{
				item[i]=new Item(names[i+1]);
			}
			
			line=bufferedReader.readLine();
			String[] values=line.split(",");
			for(int i=0;i<numberofItems;i++)
			{
				item[i].setValue(Integer.parseInt(values[i+1]));
			}
			
			
			line=bufferedReader.readLine();
			String[] weights=line.split(",");
			for(int i=0;i<numberofItems;i++)
			{
				item[i].setWeight(Integer.parseInt(weights[i+1]));
			}
			
			line=bufferedReader.readLine();
			line=bufferedReader.readLine();
			String[] capacityline=line.split(",");
			//use capacityline[1] as capacity
			knapsackCapacity=Integer.parseInt(capacityline[1]);
			problemData.item=item;
			problemData.knapsackCapacity=knapsackCapacity;
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return problemData;
		
	}
	
}
