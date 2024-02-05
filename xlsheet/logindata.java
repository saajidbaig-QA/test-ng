package xlsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class logindata {

	public static void main(String[] args) throws IOException  {
FileInputStream fs=new FileInputStream("D:\\xl sheet//loginpage.xlsx");
XSSFWorkbook wo=new XSSFWorkbook(fs);
XSSFSheet sh=wo.getSheet("login data");
XSSFRow r=sh.getRow(2);
System.out.println(r.getCell(1).getStringCellValue());
	}

}
