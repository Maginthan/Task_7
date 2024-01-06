package task8Package;

import java.util.Scanner;

//Write a program to print the factorial of a given number. For example: 5! = 120  
public class Q6Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you wish to find the factorial: ");

		int num = sc.nextInt();

		// Variable to update the factorial based on the input number it corresponds to
		int fact = 1;

		// Using For loop to update the fact variable based on the number entered.
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial for entered number " + num + " is: " + fact);
	}

}