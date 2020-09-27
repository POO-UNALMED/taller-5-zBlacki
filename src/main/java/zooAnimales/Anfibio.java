package zooAnimales;

public class Anfibio extends Animal{
	
	private Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public Anfibio() {
		totalAnfibios ++;
	}
	public int cantidadAnfibios() {
		return (this.ranas + this.salamandras);
	}
	public String movimiento() {
		return ("saltar");
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio sapito = new Anfibio (nombre, edad, "selva", genero, "rojo", true);
		ranas ++;
		return (sapito);
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamonda = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras ++;
		return (salamonda);

	}
	public String getColorPiel() {
		return (this.colorPiel);
	}		
	public boolean isVenenoso() {
		return (this.venenoso);
	}
	
}
