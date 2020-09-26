package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {

	private String nombre;
	private Zoologico[] zoo = new Zoologico[0];
	private ArrayList<Animal> animales = new ArrayList<Animal>(); 
	
	public void Zona(String nombre, Zoologico[] zoo) {
	}
	public void Zona() {
	}
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	public int cantidadAnimales() {
		return (animales.size());
	}
	public Zoologico getZoologico() {
		return (this.zoo[0]);
	}
	
}
