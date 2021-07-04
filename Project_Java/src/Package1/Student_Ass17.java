package Package1;

import java.util.Scanner;

public class Student_Ass17 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int sum=0;
		int old_num=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;		
		}
		if (old_num==sum)
		{
			System.out.println("No is a Armstrong number");
			}
		else
		{
			System.out.println("No is not a Armstrong number");
		}
}}
