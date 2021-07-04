package Package1;
public class Student_Ass2 {
	public int sum(int a, int b){
	int c;
	c=a+b;
	System.out.println("Sum of A&B is " +c);
	return c;}
	public int sub(int d,int e){
	//	int f;
	//	f = d-e;
	//	System.out.println("Sub of D&E is " +f);
		return d-e;}
	public int mul(int g, int h){
	//	int i;
	//	i=g*h;
		System.out.println("Mult of g&H is " +(g*h));
		return g*h;}
public void div( int j, int k){
	System.out.println("Final result of string is "+(j/k));}
public static void main(String[] args)
{Student_Ass2 calculate=new Student_Ass2();
int Addition=calculate.sum(10, 2);
int SubAddition=calculate.sum(Addition,2);
int Subtraction=calculate.sub(SubAddition, 2);
int Multiplication=calculate.mul(Subtraction,2);
calculate.div(Multiplication,2);
	}
}
