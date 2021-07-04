package Package1;
public class Student_Ass7a extends Student_Ass7 {
public void Default()
{
	System.out.println("This is a Child Default Method");
	this.Method2(1,2);	
}
public void Method1(int a)
{
	System.out.println("This is 1 Child Parameterised Method");
	this.Method4(1,2,3,4);
}
public void Method2(int a, int b)
{
	System.out.println("This is 2 Child Parameterised Method");
	this.Method1(1);
	}
public void Method3(int a, int b, int c)
{
super.DefaultParent();
System.out.println("This is 3 Child Parameterised Method");
this.Default();
}
public void Method4(int a, int b, int c,int d)
{
System.out.println("This is 4 Child Parameterised Method");
}
public static void main(String[] args) // Remove in case of Multi-level Inheritance
{       //
	Student_Ass7a InhSup =new Student_Ass7a(); //
	InhSup.Method3(1,2,3);//
}//
}
