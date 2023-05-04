package Ejercicio;

public class Genero {
	private static int contador=0;
	private int codGenero;
	private String Genero;
	
	public Genero() {
		contador++;
		this.codGenero=contador;
		this.Genero ="Seleccione un genero";
	}
	
	public Genero( String genero) {
		super();
		contador++;
		this.codGenero=contador;
		Genero = genero;
	}


	public int getCodGenero() {
		return codGenero;
	}


	public void setCodGenero(int codGenero) {
		this.codGenero = codGenero;
	}


	public String getGenero() {
		return Genero;
	}


	public void setGenero(String genero) {
		Genero = genero;
	}


	@Override
	public String toString() {
		return Genero;
	}
	
	
}
