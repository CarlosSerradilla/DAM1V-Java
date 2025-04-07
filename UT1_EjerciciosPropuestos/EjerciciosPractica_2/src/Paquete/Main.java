package Paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// Ejercicio 2
		int base,altura;
		int perimetro;
		int area;
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca la base:");
		base = sc.nextInt();
		System.out.println("Introduzca la altura:");
		altura = sc.nextInt();
		
		perimetro = (base + altura) * 2;
		area = base * altura;
		
		System.out.println("El perímetro es: "+perimetro);
		System.out.println("El área es: "+area);
		
		sc.close();
	}

}
