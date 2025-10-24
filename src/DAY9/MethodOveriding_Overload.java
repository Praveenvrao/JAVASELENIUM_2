package DAY9;

class CricketTeam {
	String Teamname = "ICC";
	String Color = "White";
	void TeamDetails() {
		System.out.println("Below are the team name and color of the Jersey details -> ");
		
	}
	
}

class Australia extends CricketTeam {
	
	String Teamname = "Australia";
	String Color = "Yellow";
	void TeamDetails() {
		super.TeamDetails();
		System.out.println("Teamname is -> "+ Teamname +" And Jersey color is -> "+Color);
		System.out.println("ODI Matches Captain name is Below");
	}
	void TeamDetails(String Cap) {
		System.out.println("Captain name is -> "+ Cap);
	}
}

class India extends CricketTeam {
	
	String Teamname = "INDIA";
	String Color = "BLUE";
	void TeamDetails() {
		super.TeamDetails();
	}
	void TeamDetails(String Cap) {
		System.out.println("Captain name is -> "+ Cap);
	}
}

public class MethodOveriding_Overload {
	public static void main(String[] args) {
	
	CricketTeam obj1 = new CricketTeam();
	obj1.TeamDetails();
	obj1.Teamname = "ENG";
	obj1.Color = "Light blue";
	obj1.TeamDetails();
	
	Australia Aus = new Australia();
	System.out.println();
	System.out.println("This is Australia team details ");

	Aus.TeamDetails();
	Aus.TeamDetails("Mitch Marsh");
	
	
	
	

}}

