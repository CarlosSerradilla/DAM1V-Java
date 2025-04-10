package Principal;

public enum TarifaScript
//Con este script crearimos una nueva clase a través del método enumerado
{
	NORMAL(0), ALTA(40), URGENTE(60);
	private double costeAdicional;
	
	private TarifaScript(double costeAdicional)
	{
		this.costeAdicional = costeAdicional;
	}
	
	public double getCosteAdicional()
	{
		return this.costeAdicional;
	}
	
	public String toString()
	{
		String resultado;
		
		resultado = TarifaScript.ALTA.name()+""+this.costeAdicional;
		
		return resultado;
	}
}
