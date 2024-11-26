package apr_23;

public class WeatherReport {
	public void generateReport(){
		System.out.println("WeatherReport is reporting");
		
	}
	public void generateReport(String location) {
		System.out.println("location is"+location);
	}
	public void generateReport(int year, int month, int day) {
		System.out.println(year+"/"+month+"/"+day);
	}

}
