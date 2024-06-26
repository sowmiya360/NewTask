package task5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDExcel {
	
	public static void dd() throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
	    XSSFSheet sh=wb.getSheetAt(0);
	    
	   int r= sh.getLastRowNum();
	   
	   int c =sh.getRow(1).getLastCellNum();
	   
	   System.out.println(r);
	   System.out.println(c);
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		dd();
		
	}

}
