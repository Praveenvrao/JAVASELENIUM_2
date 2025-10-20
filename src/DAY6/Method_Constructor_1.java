package DAY6;

public class Method_Constructor_1 {
	String ename;
	String edpt;
	String role;
	
	public void Printempdata() {
		System.out.println("Emp name is -> " + ename);
		System.out.println("Emp dept is -> " + edpt);
		System.out.println("Role of the emp is -> "+ role);
	}
	void Setempdata(String Name, String DPT, String ROLE) {
		ename = Name;
		edpt = DPT;
		role = ROLE;
	}
	
	//Constructor
	Method_Constructor_1() {
		// TODO Auto-generated constructor stub
		ename = "Nathalie jones";
		edpt = "DEV";
		role = "S_Developer";
	}
	Method_Constructor_1(String EMPNAME, String EMPDPT, String EMPROLE){
		ename = EMPNAME;
		edpt = EMPDPT;
		role = EMPROLE;
	}
	

}
