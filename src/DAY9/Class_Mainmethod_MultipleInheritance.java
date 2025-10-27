package DAY9;

public class Class_Mainmethod_MultipleInheritance extends Class_M3 implements Interface_M1, Interface_M2 {
	
	public void AsianTeam() {
		System.out.println("This is Asian cricket team and Teamname is -> "+ AName);
	}
	
	public void SENACountry() {
		System.out.println("This is SENA Country and cricket team name is -> "+ SName);
	}
	
	void ICC() {
		String boardname = "ICC";
		System.out.println("THIS IS MAIN CRICKET BOARD WHICH IS -> "+boardname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class_Mainmethod_MultipleInheritance obj1 = new Class_Mainmethod_MultipleInheritance();
		
		obj1.AsianTeam();
		obj1.SENACountry();
		obj1.WesternTeam();
		obj1.ICC();
		
		System.out.println("  ");
		System.out.println("Below one is of Interface1 Object");
		Interface_M1 int1 = new Class_Mainmethod_MultipleInheritance();
		int1.AsianTeam();
		System.out.println();
		System.out.println("Below one is of Interface1 Object");
		Interface_M2 int2 = new Class_Mainmethod_MultipleInheritance();
		int2.SENACountry();
		
		

	}

}
