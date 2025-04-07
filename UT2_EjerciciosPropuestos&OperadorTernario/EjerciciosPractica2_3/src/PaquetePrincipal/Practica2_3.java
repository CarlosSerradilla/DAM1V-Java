package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_3
{

	public static void main(String[] args)
	{
		double pies,pulgadas;
		double piesEnCm,pulgadasEnCm;
		double cm;
		
		// UN pie es 30.48cm y una pulgada 2.54cm
		
		Scanner sc;
		sc = new Scanner (System.in);
		System.out.println("Introduzca la medida en pies:");
		pies = sc.nextInt();
		piesEnCm = pies * 30.48;
		System.out.println("Introduzca la medida en pulgadas:");
		pulgadas = sc.nextInt();
		pulgadasEnCm = pulgadas * 2.54;
		cm = piesEnCm + pulgadasEnCm;
		System.out.println("Es en total serían "+cm+" cm");
		sc.close();
	}
}