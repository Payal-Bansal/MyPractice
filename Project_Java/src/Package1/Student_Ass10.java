package Package1;

import java.util.Scanner;

public class Student_Ass10 
{
	public int mul(int x1, int x2){
		int m=x1*x2;
		System.out.println("Multiplaction Result:" +m);
	return m;
		}
	public int sum(int x1,int x2){
		int s =x1+x2;
		System.out.println("Addition Result:" +s);
		return s;
		}
	public int sub(int x1,int x2) {
		int s1 = x1-x2;
		System.out.println("Subtraction Result:" +s1);
		return s1;
	}
	public int div(int x1, int x2){
		int d = x1/x2;
		System.out.println("Final Result of the query is:" +d);
		return d;
		}	
public static void main(String[] args)
{
   System.out.println("Enter value of x1:");
   Scanner s=new Scanner(System.in);
	int x1=s.nextInt();
   System.out.println("Enter value of x2:");
   int x2=s.nextInt();
   System.out.println("Enter value of x3:");
   int x3=s.nextInt();
   System.out.println("Enter value of x4:");
   int x4=s.nextInt();
   System.out.println("Enter value of x5:");
   int x5=s.nextInt();
   System
   .out.println("Enter value of x6:");
   int x6=s.nextInt();
  
   Student_Ass10 OprScan=new Student_Ass10();
   int Mult=OprScan.mul(x1, x2);
   int Add=OprScan.sum(Mult, x3);
   int Add2=OprScan.sum(Add, x4);
   int Minus=OprScan.sub(Add2, x5);
   float Divs=OprScan.div(Minus, x6);
	}
}
