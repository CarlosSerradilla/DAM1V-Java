package PaquetePrincipal;

import java.util.Scanner;

public class Practica2B_6
{

	public static void main(String[] args)
	{
		int numero;
		String resultado;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		numero = sc.nextInt();
		resultado = (numero>0)? "positivo":(numero<0)?"negativo":"cero";
		System.out.println("El número es "+resultado);
		sc.close();

	}

}
