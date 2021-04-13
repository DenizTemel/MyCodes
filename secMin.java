package Week3;

/*
 *  Write a code that reports the second smallest "value" in a given sequence.
 * The numbers are given with the java call. 
 * Let the name of the program be secMin so we should be able to call it using the commandjava secMin -numbers-
 * Note that the min and second min values cannot be the same.
 * java secMin 3 5 28 28 9 22 -5 -3 6 0
 * second min is -3
 */
import java.util.Arrays;

public class secMin {

	public static void main(String[] args) {
		double firstmin = 0;
		double secondmin = 0;
		// Initialize an integer array
		int[] numbers = new int[args.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);

		}

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		firstmin = numbers[0];
		for (int i = 0; i < args.length; i++) {
			// In here, because we sorted the first element which is not equal to firstmin will be the secondmin.
			// We are taking into consideration of there might me couple same firstmin  elements in the array.
			if (numbers[i] != firstmin) {
				secondmin = numbers[i];
				// It takes the first unequal element and breaks.
				// It works because we sorted in the beginning.
				break;
			}
		}
		System.out.println("Second min is:" + secondmin);

	}

}
