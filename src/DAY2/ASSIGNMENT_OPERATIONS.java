package DAY2;

public class ASSIGNMENT_OPERATIONS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Basic Assignment operaters program - (=, +=, -=, *=, /=, %=) ");
		
		int x = 111, b = 222;
		int Z;
		System.out.println("x=b is - " + (Z = (x=b)));  //222
		System.out.println("x+=10 is - "+ (Z = (x+=10))); //232
		System.out.println("b-=200 is - " + (Z = (b-=200))); //22
		System.out.println("x*=10 is - "+ (Z=(x*=10))); //2320
		System.out.println("b/=2 is - "+ (Z=(b/=2)));  //11
		System.out.println("b%=4 is - "+ (Z=(b%=4))); //3
		
		System.out.println("Ternary operator example program");
		int G = 10;
		
		String result = (G % 2 == 0)? "EVEN" : "ODD";
		System.out.println("Number "+ G + " is "+ result);
		
		int N1 = 12, N2=33;
		String RESULT = (N2>N1)? "MAXIMUM" : "MINIMUM" ;
		
		System.out.println("The Maximum number is " + RESULT);

	}

}
