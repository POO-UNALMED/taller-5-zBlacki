package gestion;
import java.util.*;
import zooAnimales.*;

public class Zoologico {
	
	private String nombre;
	private String localizacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>(); 
	
	public Zoologico(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
	}
	public Zoologico() {
	}
	public int cantidadTotalAnimales() {
		int contador = 0;
		for (int i = 0; i < zonas.size(); i ++) {
			contador += zonas.get(i).cantidadAnimales();
		}
		return(contador);
	}
	public void agregarZonas(Zona zonaNueva) {
		zonas.add(zonaNueva);
	}
	public ArrayList<Zona> getZona() {
		return (this.zonas);
	}
	public String getNombre() {
		return (this.nombre);
	}
}