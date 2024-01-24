package accessmodifier1;

public class Test1accessmod {

	public void method1()
	{
		System.out.println("Public");
	}
	
	private void method2()
	{
		System.out.println("Private");	
	}
	
	protected void method3()
	{
		System.out.println("Protected");
	}

    void method4()
    {
    	System.out.println("Default");
    }

    public static void main(String args[])
    {
    	Test1accessmod obj = new Test1accessmod();
    	obj.method1();
    	obj.method2();
    	obj.method3();
    	obj.method4();
    }


}
