package Ejercicio12_DispositivoMovilYConexiones;

public class Connection4G{
	public String transmit(String data, long crc) {
		return "Datos: " + data + "\n" + "CRC: " + crc;
	}
	
	public String symb() {
		return "Simbolo de Conexion 4G";
	}
}
