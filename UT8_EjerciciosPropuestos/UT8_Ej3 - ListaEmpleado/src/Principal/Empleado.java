package Principal;

public class Empleado implements Comparable<Empleado>
{
	// Para que una clase tenga orden natural...
	
	private String nombre, numSegSocial;
	private double sueldo;
	
	// Si no tenemos información extra por defecto creamos un constructor
	public Empleado(String nombre, String numSegSocial, double sueldo) {
		super();
		this.nombre = nombre;
		this.numSegSocial = numSegSocial;
		this.sueldo = sueldo;
	}

	public String getNSS()
	{
		return numSegSocial;
	}
	
	@Override
	public String toString() {
		return nombre + ", numSegSocial=" + numSegSocial + ", sueldo=" + sueldo;
	}

	@Override
	public int compareTo(Empleado o) 
	{
		int resultadoComparaNombre = this.nombre.compareTo(o.nombre);
		int resultadoComparaNSS = this.numSegSocial.compareTo(o.numSegSocial);
		// MUY IMPORTANTE la o, si no se compara consigo mismo
		
		int resultadoComparaSalario = new Double(this.sueldo).compareTo(this.sueldo);
			// Como no se puede comparar las variables double lo convierto en un Double
		
		if(resultadoComparaNombre != 0)
			return resultadoComparaNombre;
		else
			if (resultadoComparaNSS != 0)
				return resultadoComparaNSS;
			else
				return resultadoComparaSalario;
	}
	
	
}
