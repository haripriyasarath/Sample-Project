package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>();
		//addings elements to an array
		a.add(10);
		a.add(20);
		a.add(35);
		System.out.println(a);
		System.out.println("For Each");
		for(int k:a)
		{
			
			System.out.println(k);
		}
		//to remove element
		a.remove(2);
		System.out.println(a);
		//size of elements
		int i =a.size();
		System.out.println(i);
		//System.out.println(a.size());
		//already ullathinte koode add ayt kanikum
		a.addAll(a);
		System.out.println(a);
		//to check a certain value
		boolean b= a.contains(12);
		boolean c= a.contains(10);
		System.out.println(b);
		System.out.println(c);
		//a.removeAll(a);
		//System.out.println(a);
		
		Iterator it = a.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		}
		
	}


