package polymorphism;

public class Childclconstructor extends Parentclconstructor {
	public Childclconstructor()
	{
		System.out.println("Constructor");
	}
	public Childclconstructor(String a)
	{
		super();
		super.print();
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Childclconstructor c= new Childclconstructor();
		
		Childclconstructor d= new Childclconstructor("Second Constructor");
		//super();
		
	}


}
