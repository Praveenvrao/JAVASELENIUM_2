package DAY9;

public class Class_MAINONE extends Class_Mainmethod_MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class_MAINONE object1 = new Class_MAINONE();
		
		object1.AsianTeam();
		object1.SENACountry();
		object1.WesternTeam();
		object1.ICC();
		
		System.out.println();
		System.out.println("Below one is of Interface_1");
		Interface_M1 INT1 = new Class_MAINONE();
		INT1.AsianTeam();
		System.out.println();
		System.out.println("Below one is of Interface_2");
		Interface_M2 INT2 = new Class_MAINONE();
		INT2.SENACountry();
	


	}

}
