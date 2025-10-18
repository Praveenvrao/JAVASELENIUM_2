package DAY4;

public class Loops_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find sum of given number
		
		int number = 999;
		int sum = 0;
		
		while (number > 0) {
			int p = number % 10;
			sum += p;
			number = number/10;
		}
		System.out.println(sum);


	}

}
