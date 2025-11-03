package DAY4;

import java.util.Scanner;

public class Loops_Reversenumber {

	@SuppressWarnings("resource")
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		//int number = 254;
		int Reversed = 0;
		
		while (number >0) {
			int temp = number % 10;
			Reversed = Reversed * 10 + temp;
			number = number/10;
		}
		System.out.println(Reversed);
	}

}
