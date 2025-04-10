package Principal;

public class Comercial extends Empleado
{
	private double comision;

	public Comercial(String nombre, String numSegSocial, double sueldo, double comision) {
		super(nombre, numSegSocial, sueldo);
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Comercial: "+super.toString()+ "Comision=" + comision;
	}
	
	
	
}
