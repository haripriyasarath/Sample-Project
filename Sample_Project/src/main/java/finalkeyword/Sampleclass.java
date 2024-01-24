package finalkeyword;

public class Sampleclass  {
	final int a=20;
	/*public Sampleclass()
	{
		a=20;
		System.out.println("Constructor Sample class");
	}*/
	//cant override final method in parent class
	public final void test()
	{
		System.out.println("Final method");
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampleclass s= new Sampleclass();
		s.test();
	}

}
