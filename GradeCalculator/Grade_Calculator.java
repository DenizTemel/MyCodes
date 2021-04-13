package GradeCalculator;

import java.util.Scanner;
public class Grade_Calculator {
	
	/*
	 * 
	 *  Author: Deniz Temel	
	 *  Date: 2 Feb 2021
	 *  Github: https://github.com/SheWolfW
	 * 
	 */
	
	
	
	
	
 public static void main(String[] args) {
  double number;
  double number2;
  double number3;
  
    // Create a Scanner to get a data from user
    try (Scanner in = new Scanner(System.in)) {
    // Inform the user about the program
    System.out.println("WELCOME TO GRADÝNG PROGRAM");	
    // -------------- Midterm1 -------------
	System.out.println("Enter the first exam result:");
	number=in.nextInt();
	// -------------- Midterm1 -------------
	// -------------- Midterm2 -------------
	System.out.println("Enter the second exam result:");
	number2=in.nextInt();
	// -------------- Midterm2 -------------
	// -------------- Final -------------
	System.out.println("Enter the third exam result:");
	number3=in.nextInt();
	// -------------- Final -------------
    }
    // -------------- Average -------------
    double average=avr(number,number2,number3);
	System.out.println("The avergae of exams are:"+average);
	// -------------- Average -------------
	// -------------- Letter -------------
	String letterGrade="";
	if(average>=90) {
	 letterGrade="A";
	 
	}
	else if (average>=80) {
		letterGrade="B";
		
	}
	else if (average>=70) {
		letterGrade="C";
	}
	else {
		letterGrade="F";
	}
	// -------------- Letter -------------
	// -------------- Report -------------
	Report(number,number2,number3,average,letterGrade);
	// -------------- Report -------------
	 }
	
    //-------------- AverageCalculation -------------
 public static double avr(double number,double number2,double number3){
	 
	  return (number+number2+number3) / 3;	 
 }
	// -------------- AvergaeCalculation -------------  
    // Report:
       // This method reports the calculations to the screen
 public static void Report(double number, double number2, double number3, double average, String letterGrade ) {
    System.out.println("1st Midterm result:"+number);
	System.out.println("2nd Midterm result:"+number2);
	System.out.println("Final exam result:"+number3);
	System.out.println("Average:"+average);
	System.out.println("Grade"+letterGrade);
}
 
 
}
