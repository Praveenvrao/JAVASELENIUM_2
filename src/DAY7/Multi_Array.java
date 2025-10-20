package DAY7;

import javax.crypto.KEM;

public class Multi_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<=4;j++) {
				n[i][j] = (int)(Math.random()*10);
				System.out.print(n[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		
		for (int m[] : n) {
			for (int k : m) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}

	}

}
