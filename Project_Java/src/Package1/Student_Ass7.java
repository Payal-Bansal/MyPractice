package Package1;
public class Student_Ass7 {
public void DefaultParent()
{
	System.out.println("This is a Parent Default Method");
	this.Method1Parent(1);	
}
public void Method1Parent(int a)
{
	System.out.println("This is 1 Parent Parameterised Method");
	this.Method3Parent(1,2,3);
}
public void Method2Parent(int a, int b)
{
	System.out.println("This is 2 Parent Parameterised Method");
	this.Method4Parent(1,2,3,4);
	}
public void Method3Parent(int a, int b, int c)
{
System.out.println("This is 3 Parent Parameterised Method");
this.Method2Parent(1,2);
}
public void Method4Parent(int a, int b, int c,int d)
{
System.out.println("This is 4 Parent Parameterised Method");
}
}
