package Package1;

import java.util.Scanner;

public class Student_Ass19 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int a=1;
		for(int i=n;i>=1;i--){
			a=a*i;
		}	
		System.out.println("Factorial of number: " +a);	
}}
