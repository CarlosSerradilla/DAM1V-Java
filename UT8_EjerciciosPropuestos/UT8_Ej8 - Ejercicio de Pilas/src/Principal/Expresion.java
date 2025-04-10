package Principal;

import java.util.Stack;

public class Expresion
{
	private String expresion;
	Stack<Character> pila; 	// Colcección de tipo pila
	// LAS COLECCIONES NO ADMITEN VARIABLES SIMPLES (char, int, double)
	
	// Método constructor
	public Expresion(String expresion)
	{
		pila = new Stack<>();
		this.expresion = expresion;
	}
	
	public boolean balanceo()
	{
		char simbolo;
		for(int i=0; i<expresion.length(); i++)
		{
			simbolo = expresion.charAt(i);
			if (simbolo == '(') // Si el simbolo es la apertura de un parentesis se tiene que guarsdar en la pila
				pila.push(simbolo);
			else
				if(simbolo == ')') // Si el simbolo es ) se tine que sacar de la pila
				{
					if (pila.empty())
						return false;
					else
						pila.pop(); // pop se encarga de eliminar en la pila
				}
		}
		// Si me queda algo en la pila no esta balanceada
		if(pila.isEmpty())
			return true;
		else
			return false; 
	}
}
