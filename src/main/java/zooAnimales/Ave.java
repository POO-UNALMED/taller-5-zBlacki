package zooAnimales;

public class Ave extends Animal{
	
	private Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas() {
		return (this.colorPlumas);
	}
	public Ave() {
		totalAves ++;
	}
	public int cantidadAves() {
		return(this.halcones + this.aguilas);
	}
	public String movimiento() {
		return ("volar");
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halconero = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
		return (halconero);
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguilon = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas ++;
		return (aguilon);
	}
	
}
