package PaquetePrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// Ejercicio 5
		int horas,minutos,segundos;
		int segundosTotal;
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca la hora:");
		horas = sc.nextInt();
		System.out.println("Introduzca los minutos:");
		minutos = sc.nextInt();
		System.out.println("Introduzca os segundos:");
		segundos = sc.nextInt();
		
		segundosTotal = horas * 3600 + minutos * 60 + segundos;
		
		System.out.println("En total los segundos que han pasado son "+segundosTotal);
		
		sc.close();

	}

}
