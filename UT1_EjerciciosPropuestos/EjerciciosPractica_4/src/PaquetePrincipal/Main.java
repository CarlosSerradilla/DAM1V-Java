package PaquetePrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float radio;
		float perimetro,area,volumen;
		final float pi = 3.14159f;
		// Hay que poner "f" después de cada número flotante para definirlo como flotante
		// "final" se usa para que la variable ya no pueda ser modificada
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca el radio:");
		radio = sc.nextFloat();
		
		perimetro = 2 * pi * radio;
		area = pi * radio * radio;
		volumen = 4 * pi * radio * radio * radio / 3;
		
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El área es: "+area);
		System.out.println("El volumen es: "+volumen);
		sc.close();
	}

}
