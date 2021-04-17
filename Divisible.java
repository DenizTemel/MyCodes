package Week8;

import java.util.HashMap;

/*
 * Write a method that takes a HashMap<String, Integer>. 
 * The method should identify two integers from the values of the HashMap,
 * where the first one is divisible by the second. 
 * The method must print keys of all such pairs of numbers on console. 
 * Pairs of keys cannot be the same. 
 * Suppose I have the following keys and values in HashMap named hm:
"A":20
"B":120
"C":40
"D":17
"E":51
I should be able to call divisibles(hm) and it should only print out the associated keys as:
B is divisible by A.
B is divisible by C.
E is divisible by D.
 */

public class Divisible {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("A", 20);
		hm.put("B", 120);
		hm.put("C", 40);
		hm.put("D", 17);
		hm.put("E", 51);

		divisibles(hm);

	}

	public static void divisibles(HashMap<String, Integer> list) {

		for (String first : list.keySet()) {

			for (String second : list.keySet()) {

				if (!first.equals(second)) {

					if ((list.get(first) % list.get(second)) == 0) {

						System.out.println(first + " is divisible by " + second);

					}

				}

			}

		}

	}

}
