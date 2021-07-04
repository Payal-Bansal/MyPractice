package Package1;

public class Student_Ass12 { // use final to check for Ass13
	static int a;
	int b;
	public final static void Method1() //use final to check for final method
	{
		System.out.println("I am a static method");
		a=a+1;
	}
	public void Method2()
	{
		System.out.println("I am a non static method");
		b=a;
	}
public static void main(String[] args) {
	a=12;
	Student_Ass12.Method1();
	System.out.println(a);
	Student_Ass12 obj=new Student_Ass12();
	obj.Method2();	
	System.out.println(obj.b);
}
}
