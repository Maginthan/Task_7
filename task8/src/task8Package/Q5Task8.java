package task8Package;

import java.util.Scanner;

/*Write a program to check if a number is prime or not.*/
public class Q5Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// First condition to check whether it i 0 or 1 no prime numbers.
		if (num <= 1) {
			System.out.print("The entered number " + num + " is not a prime number");
			return;
		}

		// For loop to get the number is divisible by itself using %.
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.print("The entered number " + num + " is not a prime number");
				return;
			}
		}

		// Finally if the above two condition fails it is then a prime number
		System.out.print("The entered number " + num + " is a prime number");

	}

}

/*OUTPUT
Enter a number: 3

The entered number 3 is a prime number
*/