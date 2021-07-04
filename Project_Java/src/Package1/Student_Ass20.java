package Package1;

import java.util.Scanner;

public class Student_Ass20 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number till the time Finocci series would print:");
		int n=s.nextInt();
		System.out.println("Enter the first number: ");
		int a=s.nextInt();
		System.out.println("Enter the second number: ");
		int b=s.nextInt();
		for (int i=1;i<=n;i++)
		{
			int sum = a+b;
			System.out.println( +sum);
			a=b;
			b=sum;
		}
			
}}
