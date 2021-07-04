package Package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ass27_ReadData {
	static int n;
	String a;
	public void ReadData() throws IOException
	{
		File f = new File("../Project_Java/src/Package2/Input_ReadFile.txt");
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		for(int i=1;i<=n;i++)
		{
			if (i==n)
			{
				a=br.readLine();
				System.out.println(a);
			}
			else
			{
				br.readLine();
			}	
		}
	}
	public static void main(String[] args) throws IOException  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row no for data to fetch from: ");
	    n=s.nextInt();
		Ass27_ReadData rd=new Ass27_ReadData();
		rd.ReadData();
		
	}
}
