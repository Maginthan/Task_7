package task8Package;

import java.util.Scanner;

/*Have a variable store an integer. Create an if statement to find out if it's an even number. Hint: Use operator %.*/

public class Q2Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to check whether it is even number or not: ");
		int num = sc.nextInt();

		// Using if statements and if the num gives 0 reminder when divided by 2 it is
		// even else odd
		if (num % 2 == 0) {
			System.out.println("The entered number " + num + " is an even number");
		} else {
			System.out.println("The entered number " + num + " is not an even number");
		}

	}
}
