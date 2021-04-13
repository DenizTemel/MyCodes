package Week7;

import java.util.Random;
/*
 * Write a method that generates a phone number. The phone number must start with 05 and must have 11 digits total: 
 * 05** *** ** **. 
 * The numbers after 05 will be generated randomly one by one. 
 * Method should return the phone number as a string with the spacing described
 * in the format 05** *** ** **.
 */
public class RandomPhoneNumber {
	public static void main(String[] args) {
		System.out.println("Generated phone number : " + phoneNumberGenerator());
	}

	public static String phoneNumberGenerator() {
		// Creating random statement
		Random random = new Random();
		String number = "05";
		// Calling random numbers before the first space
		for (int i = 0; i < 2; i++) {
			// () içindeki sayýyý görmüyor. 0'dan 9'a kadar.
			int digit = random.nextInt(10);
			number += digit;
		}
		number += " ";
		for (int i = 0; i < 3; i++) {
			int digit = random.nextInt(10);
			number += digit;
		}
		number += " ";
		for (int i = 0; i < 2; i++) {
			int digit = random.nextInt(10);
			number += digit;
		}
		number += " ";
		for (int i = 0; i < 2; i++) {
			int digit = random.nextInt(10);
			number += digit;
		}
		return number;

	}

}
