package exceptions;

public class Test_trycatch {
	
	public void test()
	{
		
		//int a=10/0;	
		//System.out.println(a);
		
		try{
			int a=10/0;	
			System.out.println(a);
			
		}

		/*catch (Exception e)
		//catch (ArithmeticException e)
		{
			System.out.println(e);
		}*/
		
		finally {
			System.out.println("Important messagess in finally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_trycatch t = new Test_trycatch();
		t.test();
	}

}
