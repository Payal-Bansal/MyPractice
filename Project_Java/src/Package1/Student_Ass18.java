package Package1;

import java.util.Scanner;

public class Student_Ass18 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(+n+ "*"  +i+  "=" +(n*i));
		}
	}
}
