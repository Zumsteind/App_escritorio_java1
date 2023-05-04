package Ejercicio;

public class Peliculas implements Comparable {
	private static int contador=1;
	private int id;
	private String nombre;
	private Genero genero;
	
	Peliculas(){
		this.id=contador;
		contador++;
	}
	
	public Peliculas( String nombre, Genero genero) {
		this.id = contador;
		this.nombre = nombre;
		this.genero = genero;
		contador++;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getContador() {
		return contador;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ID: " + id + "   -   NOMBRE: " + nombre + "   -  GENERO: " + genero ;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		 Peliculas p = (Peliculas) arg0;
		    return this.nombre.compareTo(p.nombre);
	}

	
	
	
}