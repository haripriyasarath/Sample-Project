package finalkeyword;

public class Sampleclass2 extends Sampleclass {
	/*public final void test()
	{
		System.out.println("Final method");
	}

*/

	public void check()
	{
		System.out.println("hiiii");
	}
	
	public static void main(String args[])
	{
		Sampleclass2 c = new Sampleclass2();
		c.test(); // can inherit final method
		c.check();
	}
}
