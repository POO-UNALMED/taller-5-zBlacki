package zooAnimales;

public class Ave extends Animal{
	
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public void Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		
	}
	public String getColorPlumas() {
		return (this.colorPlumas);
	}
	public void Ave() {
		this.totalAves ++;
	}
	public int cantidadAves() {
		return(this.halcones + this.aguilas);
	}
	public String movimiento() {
		return ("volar");
	}
	public void crearHalcon(String nombre, int edad, String genero) {
		new Ave();
		this.colorPlumas = "cafe glorioso";
		this.setHabitat("montanas");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.halcones ++;
	}
	public void crearAguila(String nombre, int edad, String genero) {
		new Ave();
		this.colorPlumas = "blanco y amarillo";
		this.setHabitat("montanas");
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGenero(genero);
		this.aguilas ++;
	}
	
}
