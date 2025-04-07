package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_5
{

	public static void main(String[] args)
	{
		int dd,mm,aaaa;
		String fechaFinal;
		
		// Poner la fecha actual mi bro
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca el día actual, luego el mes, y finalmente el año:");
		dd = sc.nextInt();
		mm = sc.nextInt();
		aaaa = sc.nextInt();
		
		fechaFinal = String.format("%02d", dd) + "/" +
				String.format("%02d", mm) + "/" +
				String.format("%02d", aaaa);
		
		System.out.println("Hoy es el "+fechaFinal);
		sc.close();
	}

}
