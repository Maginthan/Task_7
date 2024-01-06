package task8Package;

import java.util.Scanner;

/*
Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console
 */

public class Q4Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating scanner object to get two user inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of B: ");
		int b = sc.nextInt();
		System.out.println();

		System.out.println("The value of A is " + a);
		System.out.println("The value of B is " + b);
		System.out.println("*******************************");
		System.out.println();

		// Create a variable to temporary save b value to c
		int c;

		// Assign the saved c value having b to a
		c = b;
		b = a;
		a = c;

		System.out.println("The value of A is now " + a);
		System.out.println("The value of B is now " + b);

	}

}

/*OUTPUT
 Enter the value of A: 5
 Enter the value of B: 3
 
 The value of A is 5
 The value of B is 3
 **************************
 The value of A is now 3
 The value of B is now 5
 */
