package task8Package;

import java.util.Scanner;

//Write a program to check whether the person is a senior citizen or not.
public class Q9Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");

		int age = sc.nextInt();

		/*
		 * Using if condition to check whether the age is above or equal to 60 to check
		 * the senior citizen
		 */
		if (age >= 60) {
			System.out.println("As per your age " + age + " .You are a Senior citizen");
		} else {
			System.out.println("As per your age " + age + " .You are not a Senior citizen");
		}
	}

}

/*OUTPUT
Enter your age: 60
As per your age 60 .You are a Senior citizen
*/