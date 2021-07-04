package Package1;
public class Student_Ass6 {
public Student_Ass6()
{
	this(1,2,3);
	System.out.println("This is a Parent Default Constructor");
}
public Student_Ass6(int a)
{
	this();
	System.out.println("This is 1 Parent Parameterised Constructor");
}
public Student_Ass6(int a, int b)
{
	this(1,2,3,4);
	System.out.println("This is 2 Parent Parameterised Constructor");
	}
public Student_Ass6(int a, int b, int c)
{
System.out.println("This is 3 Parent Parameterised Constructor");	
}
public Student_Ass6(int a, int b, int c,int d)
{
	this(1);
System.out.println("This is 4 Parent Parameterised Constructor");	
}
}
