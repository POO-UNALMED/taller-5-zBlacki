package zooAnimales;

public class Anfibio extends Animal{
	
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public void Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public void Anfibio() {
		this.totalAnfibios ++;
	}
	public int cantidadAnfibios() {
		return (this.ranas + this.salamandras);
	}
	public String movimiento() {
		return ("saltar");
	}
	public void crearRana(String nombre, int edad, String genero) {	
		new Anfibio();
		this.colorPiel = "rojo";
		this.venenoso = true;
		this.setHabitat("selva");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.ranas ++;
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Anfibio();
		this.colorPiel = "negro y amarillo ";
		this.venenoso = false;
		this.setHabitat("selva");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.salamandras ++;
	}
	public String getColorPiel() {
		return (this.colorPiel);
	}		
	
}
