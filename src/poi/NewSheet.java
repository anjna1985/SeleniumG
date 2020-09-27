package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try (OutputStream fileOut = new FileOutputStream("Javatpoint.xls")) {  
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("new sheet");
		
		
		// Creating Header - Password 
				XSSFRow header = sheet.createRow(0);
			    header.createCell(0).setCellValue("User_Name");
			   // XSSFRow header1 = sheet.createRow(0);
			    header.createCell(1).setCellValue("Password");
				
			    // Row 1 Column 0
			    
			    for (int rows=1; rows<10; rows++) {
					
					XSSFRow row = sheet.createRow(rows);
					
					for (int cols=0; cols<=rows;cols++) {
						Cell cell = row.createCell(cols);
						cell.setCellValue("Username"+(int)cols*10);
						
					// Row=1 Column 1
						
					 for (int colss=1; cols<=rows;cols++) {
						
					    		Cell cells = row.createCell(colss);
					    		cells.setCellValue("Password"+(int)colss*10);
			      }
				}
			}	    
		
		    //Connecting steams
		    File f = new File(System.getProperty("user.dir")+"\\src\\myExcelFile1.xls");
			FileOutputStream fo = new FileOutputStream (f);
			wb.write(fo);
			//Closing the stream
			fo.close();
			System.out.println("File Created !!!");
			
		}
			
			catch(Exception e) {  
            System.out.println(e.getMessage());  
		}
			
	}
	
	}


