package Ejercicio5_MediaPlayer;

public class MediaPlayer {
	public Media media;
	
	public MediaPlayer(Media media) {
		this.media = media;
	}
	
	public void setMedia(Media media) {
		this.media = media;
	}
	
	public void play() {
		media.play();
	}
}
