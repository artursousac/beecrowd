package edu.exercicios;

import java.util.Scanner;
/*
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.

Input
The input file will contain 2 integer numbers.

Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all.
 */

public class Ex1001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = scan.nextInt();
		
		System.out.println("X = "+(a+b));

	}

}
