package Week6;

/*
 * Write a program that would print the information (name, year started, salary, address) 
 * for three employees by creating a class named 'Employee'. 
 * There should be a row that indicates type of information and 
 * three rows for three employeees in spreadsheet format with tabs in between columns.
 */
public class Employee {
	String name = "";
	int startedYear = 0;
	double salary = 0;
	String adress = "";

	public static void main(String[] args) {

		Employee john = new Employee("john", 1999, 1200, "NewYork");
		Employee anabelle = new Employee("anabelle", 1998, 1205, "NewYork");
		Employee bruce = new Employee("bruce", 1997, 1208, "NewYork");
		System.out.println("\tName" + "\tStarted year" + "\tSalary" + "\tAdress");
		john.PrintEmployee();
		anabelle.PrintEmployee();
		bruce.PrintEmployee();

	}

	public Employee(String name, int startedYear, double salary, String adress) {
		this.name = name;
		this.startedYear = startedYear;
		this.salary = salary;
		this.adress = adress;

	}

	public void PrintEmployee() {
		// Always 8
		if (this.name.length() < 8) {
			System.out.println("\t" + this.name + "\t\t" + this.startedYear + "\t" + this.salary + "\t" + this.adress);
		} else {
			System.out.println("\t" + this.name + "\t" + this.startedYear + "\t" + this.salary + "\t" + this.adress);
		}
	}
}
