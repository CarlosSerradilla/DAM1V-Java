package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_4
{

	public static void main(String[] args)
	{
		double pesoKG,alturaM;
		double formulaIMC;
		
		// Formula pesa / altura al cuadrado
		
		Scanner sc;
		sc = new Scanner (System.in);
		System.out.println("Introduzca el peso en KG:");
		pesoKG = sc.nextDouble();
		System.out.println("Introduzca la altura en metros:");
		alturaM = sc.nextDouble();
		formulaIMC = pesoKG / (alturaM * alturaM);
		System.out.println("En total tu Indice de Masa Corporal es "+formulaIMC);
		sc.close();

	}

}
