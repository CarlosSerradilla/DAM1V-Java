package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_10
{

	public static void main(String[] args)
	{
		/*	Calculos:
		NF = NT+0.7+NL*0.3
		NT = (C1+C2+C3)/3*/
		
		double C1,C2,C3;
		double NL;
		double NT;
		final double NF = 5;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca las notas del primer y segundo exámen: ");
		C1 = sc.nextDouble();
		C2 = sc.nextDouble();
		System.out.print("Introduzca la nota del laboratorio: ");
		NL = sc.nextDouble();
		NT = (NF - NL * 0.3) / 0.7;
		C3 = 3 * NT - C1 - C2;
		System.out.println("Tienes que sacar un "+C3+" en el siguiente examen como mínimo para aprobar");
		sc.close();
	}

}
