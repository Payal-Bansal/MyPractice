package Package1;
public class Student_Ass4 {
public Student_Ass4()
{
	this(1,2,3);
	System.out.println("This is a Default Constructor");
}
public Student_Ass4(int a)
{
	this();
	System.out.println("This is 1 Parameterised Constructor");
}
public Student_Ass4(int a, int b)
{
	this(1,2,3,4);
	System.out.println("This is 2 Parameterised Constructor");
	}
public Student_Ass4(int a, int b, int c)
{
System.out.println("This is 3 Parameterised Constructor");	
}
public Student_Ass4(int a, int b, int c,int d)
{
	this(1);
System.out.println("This is 4 Parameterised Constructor");	
}

public static void main(String[] args) 
{
	Student_Ass4 sessconst =new Student_Ass4(1,2);	
}
}
