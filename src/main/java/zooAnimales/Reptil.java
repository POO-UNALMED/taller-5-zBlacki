package zooAnimales;

public class Reptil extends Animal{
	
	private Reptil[] listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero ,String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;	
		totalReptiles ++;
	}
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	public int getLargoCola() {
		return (this.largoCola);
	}
	public Reptil() {
		totalReptiles ++;
	}
	public int cantidadReptiles() {
		return(this.iguanas + this.serpientes);
	}
	public String movimiento() {
		return ("reptar");
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {	
		Reptil iguanodon = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
		return (iguanodon);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil culebron = new Reptil (nombre, edad, "jungla", genero, "blanco", 3);
		serpientes ++;
		return (culebron);
	}
	
}