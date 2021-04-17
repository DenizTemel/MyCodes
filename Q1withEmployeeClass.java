package Week8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Q1withEmployeeClass {

	/*
	 * Create an Employee table in Excel with the following column names: Employe ID
	 * (Should be unique integers), First Name (String), Last Name (String), Years
	 * spent in the company (integer). Create 15 random instances (rows) for this
	 * table and save it as a csv file. Read the csv file in Java and write methods
	 * to compute the answers to the following questions: Are there any employees
	 * with the same last name? What is the first name that appears the most? What
	 * is the employee id for the most experienced employee (in terms of years spent
	 * in company)?
	 */

	public static void main(String[] args) {

		HashMap<Integer, Employee> data = new HashMap<Integer, Employee>();
		BufferedReader bufferedReader = null;
		String currentLine = null;

		try {

			FileReader readingFile = new FileReader("src\\Week8\\Week8_Q1_IE246.csv");

			bufferedReader = new BufferedReader(readingFile);

			// Titles
			currentLine = bufferedReader.readLine();

			// Create object
			while ((currentLine = bufferedReader.readLine()) != null) {
				String[] content = currentLine.split(";");

				Employee currentEmployee = new Employee(Integer.parseInt(content[0]), content[1], content[2],
						Integer.parseInt(content[3]));

				data.put(Integer.parseInt(content[0]), currentEmployee);

			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

		findSameSurname(data);
		findMostUsedFirstName(data);
		mostExperiencedEmployee(data);

	}

	public static void findSameSurname(HashMap<Integer, Employee> data) {

		for (int firstID : data.keySet()) {

			for (int secondID : data.keySet()) {

				if (firstID != secondID) {
					String surname1 = data.get(firstID).surname;
					String surname2 = data.get(secondID).surname;

					if (surname1.equals(surname2)) {
						System.out.println("Surname " + surname1 + " is same with " + surname2);
					}
				}
			}

		}

	}

	public static void findMostUsedFirstName(HashMap<Integer, Employee> data) {

		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();

		for (int ID : data.keySet()) {

			String name = data.get(ID).name;

			if (nameCount.get(name) == null) {
				nameCount.put(name, 1);
			} else {
				int exCount = nameCount.get(name);
				nameCount.put(name, exCount + 1);
			}

		}

		HashMap<Integer, String> countName = new HashMap<Integer, String>();
		for (String name : nameCount.keySet()) {
			countName.put(nameCount.get(name), name);
		}

		int maxCount = 0;
		for (int count : nameCount.values()) {
			if (count > maxCount) {
				maxCount = count;
			}
		}

		System.out.println("Most used name is " + countName.get(maxCount) + " and used " + maxCount + " times");

	}

	public static void mostExperiencedEmployee(HashMap<Integer, Employee> data) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		for (int i : data.keySet()) {
			employees.add(data.get(i));
		}

		int mostExperience = -1000;
		Employee experienced = null;
		for (Employee e : employees) {
			if (e.spendYears > mostExperience) {
				experienced = e;
				mostExperience = e.spendYears;
			}
		}

		System.out.println(
				"Most experienced employee is " + experienced.name + " with " + experienced.spendYears + " years!!");
	}

}
