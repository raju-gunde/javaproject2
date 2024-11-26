package mar_25;

class Achievement {
	private String achievementName;
	private boolean isachieved;

	public Achievement(String achievementName, boolean isachieved) {
		super();
		this.achievementName = achievementName;
		this.isachieved = isachieved;
	}

	public String getAchievementName() {
		return achievementName;
	}

	public void setAchievementName(String achievementName) {
		this.achievementName = achievementName;
	}

	public boolean isIsachieved() {
		return isachieved;
	}

	public void setIsachieved(boolean isachieved) {
		this.isachieved = isachieved;
	}

	@Override
	public String toString() {
		return "Achievement [achievementName=" + achievementName + ", isachieved=" + isachieved + "]";
	}
}

class player {
	private String userName;
	private int score;
	private Achievement achieve;

	public player(String userName, int score, Achievement achieve) {
		super();
		this.userName = userName;
		this.score = score;
		this.achieve = achieve;
	}

	public void unlockAchievement(String achievementName) {
		achieve.setAchievementName(achievementName);

	}

	public String getAchievementStatus() {
		return achieve.toString();
	}

	@Override
	public String toString() {
		return "player [userName=" + userName + ", score=" + score + ", achieve=" + achieve + "]";
	}

}

public class Achievementlab {

	public static void main(String[] args) {
		Achievement a1=new Achievement("cricket", true);
		player p1=new player("rahul", 300, a1);
		System.out.println(p1);
		
		// TODO Auto-generated method stub

	}

}
