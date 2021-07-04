package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ass30_WriteDataInaRange {
static int n;
	String data;
	public void WriteDataInRange(int n1,int n2) throws IOException
	{		
		File f = new File("../Project_Java/src/Package2/Output_WriteFileInRangeFromUser.txt");
		FileWriter fw = new FileWriter(f);
	    BufferedWriter b = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data: ");	
	    for(int i=1;i<=n;i++)
	    { data=s.nextLine();
			if((i>=n1)&&(i<=n2))
			{
				b.write(data);
				b.newLine();
			}
	    }
			b.close();
 }
   public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of rows: ");
		n=s.nextInt();
		Ass30_WriteDataInaRange wd = new Ass30_WriteDataInaRange();
		wd.WriteDataInRange(2,4);
	}
}

