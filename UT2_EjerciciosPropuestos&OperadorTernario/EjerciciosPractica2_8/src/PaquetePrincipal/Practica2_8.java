package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_8
{

	public static void main(String[] args)
	{
		int var1,var2;
		int varSuma,varResta,varMulti,varDivi;
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca dos números:");
		var1 = sc.nextInt();
		var2 = sc.nextInt();
		
		varSuma = var1 + var2;
		varResta = var1 - var2;
		varMulti = var1 * var2;
		varDivi = var1 / var2;
		
		System.out.println("Los valores son:");
		System.out.println("Suma: "+varSuma);
		System.out.println("Resta: "+varResta);
		System.out.println("Multiplicación: "+varMulti);
		System.out.println("División: "+varDivi);
		sc.close();
	}

}
