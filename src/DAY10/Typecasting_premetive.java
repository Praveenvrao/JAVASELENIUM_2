package DAY10;

public class Typecasting_premetive {

	public static void main(String[] args) {
		// upcasting
		
		int i = 100;
		long l = i;
		System.out.println(l);
		float f = 100.56f;
		double d = f;
		System.out.println(d);
		
		//downcasting 
		System.out.println();
		System.out.println("Below are doncasting examples");
		long l1 = 1352367828;
		System.out.println(l1);
		int i1 = (int) l1;
		System.out.println("Downcasting l1 and the value is -> " + i1);
		
		double d1 = 12323.756383992773;
		System.out.println(d1);
		float f1 = (float)d1;
		System.out.println(f1);
		

	}

}
