package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lk= new LinkedList<Integer>();
		lk.add(20);
		lk.add(30);
		lk.add(40);
		lk.add(50);
		System.out.println("For Each");
		for(int i:lk) {
			System.out.println(i);
		}
		System.out.println("---------");
		System.out.println(lk);
		System.out.println("Iterator");
		Iterator<Integer> it = lk.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("Add All");
		lk.addAll(lk);
		System.out.println(lk);
		}
	
}
		
