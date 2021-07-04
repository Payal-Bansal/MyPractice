package Package1;

import java.util.Scanner;

public class Student_Ass15 {
	
	public void Prime(int n) {
		int Half=n/2;
		int a=0;
		for (int i =2;i<=Half;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");
				a=1;
				break;
			}	
		}
		if(a==0)
		{
			System.out.println("Number is prime");
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		Student_Ass15 PNo=new Student_Ass15();
		PNo.Prime(n);	
	}
}
