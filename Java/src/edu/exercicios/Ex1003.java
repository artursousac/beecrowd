package edu.exercicios;
/*
 * Read two integer values, in this case, the variables A and B. After this, calculate the sum between them and assign it to the variable SOMA.
 * Write the value of this variable.
 * 
 * Input: The input file contains 2 integer numbers.
 * 
 * Output: Print the message "SOMA" with all the capital letters, with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B.
 * Like all the problems, don't forget to print the end of line, otherwise you will receive "Presentation Error"
 * 
 */


import java.util.Scanner;

public class Ex1003 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner (System.in);
			
		int a = scan.nextInt();
		int b = scan.nextInt();
		int soma = a+b;
		
		System.out.printf("SOMA = %d\n", soma); //O BeeCrowd exige o "\n" no final.
			
			
	}

}
