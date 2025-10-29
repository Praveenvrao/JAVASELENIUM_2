package DAY10;

import java.util.Scanner;

public class HandleException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number a ");
		
		try {
			int a = sc.nextInt();
			System.out.println("The entered number is -> " + a);
			
			try {
				System.out.println(100/a);
			} catch (Exception e) {
				System.out.println("Enter valid number which divides with 100");
			}
			finally {
				System.out.println("This is inside final block ");
			}

		} catch (Exception e) {
			System.out.println("Enter only integers");
		}
		finally {
			System.out.println("This is outside final block");
		}
		
	}

}
