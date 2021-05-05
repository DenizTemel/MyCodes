package GurobiliKnapsack;

import java.util.HashMap;

public class Solution {
	private ProblemData problemData;
	
	Solution(ProblemData problemData)
	{
		this.problemData=problemData;
	}
	public void useAlgorithm() {
		
		int capacity=this.problemData.knapsackCapacity;
		int capacityUsed=0;
		
		//Dictionary: key value
		
		//Dictionary: <Item, double> -> value/weight 
		//Dictionary: <Item, bool>   -> item included or not
		//dict.keySet();
		//dict.get(key);
		
		
		HashMap<Item,Double> valuePerWeight=new HashMap<Item,Double>();
		HashMap<Item,Boolean> included=new HashMap<Item,Boolean>();
		HashMap<Item,Boolean> considered=new HashMap<Item,Boolean>();	
		
		for(Item i:this.problemData.item)
		{
			included.put(i, false);
		}
		
		for(Item i:this.problemData.item)
		{
			valuePerWeight.put(i,(double)i.getValue()/i.getWeight());
		}
		
		for(Item i:this.problemData.item)
		{
			considered.put(i, false);
		}
		

		do {
			double max_ratio=0;
			Item current_max = null;
			
			for(Item i:this.problemData.item)
			{
				if(!considered.get(i) && valuePerWeight.get(i)>max_ratio)
				{
					max_ratio=valuePerWeight.get(i);
					current_max=i;
				}
			}
			if(max_ratio==0)
			{
				break;
			}
			
			if(current_max.getWeight()+capacityUsed<=capacity)
			{
				considered.put(current_max,true);
				included.put(current_max,true);
				capacity-=current_max.getWeight();
			}
			else
			{
				considered.put(current_max,true);
			}
			
		} while(true);
		
		
	}
	
}
