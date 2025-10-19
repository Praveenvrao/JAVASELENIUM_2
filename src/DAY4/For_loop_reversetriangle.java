package DAY4;

public class For_loop_reversetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print reverse right angle triangle with stars
		 /*int rows = 6;
		 
		 for (int i = rows ; i >=1; i--) {
			 for (int j = 1; j<=i; j++) {
				 System.out.print(" * ");
			 }
			 System.out.println();
		 }*/
		
		/*int rows = 6;
		
		for (int i = 1 ; i <=rows; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}*/
		
		int rows = 7;
		
		for (int i = rows; i>=1;i--) {
			for (int j = 1; j<=i ; j++) {
				System.out.print(" & ");
			}
			System.out.println();
		}

	}

}
