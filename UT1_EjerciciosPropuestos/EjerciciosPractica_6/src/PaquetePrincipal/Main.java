package PaquetePrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// Ejercicio 6
		int segundosTotal;
		int horas,minutos,segundos;
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca los segundos:");
		segundosTotal = sc.nextInt();
		
		horas = segundosTotal / 3600;
		minutos = segundosTotal / 60 - horas * 60;
		segundos = segundosTotal - horas * 3600 - minutos * 60;
		
		System.out.println("Ahora mismo son las ");
		System.out.println("Hora: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
		
		sc.close();

	}

}
