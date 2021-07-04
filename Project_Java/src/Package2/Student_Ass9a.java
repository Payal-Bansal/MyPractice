package Package2;
import Package1.Student_Ass9;
public class Student_Ass9a {
	public void method3()
{
	System.out.println("Method of Class 2");
}
public void method4()
{
	System.out.println("Calling the method of Class 1 from Class 2");
}
public static void main(String[] args) {
	
	Student_Ass9 calln=new Student_Ass9();
	calln.method1();
	calln.method2();
	System.out.println(calln.age);
	System.out.println(calln.rollNo);
}
}
