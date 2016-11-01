package logica;

public class Linea {
	
	int linea;
	int apariciones;
	
	public Linea(int linea) {
		this.linea = linea;
		this.apariciones = 1;
	}
	
	public int getLinea() {
		return linea;
	}
	
	public void setLinea(int linea) {
		this.linea = linea;
	}
	
	public int getApariciones() {
		return apariciones;
	}
	
	public void setApariciones(int apariciones) {
		this.apariciones = apariciones;
	}
	
	public void incrementarApariciones() {
		this.apariciones++;
	}
	
	public String toString() {
		return linea + "(" + apariciones + ")";
	}
}