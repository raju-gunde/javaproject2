package mar_23;

class movie {
	private String title;
	private int year;
	private String gener;

	public movie(String title, int year, String gener) {
		super();
		this.title = title;
		this.year = year;
		this.gener = gener;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	@Override
	public String toString() {
		return "movie [title=" + title + ", year=" + year + ", gener=" + gener + "]";
	}

}

public class moviedetails {

	public static void main(String[] args) {
		movie m1 = new movie("bahubhali", 2021, "tollywood");
		System.out.println(m1);

		// TODO Auto-generated method stub

	}

}
