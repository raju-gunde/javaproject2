package apr_23;

public class WeatherReportingSystem {

	public static void main(String[] args) {
		WeatherReport hr1=new HourlyReport();
		hr1.generateReport();
		hr1.generateReport("Hydrabad");
		HourlyReport hr2=(HourlyReport) hr1;
	    hr2.generateReport(2023, 04, 05, 6);
	    hr2.generateReport(2023, 4, 3, 7, 60);
		
		
		// TODO Auto-generated method stub

	}

}
