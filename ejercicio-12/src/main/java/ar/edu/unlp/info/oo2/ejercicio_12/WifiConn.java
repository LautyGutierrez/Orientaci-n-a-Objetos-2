package ar.edu.unlp.info.oo2.ejercicio_12;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, long crc) {
		return data + " " + crc;
	}
	
	public String pict() {
		return this.pict;
	}
}
