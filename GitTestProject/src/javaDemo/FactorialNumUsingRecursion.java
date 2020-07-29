package javaDemo;

import java.util.Scanner;

public class FactorialNumUsingRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int num = sc.nextInt();
		int multi = fact(num);
		System.out.println("Factorial " + num + " : " + multi);
		sc.close();
	}

	public static int fact(int i) {

		if (i > 1) {
			return (i * fact(i - 1));
		}
		return i;

	}

}
