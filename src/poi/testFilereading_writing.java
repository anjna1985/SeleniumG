package poi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\testFilereading_writing.txt");
		file.createNewFile();
		 
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\testFilereading_writing.txt");
		//System.out.println(System.getProperty("user.dir"));
		BufferedWriter filewriter = new BufferedWriter (fw);
		filewriter.write("Hello");
		filewriter.newLine();
		filewriter.write("Bharat");
		filewriter.newLine();
		filewriter.write("How are you");
		filewriter.newLine();
		filewriter.flush();
		
		FileReader fr = new FileReader (System.getProperty("user.dir")+"\\testFilereading_writing.txt");
		BufferedReader filereader = new BufferedReader(fr);
		String i="";
		
		while ((i=filereader.readLine())!=null) {
			
		System.out.println(i);	
		}
		
		
	}

}
