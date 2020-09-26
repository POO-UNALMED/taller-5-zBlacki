package zooAnimales;

public class Reptil extends Animal{
	
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public void Reptil(String nombre, int edad, String habitat, String genero ,String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;	
	}
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	public int getLargoCola() {
		return (this.largoCola);
	}
	public void Reptil() {
		this.totalReptiles ++;
	}
	public int cantidadReptiles() {
		return(this.iguanas + this.serpientes);
	}
	public String movimiento() {
		return ("reptar");
	}
	public void crearIguana(String nombre, int edad, String genero) {	
		new Reptil();
		this.colorEscamas = "verde";
		this.largoCola = 3;
		this.setHabitat("humedal");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.iguanas ++;
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		new Reptil();
		this.colorEscamas = "blanco";
		this.largoCola = 1;
		this.setHabitat("jungla");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.serpientes ++;
	}
	
}