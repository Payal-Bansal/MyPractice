package Package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ass28_ReadDataofRange {
	static int n1,n2;
	String s;
	public void ReadDataRange() throws IOException
	{
		File f = new File("../Project_Java/src/Package2/Input_ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=i;j++)
			{
			if(i==n1)
			{
				s=br.readLine();
				System.out.println(s);
			}
			else
			{
				br.readLine();
			}
			}
			if(i!=n1 & i<n2)
			{
				s=br.readLine();
				System.out.println(s);
			}
			else
			{
				br.readLine();
			}
		}		
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial row no: ");
		n1=s.nextInt();
		System.out.println("Enter end row no: ");
		n2=s.nextInt();
		Ass28_ReadDataofRange rdr=new Ass28_ReadDataofRange();
		rdr.ReadDataRange();			
	}

}
