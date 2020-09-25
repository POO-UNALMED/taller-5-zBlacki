package zooAnimales;
import gestion.*;

public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[0];
	
	public void Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas) {
	}
	public void Animal() {
	}
	public String movimiento() {	
		return ("desplazarse");
	}
	public void totalPorTipo() {
	}
	public String toString() {
		if (zona[0] != null) {
			return ("Mi nombre es " + this.nombre + " tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona[0] + ", en el " + this.zona[0].getZoologico());
		}
		else {
			return("Mi nombre es " + this.nombre + " tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero);
		}	
	}
	
}

class Mamifero extends Animal{
	
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	

	public void Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas, Mamifero[] listado, int caballos, int leones,	 boolean pelaje, int patas) {
	}
	public void Mamifero() {
	}
	public int cantidadMamiferos() {
		return(this.caballos + this.leones);
	}
	public void crearCaballo() {
		this.caballos ++;
	}
	public void crearLeon() {
		this.leones ++;
	}
	
}

class Ave extends Animal{
	
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public void Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas, Ave[] listado, int halcones, int aguilas,String colorPlumas) {
	}
	public void Ave() {
	}
	public void cantidadAves() {
	}
	public String movimiento() {
		return ("volar");
	}
	public void crearHalcon() {
	}
	public void crearAguila() {
	}
	
}

class Reptil extends Animal{
	
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public void Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas, Reptil[] listado, int iguanas, int serpientes ,String colorEscamas, int largoCola) {
	}
	public void Reptil() {
	}
	public void cantidadReptiles() {
	}
	public String movimiento() {
		return ("reptar");
	}
	public void crearIguana() {	
	}
	public void crearSerpiente() {
	}
	
}

class Pez extends Animal{
	
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public void Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas, Pez[] listado, int salmones, int bacalaos,String colorEscamas, int cantidadAletas) {
	}
	public void Pez() {
	}
	public void cantidadPeces() {
	}
	public String movimiento() {
		return ("nadar");
	}
	public void crearSalmon() {	
	}
	public void crearBacalao() {
	}
	
}

class Anfibio extends Animal{
	
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public void Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zonas, Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
	}
	public void Anfibio() {
	}
	public void cantidadAnfibios() {
	}
	public String movimiento() {
		return ("saltar");
	}
	public void crearRana() {	
	}
	public void crearSalamandra() {
	}
	
}




























































