package task8Package;

import java.util.Scanner;

//Write a program To print "Welcome to Guvi" 10 times.

public class Q8Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the times you want to print" + " * " + "Welcome to Guvi" + " *" + ": ");

		int times = sc.nextInt();

		// Using For loop to print the "Welcome to Guvi" based on user input
		for (int i = 1; i <= times; i++) {
			System.out.println("Welcome to Guvi");
		}

	}

}

/*OUTPUT
Enter the times you want to print *Welcome to Guvi* : 
10

Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
Welcome to Guvi
*/