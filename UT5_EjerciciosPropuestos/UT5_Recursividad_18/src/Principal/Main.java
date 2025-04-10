package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String cadena;
		boolean exito;
		
		System.out.println("Introduzca un número binario:");
		cadena = sc.nextLine();
		exito = esBinario(cadena);
		if(exito)
			System.out.println("El número esta en binario");
		else
			System.out.println("El número NO esta en binario");

		sc.close();
	}
	
	public static boolean esBit(char d)
	{
		if(d == '0' || d == '1')
			return true;
		else
			return false;
	}
	
	public static boolean esBinario(String s)
	{
		if (s.length()==1) //caso base
			return esBit(s.charAt(0)); //charAt sirve para sacar un dígito de una cadena
		else
		{
			boolean resultado = esBit(s.charAt(0)) &&
								esBinario(s.substring(1));
			return resultado;
		}
	}

}
