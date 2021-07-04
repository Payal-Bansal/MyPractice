package Package1;

import java.util.Scanner;

public class Student_Ass14 {
	int a,b,c;
	public void Swapping_With_Variable(int a, int b) {
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping using third variable");
		System.out.println("Value of first variable after swapping:" +a);
		System.out.println("Value of second variable after swapping:" +b);
	}
	public void Swapping_Without_Variable(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping without third variable");
		System.out.println("Value of first variable after swapping:" +a);
		System.out.println("Value of second variable after swapping:" +b);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of first variable before swapping:");
		int a=s.nextInt();
		System.out.println("Enter calue of second variable after swapping:");
		int b=s.nextInt();
		Student_Ass14 swap=new Student_Ass14();
		swap.Swapping_Without_Variable(a, b);
		swap.Swapping_Without_Variable(a, b);
	}
}
