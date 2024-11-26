package apr_23;

public class Image extends Media{
	String resolution;

	public Image(String media, int duration, String resolution) {
		super(media, duration);
		this.resolution = resolution;
	}
	public Media getDetails() {
		System.out.println("resolution is:"+resolution);
		System.out.println("media is:"+super.media);
		System.out.println("duration is:"+super.duration);
		return this;
	}
 

}
