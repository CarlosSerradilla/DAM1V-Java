package Principal;

// Hay que poner extends detrás de la clase que esta herdeando seguido de la clase A LA QUE hereda
// Aquí me daba un error hasta que creé el constructor
public class Trabajador extends Persona
{
	String categoriaProfesional = "";
	int antigüedad;
	
	public Trabajador(String name, int telf, int edad, String categoriaProfesional, int antigüedad) {
		super(name, telf, edad);
		this.categoriaProfesional = categoriaProfesional;
		this.antigüedad = antigüedad;
	}
	
	
}
