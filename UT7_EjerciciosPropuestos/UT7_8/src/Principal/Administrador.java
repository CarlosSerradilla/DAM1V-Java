package Principal;

public class Administrador extends Persona
{
	private int codigoAdmin;
	private String finca = "";
	private int numeroVecinos;
	private float salario;
	
	public Administrador()
	{
		super();
	}
	
	public Administrador(String nombre, int edad, String dni_nie, int codigoAdmin, String finca, int numeroVecinos,
			float salario) {
		super(nombre, edad, dni_nie);
		this.codigoAdmin = codigoAdmin;
		this.finca = finca;
		this.numeroVecinos = numeroVecinos;
		this.salario = salario;
	}

	public boolean codigoValido(String cadena)
	{
		int longitud = cadena.length();
		// Las condiciones se revisan en orden,
		//si la primera condición es cadena.charAt(0) != 'V' podemos recibir un error
		if (longitud < 1 || longitud > 5 || cadena.charAt(0) != 'A')
			return false;
		else
			return true;
	}
	
	public float salarioMaximo(float c)
	{
		this.salario = (numeroVecinos*c) / 2;
		return this.salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrador [codigoAdmin=" + codigoAdmin + ", finca=" + finca + ", numeroVecinos=" + numeroVecinos
				+ ", salario=" + salario + "]";
	}
	
	
}
