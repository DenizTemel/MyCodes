package Week7;

import java.util.ArrayList;
import java.util.Random;

/*
 * Assume that there is a slot machine with 6 different outcomes;
 * Tree, Apple, Star, Ball, Flower, Cat. 
 * There are three slots, and in each slot, all six possibilities are equally likely. 
 * If all three slots show the same outcome at the end of a round, you get back three times your bet.
 * If two of the slots have the same outcome, you receive twice your bet. 
 * If none of the slots have the same output, you do not win anything.
 * The initial bet amount is $5. 
 * Each time you win (by doubling or tripling), you double your next bet.
 * Each time you lose, you bet the same amount as you did in the previous round. 
 * If you do not have enough money, you bet whatever you have (all-in).
 * You will stop playing after 200 rounds, or when you are broke.
 * The output should look like this:Initial amount: 100
 * The slot machine was played 189 rounds. 
 * The bet was tripled 3 times, doubled 5 times, and lost 181 times. 
 * The final money you have is 0.
 */

public class SlotMachine {
	public static void main(String[] args) {
		ArrayList<Integer> trackBet = new ArrayList<Integer>();
		String[] outcomes = { "Tree", "Apple", "Star", "Ball", "Flower", "Cat" };
		int yourMoney = 1000;
		int initialBet = 5;
		int roundLimit = 200;
		int playedRounds = 0;
		int tripledTimes = 0;
		int doubledTimes = 0;
		int lostTimes = 0;
		System.out.println(slotMachine(trackBet, outcomes, yourMoney, initialBet, roundLimit, playedRounds,
				tripledTimes, doubledTimes, lostTimes));
	}

	public static String slotMachine(ArrayList<Integer> trackBet, String[] outcomes, int yourMoney, int initialBet,
			int roundLimit, int playedRounds, int tripledTimes, int doubledTimes, int lostTimes) {

		int initialMoney = yourMoney;
		String slot1, slot2, slot3;
		// Creating random statement
		Random random = new Random();
		// Can you bet?
		if (yourMoney >= initialBet) {
			while (playedRounds < roundLimit && yourMoney >= 0) {
				// All in condition
				if (yourMoney < initialBet) {
					initialBet = yourMoney;
					// Game over
					if (yourMoney == 0) {
						break;
					}
				}

				yourMoney -= initialBet;
				playedRounds++;
				// Equalizing slot outcomes with a random dice outcome which is connected with the index of outcomes array
				slot1 = outcomes[random.nextInt(6)];
				slot2 = outcomes[random.nextInt(6)];
				slot3 = outcomes[random.nextInt(6)];
				// Cituation of initial bet per round
				trackBet.add(initialBet);
				// If all three slots have same outcomes
				if (slot1 == slot2 && slot2 == slot3) {

					yourMoney += initialBet * 3;
					initialBet = initialBet * 2;
					tripledTimes++;
					// If two of the slots have the same outcome
				} else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {

					yourMoney += initialBet * 2;
					initialBet = initialBet * 2;
					doubledTimes++;
					// If none of the slots have the same outcome
				} else {
					lostTimes++;
				}

			}

		}
		System.out.println(trackBet);
		String result = ("--------------------" + "\nInitial amount: " + initialMoney + "\nThe slot machine was played "
				+ playedRounds + " rounds." + "\nThe bet was tripled " + tripledTimes + " ,doubled " + doubledTimes
				+ " , and lost " + lostTimes + " times." + "\nThe final money you have is " + yourMoney + ".");

		return result;

	}
}
