package DAY4;

public class Loop_Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checking prime number
		
		boolean Prime = true;
		int number = 7;
		
		if (number <=1) {
			Prime = false;
		} else {
			for (int i =2; i<number; i++) {
				if (number % i== 0) {
				Prime = false;
				break;
			}}
		}
		if (Prime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}
