package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ass29_WriteData {
	static int n;
	String data;
	public void WriteData() throws IOException
	{		
		File f = new File("../Project_Java/src/Package2/Output_WriteFileFromUser.txt");
		FileWriter fw = new FileWriter(f);
	    BufferedWriter b = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data: ");	
		for (int i=1;i<=n;i++)
		{
			data=s.nextLine();
			b.write(data);
			b.newLine();
		}
		b.close();
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row count till which data will be written: ");
		n=s.nextInt();
		Ass29_WriteData wd = new Ass29_WriteData();
		wd.WriteData();
	}
}
