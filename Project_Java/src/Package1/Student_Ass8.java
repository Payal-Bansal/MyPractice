package Package1;

public class Student_Ass8 extends Student_Ass7a {

	public void MultiLevel()
	{
		System.out.println("This is multi-level inheritance");
	}
	public static void main(String[] args) {
		Student_Ass8 inh=new Student_Ass8();
		inh.MultiLevel();
		inh.DefaultParent();
		inh.Method1(1);
	}
	
}
