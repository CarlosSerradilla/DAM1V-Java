package PaquetePrincipal;

import java.util.Scanner;

public class Practica2B_4
{

	public static void main(String[] args)
	{
		int numero,vAbsoluto;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		numero = sc.nextInt();
		vAbsoluto = (numero>=0)? numero : -numero;
		System.out.println("El valor aboluto es "+vAbsoluto);
		sc.close();
	}

}
