package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_1
{
	public static void main(String[] args)
	{
		double sinIva;
		double conIva;
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Ponga el precio del artículo sin Iva");
		sinIva = sc.nextDouble();
		conIva = sinIva * 1.21;
		System.out.println("El precio con Iva añadido es "+conIva);
		sc.close();
	}
}
