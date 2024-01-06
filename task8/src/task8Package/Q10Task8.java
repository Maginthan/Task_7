package task8Package;

import java.util.Scanner;

//Write a program to Count Number of Digits in an Integer.
public class Q10Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		// Convert the Integer "num" to String and use length() to get the digit count.
		System.out.println("The entered number " + num + " has count: " + String.valueOf(num).length());

	}

}
