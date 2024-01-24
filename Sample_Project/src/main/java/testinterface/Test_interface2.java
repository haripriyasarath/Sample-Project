package testinterface;

public class Test_interface2 implements Sample_Interface1,Sample_Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_interface2 t = new Test_interface2();
		t.check();
		t.test();
		t.test1();
		t.check1();
		// cannot instantiate
		//Sample_Interface1 a= new Sample_Interface1();
		
		//but can create thru the class that implements the interface
		Sample_Interface1 a= new Test_interface2(); // this will inherit the properties of interface class

	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Method1 - Check");
		System.out.println(a);
		System.out.println(b);
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Method2 - Test");
		System.out.println(a+b);
		
	}

	@Override
	public void check1() {
		// TODO Auto-generated method stub
		System.out.println("Mrthod-Check1");
		System.out.println(c);
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Method Test1");
		System.out.println(d);
	}
	

}
