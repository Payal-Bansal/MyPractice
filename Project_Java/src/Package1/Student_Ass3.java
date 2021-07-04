package Package1;
public class Student_Ass3 {
public int div( int j, int k){
	System.out.println("Div if J&K is "+(j/k));
return j/k;}
public int sub(int d,int e){
	int f;
	f = d-e;
	System.out.println("Sub of D&E is " +f);
	return f;}
public int sum(int a, int b){
int c;
c=a+b;
System.out.println("Sum of A&B is " +c);
return c;}
public void mul(int g, int h){
//	int i;
//	i=g*h;
	System.out.println("Final result of string is " +(g*h));}
public static void main(String[] args)
{Student_Ass3 calculate=new Student_Ass3();
int Division=calculate.div(10,2);
int Subtraction=calculate.sub(Division, 2);
int SubSubtraction=calculate.sub(Subtraction,2);
int Addition=calculate.sum(SubSubtraction, 2);
calculate.mul(Addition,2);
	}
}