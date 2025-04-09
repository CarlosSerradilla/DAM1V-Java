package PaquetePrincipal;

public class Punto
{
	// Ejercicio 2 de la práctica 3

	// Atributos
	private int x;
	private int y;
	
	// Constructores
	// Se recomienda como mínimo un constructor por defecto
	// Siempre se llama como la clase, es público, y se hace sin argumentos
	public Punto()
	{
		this.x = 0;
		this.y = 0;
	}
	
	//Es recomendable nombrar a los argumentos igual que a las variables
	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	// Esta función sirve para asignar una string en la cual se ordenara como queremos
	//que aparezcan las cosas en la consola
	public String toString()
	{
		String resultado;
		resultado = "("+this.x+","+this.y+")";
		return resultado;
	}
}
