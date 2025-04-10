package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		char letrasArray[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
					'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
		// También podríamos hacer:
		// String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// char vector[];
		// vector = mayusculas.toCharArray();
		
		int numero;
		String cadena = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdúzca índices");
		numero = sc.nextInt();
		while(numero != -1) {
			if(numero >= 0 && numero<letrasArray.length)
			{
				cadena = cadena + letrasArray[numero];
				System.out.println(cadena);
			}
			else
				System.out.println("Error, inserte otro número");
			
			numero = sc.nextInt();
		}
		
		System.out.println("Cadena final = "+cadena);
		sc.close();
	}

}
