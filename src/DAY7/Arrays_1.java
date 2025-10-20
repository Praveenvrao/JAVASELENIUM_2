package DAY7;

public class Arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n[] = {1,2,3,4};
		
		for (int i =0;i<4;i++) {
		
		System.out.print(n[i] + " ");
		}*/
		
		int x[] = new int[6];
		//int x = (int)(Math.random()*10);
		for (int i =0; i<6;i++) {
			x[i] = (int)(Math.random()*10);
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		for (int m : x) {
			System.out.print(m + " ");
		}
	}

}
