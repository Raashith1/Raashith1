package oops;

public class Playersmain {
	public static void main(String[] args) {
		Players p1= new Players();
		Team t1 = new Team();
		
		
		p1.setPlayerName("rohit");
		System.out.println(p1.getPlayerName());
		p1.setPlayerAge(40);
		System.out.println(p1.getPlayerAge());
		
	    p1.Category = "Batsman";
		System.out.println(p1.Category);
		t1.setTeamName("Punjabkings");
		System.out.println(t1.getTeamName());
		t1.setTeamMembers(20);
		System.out.println(t1.getTeamMembers());
		
		
		p1.setPlayerName("Jadeja");
		System.out.println(p1.getPlayerName());
		
		p1.setPlayerAge(35);
		System.out.println(p1.getPlayerAge());
		
		p1.Category = "All Rounder";
		System.out.println(p1.Category);
		t1.setTeamName("CSK");
		System.out.println(t1.getTeamName());
		t1.setTeamMembers(11);
		System.out.println(t1.getTeamMembers());
		
		PlayerService playerservice = new PlayerService();
		TeamService teamservice = new TeamService();
		playerservice.getPlayerList(p1);
		
		teamservice.getTeamList(t1);
	}

}
