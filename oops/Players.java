package oops;

public class Players {
	String playerName;
	int playerAge;
	public static String Category = "Bowler";
	
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	

}
