package collections;

import java.util.ArrayList;
import java.util.List;

public class Test_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List is an interface so can't create a object for an interface
		List<String> list=new ArrayList<String>(); 
		list.add("Sanvika");
		list.add("Sarath");
		list.add("Haripriya");
		for(String a : list)
		{
			System.out.println(a);
		}
		
		
		list.add("HK");
		System.out.println(list);
		list.add("age:3");
		list.add("age:31");
		list.add("age:28");
		list.add("age:24");
		System.out.println(list);
		
	}

}
