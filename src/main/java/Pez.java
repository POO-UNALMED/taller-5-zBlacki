package zooAnimales;

public class Pez extends Animal{
	
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public void Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
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
	public void Pez() {
		this.totalPeces ++;
	}
	public int cantidadPeces() {
		return(this.salmones + this.bacalaos);
	}
	public String movimiento() {
		return ("nadar");
	}
	public void crearSalmon(String nombre, int edad, String genero) {	
		new Pez();
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		this.setHabitat("oceano");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.salmones ++;
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		new Pez();
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		this.setHabitat("oceano");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.bacalaos ++;
	}
	
}