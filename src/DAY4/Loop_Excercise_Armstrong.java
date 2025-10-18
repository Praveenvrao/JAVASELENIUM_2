package DAY4;

public class Loop_Excercise_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find armstrong numbers between  1- 1000
		
		
		for (int N = 1; N <= 1000 ; N++) {
			int Original_Num = N;
			int Sum = 0;
			int temp = N;
		while (temp > 0) {
			int lastnumber = temp%10;
			Sum = Sum + (lastnumber*lastnumber*lastnumber);
			temp = temp/10;
			
		}
	
		if (Sum == Original_Num) {
			System.out.println(Original_Num);
		} 
		}

	}

}
