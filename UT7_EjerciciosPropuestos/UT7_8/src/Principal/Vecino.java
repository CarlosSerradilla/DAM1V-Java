package Principal;

public class Vecino extends Persona
{
	private static double cuota;
	// Todos los objetos comparten el valor de las variables estáticas
	
	private String codigoVecino = "";
	private String codigoVivienda = "";
	private String finca = "";
	
	public Vecino()
	{
		super();
	}
	
	public Vecino(String nombre, int edad, String codigoVecino, String codigoVivienda, String finca) {
		super(nombre, edad);
		this.codigoVecino = codigoVecino;
		this.codigoVivienda = codigoVivienda;
		this.finca = finca;
	}
	
	

	public boolean codigoValido(String cadena)
	{
		int longitud = cadena.length();
		// Las condiciones se revisan en orden,
		//si la primera condición es cadena.charAt(0) != 'V' podemos recibir un error
		if (longitud < 1 || longitud > 5 || cadena.charAt(0) != 'V')
			return false;
		else
			return true;
	}
	
	public void modificarCuota(double cuota)
	{
		this.cuota = cuota;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Vecino [codigoVecino=" + codigoVecino + ", codigoVivienda=" + codigoVivienda + ", finca=" + finca + "]";
	}
	
	
	
}
