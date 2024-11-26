package apr_23;

public class Video extends Media {
	String farmat;

	public Video(String media, int duration, String farmat) {
		super(media, duration);
		this.farmat = farmat;
	}
	public Media getDetails() {
		System.out.println("resolution is:"+farmat);
		System.out.println("media is:"+media);
		System.out.println("duration is:"+duration);
		return this;
	}
}
