package apr_22;

public class Sports {

	public String getName() {
		return "Sports";
	}
	public String getNumberOfTeamMembers() {
		return  "Each team has n players in Sports";
		
	}
}

class Soccer extends Sports{
	
	public String getName() {
		return "ctricket";
	}
	public String getNumberOfTeamMembers() {
		return  "In "+this.getName()+" each has 11 players";
	}
	
}