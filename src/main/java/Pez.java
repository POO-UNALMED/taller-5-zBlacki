package zooAnimales;

public class Pez extends Animal{
	
	private Pez[] listado;
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;	
	}
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	public int getCantidadAletas() {
		return (this.cantidadAletas);
	}
	public Pez() {
		this.totalPeces ++;
	}
	public int cantidadPeces() {
		return(this.salmones + this.bacalaos);
	}
	public String movimiento() {
		return ("nadar");
	}
	public Pez crearSalmon(String nombre, int edad, String genero) {	
		Pez nemo = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		salmones ++;
		return (nemo);		
	}
	public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalin = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		bacalaos ++;
		return (bacalin);
	}
	
}