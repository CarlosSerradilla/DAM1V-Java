package Principal;

public class Consultor extends Empleado
{
	private double precioHora;
	private int numHoras;
	
	
	public Consultor(String nombre, String numSegSocial, double sueldo, double precioHora, int numHoras) {
		super(nombre, numSegSocial, sueldo);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}


	@Override
	public String toString()
	{
		return "Consultor: "+ super.toString() + "Precio Hora: " + precioHora + ", numHoras=" + numHoras + "]";
	}
	
	
	
}
