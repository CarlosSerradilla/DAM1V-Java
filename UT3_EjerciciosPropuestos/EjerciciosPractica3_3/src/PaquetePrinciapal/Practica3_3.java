package PaquetePrinciapal;

import java.util.Scanner;

public class Practica3_3
{

	public static void main(String[] args)
	{
		Persona p1,p2;
		String dni,nombre,apellidos;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		//Persona 1
		System.out.println("Introduzca datos de la persona 1:");
		System.out.println("DNI: ");
		dni = sc.next();
		System.out.println("Nombre: ");
		nombre = sc.next();
		System.out.println("Apellidos: ");
		apellidos = sc.next();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		p1 = new Persona (dni,nombre,apellidos,edad);
		
		//Persona 2
		System.out.println("Introduzca datos de la persona 2:");
		System.out.println("DNI: ");
		dni = sc.next();
		System.out.println("Nombre: ");
		nombre = sc.next();
		System.out.println("Apellidos: ");
		apellidos = sc.next();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		p2 = new Persona (dni,nombre,apellidos,edad);
		
		System.out.println("Datos de la persona 1");
		System.out.println(p1);
		System.out.println("Datos de la persona 2");
		System.out.println(p2);
		
		sc.close();
	}

}
