package DAY4;

public class Loops_Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 254;
		int Reversed = 0;
		
		while (number >0) {
			int temp = number % 10;
			Reversed = Reversed * 10 + temp;
			number = number/10;
		}
		System.out.println(Reversed);
	}

}
