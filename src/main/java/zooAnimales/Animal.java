package zooAnimales;
import gestion.*;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona = new Zona();
	public static int totalMamiferos;
	public static int totalPeces;
	public static int totalAnfibios;
	public static int totalAves;
	public static int totalReptiles;
	
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	public Animal() {
	}
	public String movimiento() {	
		return ("desplazarse");
	}
	public static String totalPorTipo() {
		return ("Mamiferos: "  + totalMamiferos  + 
				"\nAves: "     + totalAves       + 
				"\nReptiles: " + totalReptiles   + 
				"\nPeces: "    + totalPeces      + 
				"\nAnfibios: " + totalAnfibios);
	}
	public String toString() {
		return ("Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F");	
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
