package PaquetePrincipal;

import java.util.Scanner;

public class Practica2B_5
{

	public static void main(String[] args)
	{
		int year;
		String resultado;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un año: ");
		year = sc.nextInt();
		resultado = (year%4==0 && year%100!=0 || year%400 == 0)? "SI es bisiesto" : "NO es bisiesto";
				// El año tiene que ser divisible entre 4 PERO no ser divisible entre 100...
				//...o se divisible entre 400
		System.out.println("El año es "+resultado);
		sc.close();

	}
}