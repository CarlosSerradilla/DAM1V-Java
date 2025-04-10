package Principal;

public class Main
{
	// Parentesis Balanceo
	public static void main(String[] args)
	{
		String cadena = "(9+8-7)*(78+6)";
		
		Expresion expresion = new Expresion(cadena);
		if (expresion.balanceo())
			System.out.println("La expresion esta balanceada");
		else
			System.out.println("La expresión NO esta balanceada");
		
	}

}
