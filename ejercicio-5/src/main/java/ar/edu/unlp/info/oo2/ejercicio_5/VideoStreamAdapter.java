package ar.edu.unlp.info.oo2.ejercicio_5;

public class VideoStreamAdapter extends Media{
	private VideoStream video;
	
	public VideoStreamAdapter() {
		this.video = new VideoStream();
	}
	
	public void play() {
		this.video.reproduce();
	}
}
