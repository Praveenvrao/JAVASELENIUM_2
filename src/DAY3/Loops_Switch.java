package DAY3;

public class Loops_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define an enum called Weather with SUNNY, RAINY, CLOUDY, SNOWY. Write a switch to print a message based on today's weather.
		
		// Define the enum outside the class
		/* enum Weather {
		    SUNNY,
		    RAINY,
		    CLOUDY,
		    SNOWY
		}

		public class WeatherExample {
		    public static void main(String[] args) {
		        // Set today's weather
		        Weather today = Weather.SUNNY;

		        // Use switch on enum variable
		        switch (today) {
		            case SUNNY:
		                System.out.println("Today is sunny. Wear sunglasses!");
		                break;
		            case RAINY:
		                System.out.println("It's rainy today. Take an umbrella!");
		                break;
		            case CLOUDY:
		                System.out.println("Cloudy sky today. Might rain later.");
		                break;
		            case SNOWY:
		                System.out.println("Snowfall today. Stay warm!");
		                break;
		            default:
		                System.out.println("Unknown weather condition.");
		        }
		    }
		}
*/
		
		/*// Write a indian seasons update according to the month
		
		enum Months { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC, NAVV }
		
		Months monthname = Months.NAVV;
		
		switch (monthname) {
			case MAY, JUN, MAR, APR : System.out.println("This is SUMMER Season"); break;
			case JUL, AUG, SEP, OCT : System.out.println("This is RAINY Season"); break;
			case NOV, DEC, JAN, FEB : System.out.println("This is Winter season"); break;
			default : System.out.println("Invalid Month");
		}*/
		
		//Read a month number (1–12) and print how many days are in that month (e.g., February has 28 or 29 days).
		
		
		String Month = "FEB";
		
		switch(Month) {
		case "JAN","MAR","MAY","JUL","AUG","OCT","DEC" : System.out.println("This month have 31 days"); break;
		case "APR","JUN","SEP","NOV" : System.out.println("This month have 30 days ");break;
		case "FEB" : System.out.println("This month have 28 days only and if you verifying the leap year then it have 29 days"); break;
		default : System.out.println("INVALID -> Enter valid month : ");
		
		}

} 
}
