package Principal;


public class Elemento
{
	private String nombre;
	private double precio;
	private int cantidad;
	
	// Método Constructor:
	public Elemento(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Elemento [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "] \n";
	}
	
	
}
