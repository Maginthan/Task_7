package task8Package;

import java.util.Scanner;

/*Write a program to print the length of the given string. String msg="Guvi Geek"*/

public class Q7Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating scanner object to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String Str = sc.nextLine();
		
		//Printing the entered string length using the .length() method
		System.out.print("The length of the entered string " + Str + " is: " + Str.length());
	}

}
