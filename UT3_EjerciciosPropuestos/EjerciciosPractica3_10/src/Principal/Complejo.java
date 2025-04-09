package Principal;

public class Complejo
{
	// Atributos
	float X,Y; // Forma cartesiana
	float rho, alfa; // Forma polar
	
	// Constructor/es
	public Complejo(float X, float Y)
	{
		this.X = X;
		this.Y = Y;
		this.B2P(); //MUY IMPORTANTE, me faltaba esto
	}
	
	public void B2P()
	{
		this.rho = (float) Math.sqrt(Math.pow(this.X,2)+Math.pow(Y,2));
		this.alfa = (float) Math.atan2(this.Y, this.X);
	}
	public void P2B()
	{
		this.X = (float) (this.rho * Math.cos(this.alfa));
		this.Y = (float) (this.rho * Math.sin(this.alfa));
	}
	
	// En esta funcion se ponen los calculos directamente en la llamada del constructor
	public Complejo suma(Complejo c)
	{
		Complejo resultado;
		resultado = new Complejo (this.X+c.X,this.Y+c.Y);
		return resultado;
	}
	
	// En esta segubnda función primero se calcula y luego se hace la llamada al constructor
	public Complejo diferencia(Complejo c)
	{
		Complejo resultado;
		float a,b;
		a = this.X - c.X;
		b = this.Y - c.Y;
		resultado = new Complejo (a,b);
		return resultado;
	}
	
	public void setPolares(float rho, float alfa)
	{
		this.rho = rho;
		this.alfa = alfa;
		this.P2B();
	}
	
	public Complejo producto(Complejo c)
	{
		Complejo resultado;
		float r,a;
		r = this.rho * c.rho;
		a = this.alfa + c.alfa;
		resultado = new Complejo(0,0);
		resultado.setPolares(r,a);
		return resultado;
	}
	
	public Complejo cociente(Complejo c)
	{
		Complejo resultado;
		float r,a;
		r = this.rho / c.rho;
		a = this.alfa - c.alfa;
		resultado = new Complejo(0,0);
		resultado.setPolares(r,a);
		return resultado;
	}
	
	private float rad2gra(float radianes)
	{
		float resultado;
		resultado = (float) (radianes * 180 / Math.PI);
		return resultado;
	}
	
	public String toString()
	{
		String resultado;
		resultado = "("+this.X+","+this.Y+")";
		resultado += "Rho= "+this.rho+" / Alfa= "+this.alfa+")";
		resultado += this.rad2gra(this.alfa)+"º";
		return resultado;
	}
}