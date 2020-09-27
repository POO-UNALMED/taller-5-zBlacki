package zooAnimales;

public class Mamifero extends Animal{

	private Mamifero[] listado;
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	public boolean getPelaje() {
		return (this.pelaje);
	}
	public int getPatas() {
		return (this.patas);
	}
	public Mamifero() {
		totalMamiferos ++;
	}
	public int cantidadMamiferos() {
		return(this.caballos + this.leones);
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero horsi = new Mamifero (nombre, edad, "pradera", genero, true, 4);
		caballos ++;
		return (horsi);
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leono = new Mamifero (nombre, edad, "selva", genero, true, 4);
		leones ++;
		return (leono);
	}
	public boolean isPelaje() {
		return(this.pelaje);
	}
	
}