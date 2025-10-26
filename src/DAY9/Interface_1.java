package DAY9;

interface Cricket {
	
	String Countryname = "Country";
	
	void Teamname(String name);
	
	default void ODI(String Dformat) {
		System.out.println(Dformat + " has the ODI Status");
	}
	static void Test(String Tformat) {
		System.out.println(Tformat + " has the Test status");
	}
}

public class Interface_1 implements Cricket {
	
	public void Teamname(String name) {
		System.out.println(Countryname + " name is " + name + " and below are the format statuses");
	}
	
	public void T20(String tcname) {
		System.out.println("All countries which has ODI & Test format statuses have T20 statuses except "+ tcname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_1 objc1 = new Interface_1();
		objc1.Teamname("INDIA");
		objc1.ODI("INDIA");
		Cricket.Test("INDIA");
		objc1.T20("CHINA");
		
		

	}

}
