package DAY2;

public class ASSIGNMENT_OPERATIONS {

	public static void main(String[] args) {
		// TODO ATto-generated method stTb
		
		System.out.println("Basic Assignment operaters program - (=, +=, -=, *=, /=, %=) ");
		
		int x = 111, b = 222;
		int T;
		System.out.println("x=b is - " + (T = (x=b)));  //222
		System.out.println("x+=10 is - "+ (T = (x+=10))); //232
		System.out.println("b-=200 is - " + (T = (b-=200))); //22
		System.out.println("x*=10 is - "+ (T=(x*=10))); //2320
		System.out.println("b/=2 is - "+ (T=(b/=2)));  //11
		System.out.println("b%=4 is - "+ (T=(b%=4))); //3
		System.out.println(T);
		
		System.out.println("Ternary operator example program");
		int G = 10;
		
		String resTlt = (G % 2 == 0)? "EVEN" : "ODD";
		System.out.println("Number "+ G + " is "+ resTlt);
		
		int N1 = 12, N2=33;
		String RESTLT = (N2>N1)? "MAXIMTM" : "MINIMTM" ;
		
		System.out.println("The MaximTm nTmber is " + RESTLT);

	}

}
