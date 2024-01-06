package task8Package;

import java.util.Scanner;

/*Write a Java program that declares four integer variables: a, b, c, and d.
Then, write an if statement that checks whether the sum of a and b is greater than the sum of c and d. 
If the condition is true, the program should output a message indicating that the sum of a and b is greater than the sum of c and d. */

public class Q1Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner object to get user input with four values a,b,c,d
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value for b: ");
		int b = sc.nextInt();
		System.out.print("Enter the value for c: ");
		int c = sc.nextInt();
		System.out.print("Enter the value for d: ");
		int d = sc.nextInt();

		// using If condition with addition operator and greater than operator to see
		// which two values are greater
		if ((a + b) > (c + d)) {
			System.out.print("The sum of a and b is greater than c and d");
		} else {
			System.out.print("The sum of c and d is greater than a and b");
		}

	}

}

/*OUTPUT
Enter the value of a: 4
Enter the value of b: 5
Enter the value of c: 1
Enter the value of d: 3

The sum of a and b is greater than c and d
*/