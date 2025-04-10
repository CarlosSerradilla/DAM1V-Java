package Principal;

public class CuentaCorriente
{
	// Atributos
	String dni;
	String nombreT;
	
	double saldo;
	
	double ingresar;
	double cantidad;
	
	// Constuctor
	public CuentaCorriente(String dni, String nombreT, double saldo, double cantidadIngresar)
	{
		this.dni = dni;
		this.nombreT = nombreT;
		this.saldo = saldo;
		this.ingresar = ingresar;
	}
	
	public void saldo()
	{
		this.saldo = this.saldo+cantidad;
	}
	public boolean sacar(float retirada)
	{
		this.saldo = this.saldo+cantidad;
	}

	public String toString()
	{
		String resultado;
		return resultado;
	}
}