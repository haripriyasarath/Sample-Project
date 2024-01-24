package excelreader;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  String d=Excel_Code.getStringData(1, 0);
  System.out.print(d);
  String e=Excel_Code.getInegerData(1, 1);
  System.out.print("  ");
  System.out.println(e);
 
  String d1=Excel_Code.getStringData(2, 0);
  System.out.print(d1);
  String e1=Excel_Code.getInegerData(2, 1);
  System.out.print("  ");
  System.out.println(e1);
 
  String d2=Excel_Code.getStringData(3, 0);
  System.out.print(d2);
  String e2=Excel_Code.getInegerData(3, 1);
  System.out.print("  ");
  System.out.println(e2);
  
  
	}
	}
	
	


