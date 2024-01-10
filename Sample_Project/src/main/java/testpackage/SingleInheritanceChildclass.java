package testpackage;

public class SingleInheritanceChildclass extends SingleInheritanceParentclass {
	public void display()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		SingleInheritanceChildclass c= new SingleInheritanceChildclass();
		c.display();
		c.print();
	}

}
