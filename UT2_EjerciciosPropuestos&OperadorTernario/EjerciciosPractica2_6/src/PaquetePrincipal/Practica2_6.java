package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_6
{

	public static void main(String[] args)
	{
		int x;
		int P;
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca el valor de X para calcular el polinomio:");
		x = sc.nextInt();
		P = (x * x) + 3 * x + 5;
		
		System.out.println("El polinomio es "+P);
		sc.close();

	}
}