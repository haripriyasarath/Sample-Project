package testpackage;

public class HierarchicalChildclass2 extends HierarchicalParentclass
{
public void child2()

{
	System.out.println("Hello Child 2");
}
	public static void main(String[] args) {
		HierarchicalChildclass2 h2= new HierarchicalChildclass2();
		h2.print();
		h2.child2();

	}

}
