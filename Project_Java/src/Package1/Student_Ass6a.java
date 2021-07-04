package Package1;
public class Student_Ass6a extends Student_Ass6 {
public Student_Ass6a()
{
	super(1,2);
	System.out.println("This is a Child Default Constructor");
}
public Student_Ass6a(int a)
{
	this(1,2,3);
	System.out.println("This is 1 Child Parameterised Constructor");
}
public Student_Ass6a(int a, int b)
{
	this(1,2,3,4);
	System.out.println("This is 2 Child Parameterised Constructor");
	}
public Student_Ass6a(int a, int b, int c)
{
this();
System.out.println("This is 3 Child Parameterised Constructor");	
}
public Student_Ass6a(int a, int b, int c,int d)
{
	this(1);
System.out.println("This is 4 Child Parameterised Constructor");	
}

public static void main(String[] args) 
{
	Student_Ass6a InhSup =new Student_Ass6a(1,2);	
}
}
