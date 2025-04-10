package Principal;

public class Zona
{
	private int entradasPorVender;
	
	public Zona(int n) {
		this.entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return this.entradasPorVender;
	}

	
	public boolean vender(int n) {
		boolean exito = false;
		if(n <= this.entradasPorVender)
		{
			this.entradasPorVender -= n;
			exito = true;
		}
		// else: exito = false;
		
		return exito;
	}
	
	public String toString()
	{
		String resultado="";
		//this.;
		resultado = "Entradas dusponibles " +this.entradasPorVender;
		return resultado;
	}
}