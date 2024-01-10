package testpackage;

public class HierarchicalChildclass1 extends HierarchicalParentclass{

	
	public void child1()
	{
		System.out.println("Hi Childclass 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildclass1 h1=new HierarchicalChildclass1();
		h1.print();
		h1.child1();

	}

}
