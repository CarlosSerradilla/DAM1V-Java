package Principal;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_Ut4_24
{

	public static void main(String[] args)
	{
		String entrada;
		String salida="";
		String salida2="";
		// Es obligatorio inicializar la string salida vacia para que no de error
		
		int i;
		
		StringTokenizer fraseXPalabras;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca una frase para ver como se escribe al revés, como un palíndromo");
		entrada = sc.nextLine();
		// Si ponermos "next" en vez de "nextLine" solo va a invertir la primera palabra
		
		// Con este bucle le damos la vuelta a la frase pero no a las palabras
		fraseXPalabras = new StringTokenizer (entrada," ");
		while (fraseXPalabras.hasMoreTokens())
		{
			salida = fraseXPalabras.nextToken()+" "+salida;
		}
		
		// Con este bucle le damos la vuelta a la frase y a las palabras
		for(i=0;i<entrada.length();i++)
		{
			salida2 = entrada.charAt(i) + salida2;
		}
		System.out.println("La frase al revés es: ");
		System.out.println(salida);
		System.out.println("Si también le damos la vuelta a las palabras: ");
		System.out.println(salida2);
		
		sc.close();
	}

}
