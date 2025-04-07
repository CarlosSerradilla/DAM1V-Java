package PaquetePrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// Ejercicio 3
		float euros;
		float dolares;
		String resultado;
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca los dolares:");
		dolares = sc.nextFloat();
		
		euros = dolares / 111 * 100;
		resultado = String.format("%.2f", euros); //Esta linea sirve para reducir los decimales a dos
		
		System.out.println("Eso en euros sería "+resultado+"€");
		
		sc.close();
	}
}