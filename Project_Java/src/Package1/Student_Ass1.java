package Package1;

public class Student_Ass1 {

	int age;
	int rollNo;
	public void method1()
	{
		System.out.println("Welcome All");
	}
    public void method2()
    {
    	System.out.println("Automation is very easy");

    }
public static void main(String[] args)
{
	Student_Ass1 payal = new Student_Ass1();
	payal.method1();
	payal.method2();
	payal.age=20;
	payal.rollNo=9879;
	System.out.println(payal.age);
	System.out.println(payal.rollNo);	
}
}

