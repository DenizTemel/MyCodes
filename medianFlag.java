package Week4;

/*
 * Write a code that finds the median of given integers. 
 * That is, when ordered, the number in the middle; or if there are two numbers in the middle, their average. 
 * Here are some examples:java median 3 5 8
 * The median of 3 5 8 is 5
 * java median 8 5 4 -10
 * The median of 8 5 4 -10 is 4.5
 * Hint: First depending on the size of the given array, decide if there would be a number in the middle (odd sized arrays) or not (even sized arrays). 
 * Use another array (say flag) and iteratively compute max and min of the given numbers if they are unflagged - initially all are unflagged so start with all false (if array of booleans) or zero (if array of integers) on the flag array.
 * Flag the numbers chosen, that is set maximum's and minimum's associated flags to true or one. 
 * Repeat finding this min/max among unflagged for the required number of steps, and you will be left with one or two unflagged numbers. 
 * Use that information to compute the median.
 */
public class medianFlag {

	public static void main(String[] args) {

		// Find the lenght of the array
		int numberCount = args.length;

		// If it is odd
		if (numberCount % 2 == 1) {

			// find the middle index
			int targetIndex = (numberCount / 2);
			// Print it
			System.out.println("Median is " + args[targetIndex] + " .");

			// Otherwise
		} else {

			// initialize 2 int arrays
			int[] numbers = new int[numberCount]; // holds the numbers as int
			int[] flag = new int[numberCount]; // holds the positions

			// assign first values
			for (int i = 0; i < numberCount; i++) {
				numbers[i] = Integer.parseInt(args[i]); // the inputs
				flag[i] = 0; // all 0
			}

			// Iterate until 2 numbers remain
			// each iteration I will flag 2 positions -> divide 2
			// I want to remain 2 -> subtruct 2
			for (int i = 0; i < (numberCount - 2) / 2; i++) {
				// initialize max min and their index
				int maxIndex = 0, minIndex = 0;
				int max = -9999, min = 9999;

				// iterate all numbers
				for (int j = 0; j < numberCount; j++) {
					// If it is not flagged yet
					if (flag[j] == 0) {
						// check if it is max
						if (numbers[j] > max) {
							max = numbers[j];
							maxIndex = j;
						}
						// check if it is min
						if (numbers[j] < min) {
							min = numbers[j];
							minIndex = j;
						}
						//Debug
						//System.out.println("Max:"+max+"\nMax index:"+maxIndex+"\nMin:"+min+"\nMin index:"+minIndex);
					}
				}
				//Debug
                //System.out.println("Max:"+max+"\nMax index:"+maxIndex+"\nMin:"+min+"\nMin index:"+minIndex);
				// After finding non-flagged min and max
				// flag them
				flag[maxIndex] = 1;
				flag[minIndex] = 1;

			}

			// To find the average of 2 non-flagged numbers
			// initialize a sum
			float sum = 0;

			// interate all numbers
			for (int i = 0; i < flag.length; i++) {

				// if it is unflagged
				if (flag[i] == 0) {
					// sum
					sum += numbers[i];
				}
			}

			// divide by 2
			float average = sum / 2;

			// print
			System.out.println("The median is " + average);

		}
	}
}
