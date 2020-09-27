package poi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class ReadingExcel {
	public FileInputStream fis = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xlFilePath;

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// https://poi.apache.org/apidocs/dev/org/apache/poi/ss/usermodel/Row.html

		XSSFRow row = sheet.getRow(0);
		int colNum = row.getLastCellNum();
		System.out.println("Total Number of Columns in the excel is : " + colNum);

		int rowNum = sheet.getLastRowNum() + 1;
		System.out.println("Total Rows: " + rowNum);

		XSSFCell cell = sheet.getRow(1).getCell(3);
		System.out.println(cell);
	}

}
