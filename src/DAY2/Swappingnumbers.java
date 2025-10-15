package DAY2;

public class Swappingnumbers {
	
	public static void main(String a[]) {
		
		// Swapping 2 numbers using +, - Operators
		
		System.out.println("Method 1 -> Swapping using + and - ");

		int x = 10, y = 22;
		System.out.println("Before swap x = "+ x);
		System.out.println("Before swap y = "+ y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Values after swaspping are below");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("Method 2 -> Swapping using * and /");
		
		int p = 100, q = 55;
		System.out.println("Before swapping p = " + p);
		System.out.println("Before swapping q = " + q);
		p = p*q;
		q = p/q;
		p = p/q;
		System.out.println("Values after swapping are below");
		System.out.println("p = "+p);
		System.out.println("q = "+q);

		
		
		
		
	}

}
