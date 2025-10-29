package DAY10;

public class DATACONVERSIONS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DATA Conversion is converting String -> int, double, float, char, Boolean and vice versa  int, double, float, char, Boolean -> String
		
		/* int - Integer
		float - Float
		double - Double
		char - Character
		boolean - Boolean */
		
		int a = 100;
		double d = 11.5;
		char c = 'A';
		boolean b = true; // In boolean otherthan true if you enter anything it willl give false
		
		String as= String.valueOf(a);
		System.out.println(as);
		System.out.println(as + (a + d));
		
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(b);
		
		System.out.println();
		System.out.println(" Total concatination of String ");
		
		System.out.println(as + String.valueOf(d)+ String.valueOf(c)+ String.valueOf(b));
		
		//Now converting String to int, boolean, double and charecter 
		
		String s1 = "11";
		String s2 = "12";
		System.out.println(Integer.parseInt(s1));
		System.out.println(Double.parseDouble(s2));
		System.out.println(Boolean.parseBoolean(s2));
		
		System.out.println("Adding s1 and s2");
		System.out.println(Integer.parseInt(s2) + Double.parseDouble(s1));

	}

}
