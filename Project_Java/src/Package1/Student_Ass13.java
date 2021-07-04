package Package1;
public final class Student_Ass13 extends Student_Ass12 {
public final void Default()
{
	System.out.println("This is a Default Method");
	this.Method4(1,2,3,4);	
}
public void Method1(int a)
{
	System.out.println("This is 1 Parameterised Method");
	this.Method3(1,2,3);
}
public void Method2(int a, int b)
{
	System.out.println("This is 2 Parameterised Method");
	}
public void Method3(int a, int b, int c)
{
System.out.println("This is 3 Parameterised Method");
this.Method2(1,2);
}
public void Method4(int a, int b, int c,int d)
{
System.out.println("This is 4 Parameterised Method");
this.Method1(1);
}
public static void main(String[] args) 
{
	Student_Ass13 sessionconst =new Student_Ass13();
	sessionconst.Default();
	sessionconst.Method1(); // Adding to call final method
}
}
