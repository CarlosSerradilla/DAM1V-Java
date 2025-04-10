package Principal;

public class Contacto
{
	private String nombre;
	private String telefono;
	private String correo;
	
	public Contacto(String nombre, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Contacto: " + nombre + ", telefono: " + telefono + ", correo: " + correo + "]";
	}
	
	
}