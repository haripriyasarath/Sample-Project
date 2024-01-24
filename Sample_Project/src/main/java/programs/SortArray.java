package programs;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s[]= {"Russia","Iran", "Iraq" ,"Korea" ,"Zimbabe","Kungku"};
  int size=s.length;
  for(int i=0; i<size;i++) {
	  for(int j=i+1;j<size;j++)
	 {
		  if(s[i].compareTo(s[j])>0)
		  {
			  String temp=s[i];
			  s[i]=s[j];
			  s[j]=temp;
			  }
	  }
  }
  
  System.out.println(Arrays.toString(s)); 
	}

}
