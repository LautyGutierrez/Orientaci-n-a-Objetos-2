package Ejercicio12_DispositivoMovilYConexiones;

public interface Connection {
	public String sendData(String data, long crc);
	public String pict();
}
