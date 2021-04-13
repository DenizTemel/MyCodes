package Week7;

import java.util.Random;

/*
 Write a Java class called playRoulette that gets an integer input from the user between 1-36. Then 2 dice are rolled randomly and their output is printed on the screen. Print out whether the user made the right guess for the multiplication of the two dice values.java playRoulette 24
The dice outcomes are 2 and 6.
You lose!

java playRoulette 28
Hey genius! You lost before the dice are rolled!

java playRoulette 15
The dice outcomes are 3 and 5.
You win!

java playRoulette 17
Hey genius! You lost before the dice are rolled!
 */
public class playRoulette {
	public static void main(String[] args) {
		if (args.length == 1) {
			if (Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) < 37) {
				int number = Integer.parseInt(args[0]);
				if (number == 7 || number == 11 || number == 13 || number == 14 || number == 17 || number == 19
						|| number == 21 || number == 22 || number == 23 || number == 26 || number == 27 || number == 28
						|| number == 29 || number == 31 || number == 32 || number == 33 || number == 34
						|| number == 35) {
					System.out.println("Hey genius! You lost before the dice are rolled!");
				} else {
					System.out.println(playRoulette(number));
				}
			} else {
				System.out.println("Enter a number between 1-36 !");
			}
		} else {
			System.out.println("Enter just 1 number !");
		}

	}

	public static String playRoulette(int number) {
		String win = "You win !";
		String lose = "You lose!";
		// Creating random statement
		Random random = new Random();
		// Dice can come between 0-6
		int first_dice = random.nextInt(6) + 1;
		int second_dice = random.nextInt(6) + 1;
		// Printing out the outcome of dice to screen
		System.out.println("The dice outcomes are " + first_dice + " and " + second_dice);
		int multiplication = first_dice * second_dice;
		if (number == multiplication) {
			return win;
		} else {
			return lose;
		}
	}
}
