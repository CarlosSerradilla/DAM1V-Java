package Principal;

public class Rectangulo
{
	// Coordenadas
	int x1,y1,x2,y2;
	int perimetro;
	int area;
	
	public Rectangulo(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		perimetro = x1 + y1 + x2 + y2;
		area = x1 * y1 + x2 * y2;
		// No estoy 100% seguro de que el área se calcule asi
	}
	
	public String toString()
	{
		String resultado;
		resultado = "Coordenadas ("+this.x1+","+this.y1+")"+"("+this.x2+","+this.y2+")";
		resultado += " -- Perímetro = "+perimetro;
		resultado += " -- Área = "+area;
		return resultado;
	}
}
