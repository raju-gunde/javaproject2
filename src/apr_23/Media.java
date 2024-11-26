package apr_23;

public class Media {
	String media;
	int duration;
	public Media(String media, int duration) {
		super();
		this.media = media;
		this.duration = duration;
	}
	public String getMedia() {
		return media;
	}
	public int getDuration() {
		return duration;
	}
	public Media getDetails() {
		System.out.println("media is:"+media);
		System.out.println("duration is:"+duration);
		return this;
	}
	

}
