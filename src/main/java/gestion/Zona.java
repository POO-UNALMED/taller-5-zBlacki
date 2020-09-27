package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {

	private String nombre;
	private Zoologico zoo = new Zoologico();
	private ArrayList<Animal> animales = new ArrayList<Animal>(); 
	
	public Zona(String nombre, Zoologico zool) {
		this.nombre = nombre;
		this.zoo = zool; 
	}
	public Zona() {
	}
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	public int cantidadAnimales() {
		return (animales.size());
	}
	public Zoologico getZoo() {
		return (this.zoo);
	}
	public String getNombre() {
		return(this.nombre);
	}
	
	
	
}
