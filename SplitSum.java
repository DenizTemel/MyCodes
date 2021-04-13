package Week5;
/*
 * Given an array, write a method that returns true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the remaining numbers on the other side.
 */

public class SplitSum {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 7 };
		System.out.println("Can we split? : " + split(numbers));
	}

	public static boolean split(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int sum_prev = 0;
			int sum_later = 0;
			for (int j = 0; j <= i; j++) {
				sum_prev += numbers[j];
			}
			for (int k = numbers.length - 1; k > i; k--) {
				sum_later += numbers[k];
			}
			if (sum_prev == sum_later) {
				return true;
			}
		}

		return false;

	}

}
