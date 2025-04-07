package PaquetePrincipal;

import java.util.Scanner;

public class Practica2B_1
{

	public static void main(String[] args)
	{
		int a,b;
		int menor,mayor;
		Scanner sc;
		
		sc = new Scanner (System.in);
		System.out.println("Introduzca dos números:");
		a = sc.nextInt();
		b = sc.nextInt();
		// Procesamiento
		mayor = (a>b)? a : b; 
		menor = (a<b)? a : b; 
		System.out.println("Los números ordenados son "+mayor+" como el mayor y "+menor+" como el menor");
		sc.close();

	}

}
