package Package2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ass31_CopyPaste {
	
	public void CopyPaste() throws IOException
	{
		File f = new File("../Project_Java/src/Package2/Input_ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);		
		File wf = new File("../Project_Java/src/Package2/Output_CopyPaste.txt");
		FileWriter fw = new FileWriter(wf);
		BufferedWriter bw = new BufferedWriter(fw);		
		String s;
		while((s=br.readLine())!=null)
		{
				System.out.println(s);
				bw.write(s);
				bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		Ass31_CopyPaste cp=new Ass31_CopyPaste();
		cp.CopyPaste();		
	}

}
