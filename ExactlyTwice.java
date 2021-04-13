package Week5;

/*
 * Given an array of integers, write a method that returns true if the array repeats a number "exactly" twice somewhere, and returns false otherwise.
 * Optional: Print out the location and the number.
 */

public class ExactlyTwice {

	public static void main(String[] args) {
		int[] numbers = { 1, 7, 2, 3, 3, 4, 5, 6, 7, 7 };
		System.out.println("This array repeats a number exactly twice:" + existTwice(numbers));

	}

	public static boolean existTwice(int[] numbers) {
		int secondLocation = 0;
		//To find how many are there in each number
		for (int i = 0; i < numbers.length; i++) {
			int time = 0;
			//To compare numbers
			for (int j = 0; j < numbers.length; j++) {
				//If they are equal we increase time by 1.
				if (numbers[i] == numbers[j]) {
					time++;
					//To keep j value
					secondLocation = j;
				}

			}
			//If a number is repeated exactly twice, it prints the number and its locations.
			if (time == 2) {
				System.out.println("The number existing twice is " + numbers[i] + "\nlocation 1 :" + i
						+ "\nlocation 2 :" + secondLocation);
				return true;
			}
		}
        //If it doesn't repeat exactly twice, it returns false.
		return false;
	}
}
