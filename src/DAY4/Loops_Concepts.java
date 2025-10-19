package DAY4;

public class Loops_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given a purchase amount, apply a discount: 20% off for orders above 10,000, 10% for 5,000–10,000, no discount otherwise. Use if-else-if statements to display final price.
		
		/*double P = 15000;
		double DP = 0.0;
		
		if(P>10000) {
			DP = P * (20/100.0);
		}else if(P>=5000 && P<=10001) {
			DP = P * (10/100.0);
		}else {
			DP = 0.0;
		}
		
		double FP = P-DP;
		System.out.println("The final price of the Order is -> "+ FP);*/
		
		//Method 2
		
		double P = 7777;
		
		if (P>10000) {
			double DP = P*(20/100.0);
			double FP = P-DP;
			System.out.println("The final price of the order is -> "+FP);
		}else if(P>=5000 && P<=10000) {
			double DP = P*(10/100.0);
			double FP = P-DP;
			System.out.println("The final price of the order is -> "+ FP);
		}else {
			System.out.println("The final price of the Order is same which is -> " + P);
		}
		
	}

}
