package Week3;

import java.util.Arrays;

/*
 * Write a code that reports the second largest number in a given sequence.
 * The numbers are given with the java call. 
 * Let the name of the program be secMax so we should be able to call it using the commandjava secMax -numbers-
 * Note that max and second max might be the same.
 * java secMax 3 5 7 8 9 22 -5 -3 6 0
 * second max is 9
 */
public class secMax {

	public static void main(String[] args) {
		int firstmax = 0;
		int secondmax = 0;
		// Initialize an integer array
		int[] numbers = new int[args.length];
		// Set arrays elements into initialized array.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);

		}

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		// Set the last element as first max.
		// Last element will be the maximum because we sorted.
		firstmax = numbers[numbers.length - 1];
		// We go back from last element.
		for (int i = args.length - 1; 0 <= i; i--) {
			// When it is the first time not equal to the last element will be the second
			// max because we sorted.
			// We break the iteration after we take second max.
			if (numbers[i] != firstmax) {
				secondmax = numbers[i];

				break;
			}
		}
		System.out.println("Second min is:" + secondmax);

	}

}
