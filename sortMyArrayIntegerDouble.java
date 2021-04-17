package Week8;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Provide a method named sortMyArray that can take a vector of doubles as input 
 * (should work with both an ArrayList<double> and a double[] array) and 
 * returns a HashMap where the key is the index of that item in the sorted list or array 
 * (in ascending order) and value is the item's value. 
 * For example if I do the following
 * double exampleArray={12 , 6 , -1.5, 4.8}
HashMap<Integer, double> sortedArray = sortMyArray(exampleArray)
my sortedArray should include 
<key:0,value:-1.5>, <key:1,value:4.8>, <key:2,value:6>, <key:3,value:12>.
 */
public class sortMyArrayIntegerDouble {
	public static void main(String[] args) {
		double[] exampleArray= {12,6,-1.5,4.8};
		HashMap<Integer,Double> sortedArray = sortMyArray(exampleArray);
		System.out.println(sortMyArray(exampleArray));
	}
public static HashMap sortMyArray(double[] exampleArray){
	HashMap<Integer,Double> hashmap = new HashMap<Integer,Double>();
	Arrays.sort(exampleArray);
	for(int i=0;i<exampleArray.length;i++) {
		hashmap.put(i,exampleArray[i]);
	}
	return hashmap;
	
}
}
