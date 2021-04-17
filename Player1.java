package Week8;

import java.util.HashMap;

class Player1 {

	public String name;
	public int number;

	public Player1(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public static Player1[] hashSort(HashMap<Integer, String> efes) {

		Player1[] players = new Player1[efes.size()];
		int index = 0;
		for (int n : efes.keySet()) {
			Player1 currentPlayer = new Player1(efes.get(n), n);
			players[index] = currentPlayer;
			index++;
		}

		return players;

	}

}
