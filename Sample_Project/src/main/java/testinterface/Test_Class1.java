package testinterface;

public class Test_Class1 implements Sample_Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Class1 t= new Test_Class1();
		t.check();
		t.check1();
		t.test();
		t.test1();

	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("2");
		
	}

	@Override
	public void check1() {
		// TODO Auto-generated method stub
		System.out.println("3");
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(4);
		
	}

}
