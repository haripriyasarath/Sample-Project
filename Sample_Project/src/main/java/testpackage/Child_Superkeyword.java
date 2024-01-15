package testpackage;

public class Child_Superkeyword extends Parent_Superkeyword{
	
	public void print()
	
	{
		super.sum();
		System.out.println("Hello...");
		System.out.println(super.a);
		System.out.println(super.b);
	
		
	}

	public static void main(String[] args) {
		Child_Superkeyword c= new Child_Superkeyword();
		c.print();
		//c.sum();
      
	}

}
