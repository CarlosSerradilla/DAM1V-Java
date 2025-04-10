package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String nombre = "Sanchez";
		// Esto es un nombre hardcodeado, osea, que viene incrustado en el código
		String cadena;	
		int intentos = 0; // Contador
		boolean GameOver = false;
		
		do {
		System.out.println("Introduzca un nombre");
		cadena = sc.nextLine();
		intentos++;
		if(cadena.equals(nombre))
		{
			GameOver = true;
		}
		else
		{
			System.out.println(intentos+"ª Introducción: "+cadena+" -> ");
			System.out.println(intentos+"ª pista: "+nombre.substring(0, intentos));
			// Extraerá la cadena desde la posición 0 hasta la pocición "intentos", sin contar intentos
		}
		
		}while(intentos < nombre.length() && !GameOver);
		if(GameOver)
		{
			System.out.println("Has ganado");
		}
		else
			System.out.println("Te has quedado sin intentos");
		// Las dos tienen que ser ciertas para que el bucle se repita
		//De esta manera se saldra del bucle en cuanto se cumpla una de estas dos condiciones
		
		sc.close();
	}
}