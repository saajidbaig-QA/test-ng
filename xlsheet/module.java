package xlsheet;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class module {


	public static void main(String[] args) throws IOException {
	XSSFWorkbook wo=new XSSFWorkbook();
	XSSFSheet sh=wo.createSheet("moudle");
	XSSFRow r=sh.createRow(0);
			r.createCell(0).setCellValue("name");
			r.createCell(1).setCellValue("email");
			r.createCell(2).setCellValue("password");
			
	XSSFRow r1=sh.createRow(1);
			r1.createCell(0).setCellValue("sajid");
			r1.createCell(1).setCellValue("sajid90@gmail.com");
			r1.createCell(2).setCellValue("12345@123");
			
	XSSFRow r2=sh.createRow(2);
			r2.createCell(0).setCellValue("sadik");
			r2.createCell(1).setCellValue("sadik123@gmail.com");
			r2.createCell(2).setCellValue("1223321ishih");
			
	XSSFRow r3=sh.createRow(3);
			r3.createCell(0).setCellValue("teja");
			r3.createCell(1).setCellValue("teja123@gmail.com");
			r3.createCell(2).setCellValue("jshsuydnkdwnidh");
	XSSFRow r4=sh.createRow(4);
			r4.createCell(0).setCellValue("tom");
			r4.createCell(1).setCellValue("sahsiksjh@72727.com");
			r4.createCell(2).setCellValue("bjwjdgjkdwbd");
			FileOutputStream fs=new FileOutputStream("D:\\excelsheet//moudles.xlsx");
			wo.write(fs);

	}
}

			
			
			
	
	
	
	
	
	

	


