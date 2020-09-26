package zooAnimales;
import gestion.*;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[0];
	public static int totalMamiferos;
	public static int totalPeces;
	public static int totalAnfibios;
	public static int totalAves;
	public static int totalReptiles;
	
	public void Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	public void Animal() {
	}
	public String movimiento() {	
		return ("desplazarse");
	}
	public String totalPorTipo() {
		return ("Mamiferos: "  + this.totalMamiferos  + 
				"\nAves: "     + this.totalAves       + 
				"\nReptiles: " + this.totalReptiles   + 
				"\nPeces: "    + this.totalPeces      + 
				"\nAnfibios: " + this.totalAnfibios);
	}
	public String toString() {
		if (zona[0] != null) {
			return ("Mi nombre es " + this.nombre + " tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona[0] + ", en el " + this.zona[0].getZoologico());
		}
		else {
			return("Mi nombre es " + this.nombre + " tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero);
		}	
	}
	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}
	public void setEdad(int edadNueva) {
		this.edad = edadNueva;
	}
	public void setHabitat(String habitatNuevo) {
		this.habitat = habitatNuevo;
	}
	public void setGenero(String generoNuevo) {
		this.genero = generoNuevo;
	}
	public String getNombre() {
		return (this.nombre);
	}
	public String getHabitat() {
		return (this.habitat);
	}
	public String getGenero() {
		return (this.genero);
	}
	public int getEdad() {
		return (this.edad);
	}
}