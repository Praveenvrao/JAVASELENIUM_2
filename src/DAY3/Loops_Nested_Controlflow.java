package DAY3;

public class Loops_Nested_Controlflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For each of 12 months, input rainfall (with validation: reject negative numbers). At the end, print min, max, and average rainfall. Use loops and conditions.
		
		for(int i =1;i<=12;i++);
			for(int j=1;j<=12;j++)
				if (j>=1 && j<=4) {
					System.out.println("It's a summer so not that much rain, MIN RAIN");
				} else if(j>=5 && j<=8) {
					System.out.println("It's a Rainy season it have MAX RAIN");
				}else if(j>=9 && j<=12) {
					System.out.println("It;s a winter so AVG RAIN");
				} else {
					System.out.println("Enter valid Month number");
				}
			
	}

}
