package excelreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Code2 {
	static FileInputStream f;
	 static XSSFWorkbook w;
	 static XSSFSheet sh;
	 //To fetch string data
	 
	 public static String getStringData(int a,int b) throws Exception
	 {
		 f=new FileInputStream("C:\\Users\\intel\\Desktop\\Book2.xlxs");
		 w=new XSSFWorkbook(f);
		 sh=w.getSheet("Sheet1");
		 Row r= sh.getRow(a);
		 Cell c =r.getCell(b);
		 return c.getStringCellValue();
	 }
	 
	 //to fetch integer value
	 public static String getInegerData(int a,int b) throws Exception 	 {
		 f=new FileInputStream("C:\\Users\\intel\\Desktop\\Book2.xlxs");
		 w=new XSSFWorkbook(f);
		 sh=w.getSheet("Sheet1");
		 Row r= sh.getRow(a);
		 Cell c =r.getCell(b);
		 int x=(int)c.getNumericCellValue();
		 return String.valueOf(x);
	 }
	}


