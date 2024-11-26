package apr_23;

public class HourlyReport extends WeatherReport{
	public void generateReport(){
		System.out.println("HourlyReport is repotring");
		
	}
	public void generateReport(String location) {
		System.out.println("location is"+location);
	}
	public void generateReport(int year, int month, int day) {
		System.out.println(year+"/"+month+"/"+day);
	}
	public void generateReport(int year, int month, int day,int hour) {
		System.out.println(year+"/"+month+"/"+day+"/"+hour+"hr");
	}
	public void generateReport(int year, int month, int day,int hour,int min) {
		System.out.println(year+"/"+month+"/"+day+"/"+hour+"hr/"+min+"min");
	}

}
