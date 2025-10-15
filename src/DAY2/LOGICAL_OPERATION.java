package DAY2;

public class LOGICAL_OPERATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Basic Logical operations");
		int X = 200, Y = 300;
		boolean b1 = X>Y;
		boolean b2 = Y>X;
		
		System.out.println("The logical AND operation of  b1 and b2 is - " + (b1 && b2));
		System.out.println("The logical OR operation of b1 and b2 is - "+ (b1 || b2));
		System.out.println("The logical NOT operation of b1 and b2 is - "+ (!b2));

	}

}
