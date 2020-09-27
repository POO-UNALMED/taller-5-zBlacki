package zooAnimales;

public class Mamifero extends Animal{

	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	

	public void Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
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
	public void Mamifero() {
		this.totalMamiferos ++;
	}
	public int cantidadMamiferos() {
		return(this.caballos + this.leones);
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		this.setHabitat("pradera");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.caballos ++;
	}
	public void crearLeon(String nombre, int edad, String genero) {
		new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		this.setHabitat("selva");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.leones ++;
	}
	
}