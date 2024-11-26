package apr_26;

public class HistoryStudent extends Studentabstract {
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super("srikar","8");
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	public  int getPercentage() {
		return (historyMarks+civicsMarks)/2;
	}

	@Override
	public String toString() { 
		System.out.println(super.toString());
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + "]";
	}
	

}
