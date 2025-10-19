package DAY5;

public class Class_Object {
	
	String empname;
	int empid;
	int empsal;
	String location;
	
	void Display() {
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(empsal);
		System.out.println(location);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class_Object objectemp1 = new Class_Object();
		objectemp1.empname = "SUJITH";
		objectemp1.empid = 423;
		objectemp1.empsal = 55000;
		objectemp1.location = "Australia";
		objectemp1.Display();

	}

}
