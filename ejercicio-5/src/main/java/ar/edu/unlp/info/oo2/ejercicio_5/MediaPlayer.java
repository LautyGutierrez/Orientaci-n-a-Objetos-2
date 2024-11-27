package ar.edu.unlp.info.oo2.ejercicio_5;

public class MediaPlayer {
	private Media media;
	
	public MediaPlayer() {
		this.media = new Audio();	
	}
	
	public void setMedia(Media media) {
		this.media = media;
	}
	
	public void play() {
		this.media.play();
	}
}
