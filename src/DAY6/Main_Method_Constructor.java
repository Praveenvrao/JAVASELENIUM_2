package DAY6;

public class Main_Method_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using object reference
		Method_Constructor_1 object = new Method_Constructor_1();
		object.ename = "MARK C";
		object.edpt = "Business";
		object.role = "Product owner";
		object.Printempdata();
		
		//Using method
		Method_Constructor_1 object2 = new Method_Constructor_1();
		object2.Setempdata("MAHIT", "Testing dept", "QA Analyst");
		object2.Printempdata();
		
		//Using constructor
		Method_Constructor_1 object3 = new Method_Constructor_1();
		object3.Printempdata();
		
		Method_Constructor_1 object4 = new Method_Constructor_1("SAM CURRUN", "ALL ROUNDER", "CRICKETER");
		object4.Printempdata();
		

	}

}
