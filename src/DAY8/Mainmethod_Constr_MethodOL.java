package DAY8;

public class Mainmethod_Constr_MethodOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overload obj1 = new Method_Overload(90,99);
		obj1.m1();
		System.out.println(obj1.m1(45.0, 55.0));
		obj1.m1(60.5, 60);
		System.out.println("  ");
		Method_Overload obj2 = new Method_Overload(20.5, 10.8);
		obj2.m1();
		System.out.println(obj2.m1(15.8,62.9));
		obj2.m1(5,2.5);
		obj1.m1(40.5,20);
		System.out.println();
		
		//Encapsulation checking from different class
		System.out.println("Below program is for Encapsulation class program");
		Encapsulation bank = new Encapsulation();
		
		bank.SetAccno(241523);
		bank.Setname("MARK C");
		bank.setAcBal(77000);
		bank.setBranch("New York");
		
		System.out.println(bank.GetAccno());
		System.out.println(bank.Getname());
		System.out.println(bank.getAcBal());
		System.out.println(bank.getBranch());
		
		

	}

}
