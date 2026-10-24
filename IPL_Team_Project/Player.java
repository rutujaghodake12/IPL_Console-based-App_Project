package IPL_Team_Project;

public class Player {

	private int id;
	private String name;
	private String teamName;
	private String category;
	private int run;
	private int wicket;
	private int catchCount;

	public Player() {
	}

	public Player(int id, String name, String teamName, String category, int run, int wicket, int catchCount) {
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.category = category;
		this.run = run;
		this.wicket = wicket;
		this.catchCount = catchCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	public int getCatchCount() {
		return catchCount;
	}

	public void setCatchCount(int catchCount) {
		this.catchCount = catchCount;
	}

	@Override
	public String toString() {
		return "Player [pid=" + id + ", name=" + name + ", team_name=" + teamName + ", category=" + category
				+ ", score=" + run + ", catches=" + catchCount + ", wickets=" + wicket + "]";
	}
}