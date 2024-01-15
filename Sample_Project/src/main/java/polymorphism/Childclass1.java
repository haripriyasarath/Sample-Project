package polymorphism;

public class Childclass1 extends Parentclass1 {
	public void print()
	{
		super.print();
		System.out.println("Polymorphism1233");
	}

	public static void main(String[] args) {
		Childclass1 c= new Childclass1();
		c.print();
		
	}

}
