package aggregation;

public class Aggregation_child {
	Aggregation_parent a;
	String name;
	int id;
	public Aggregation_child(String name,int id ,Aggregation_parent a)
	{
		this.name=name;
		this.a=a;
		this.id=id;
	}
	
	public void print()
	{
		System.out.println("Name :" +name +"  " +"Employee ID :" +id);
		//System.out.println("Employee ID :" +id);
		System.out.println("Name :" +a.name +"  " +"Employee ID :" +a.id);
		//System.out.println("Employee ID :" +a.id);
	}
	public static void main(String[] args) {
		Aggregation_parent a1= new Aggregation_parent("Haripriya" , 20070165);
		Aggregation_child c1= new Aggregation_child("Safna", 2004642,a1);
		c1.print();
	}

}
