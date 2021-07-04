package Package1;

public class Student_Ass8a extends Student_Ass7 {

	public void Hierarchial()
	{
		System.out.println("This is Hierarchial Inheritance");
	}
	public static void main(String[] args) {
		Student_Ass8a HierInh=new Student_Ass8a();
		HierInh.Hierarchial();
		HierInh.Method2Parent(1,2);
	}
}
