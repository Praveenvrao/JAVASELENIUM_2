package DAY6;

public class Methods_1 {
	
	String name;
	String school;
	
	void method1() {
		System.out.println("This is method1 with No parameters & No return only print");
	}
	void method2(int a, String name) {
		System.out.println("This is a method with Parameters and Print");
		System.out.println(name + a);
	}
	String method3(){
		return ("This is method with No parametrs but returns");
	}
	String method4(String school) {
		return ("This is  method with parameters and returns and it writes school name -> "+school);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_1 m1 = new Methods_1();
		m1.method1();
		m1.method2(244, "Jacks & Jones");
		
		String cname = m1.method3();
		System.out.println(cname);
		String sname = m1.method4("DPS Public school");
		System.out.println(sname);

	}

}
