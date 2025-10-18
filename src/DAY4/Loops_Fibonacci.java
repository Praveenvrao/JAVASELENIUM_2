package DAY4;

public class Loops_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find the fibonacci series till first 50
		
		int a = 0;
		int b = 1;
		System.out.print(a +", ");
		System.out.print(b +", ");
		
		for (int i = 3; i<=20;i++) {
			int c = a+b;
			System.out.print(c + ", ");
			a = b ;
			b = c;
		}

	}

}
