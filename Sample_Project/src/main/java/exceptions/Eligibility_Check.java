package exceptions;

public class Eligibility_Check {
	
	public void eligibility()
	{
	    int age=15;
		if (age >18)
		{
		System.out.println("eligible for voting");
		
		}
		else
		{ 
		//System.out.println("Not eligible for voting");
			throw new ArithmeticException("Not Eligible");
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Eligibility_Check e= new Eligibility_Check();
		e.eligibility();

	}

}
