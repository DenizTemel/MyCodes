package Week5;

/*
 * A nonnegative integer is called a palindrome if it reads forward and backward in the same way. 
 * For example, the numbers 5, 121, 3443, and 123454321 are palindromes. 
 * Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; 
 * otherwise, it returns false.
 */
public class Palindrome {

	public static void main(String[] args) {
		int number = 3443;
		System.out.println("Is it a palindrome? : " + isPalindrome(number));
	}

	public static boolean isPalindrome(int number) {
		int palindrom = number;
		int count = 0;
		while (palindrom > 0) {
			palindrom /= 10;
			count++;
		}
		// We found count to use it as a length of new array.
		int[] value = new int[count];
		count = 0;
		palindrom = number;
		while (palindrom > 0) {
			value[count] = palindrom % 10;
			count++;
			palindrom /= 10;
		}
		// To not compare same thing many time we divided value.length/2. ( 0-3 ile 3-0
		// karþýlaþtýrmamalý.)
		for (int i = 0; i < value.length / 2; i++) {
			// Compare 0-3,1-2,...
			if (value[i] != value[value.length - 1 - i]) {
				return false;
			}
		}

		return true;

	}

}
