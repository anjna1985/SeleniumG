package poi;

import java.io.*;  

public class FileExample {  
	
public static void main(String[] args) {  
    File f=new File((System.getProperty("user.dir")+"\\src"));  
    String filenames[]=f.list();  
    int i=0;
    //Boolean result;
    
    for(String filename:filenames){  
        if (filename.equals("testCase1.java"))
        {
        	System.out.println("File Exist: "+filename);
        	break;
         }
        
        i++;
     }
    
     System.out.println("Total files: "+i);
}  
}  