package PaquetePrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ejercicio 7
		double num1,num2,num3,num4;
		double mediaAritmetica;
		double varianza;
		double loOtroQueNiIdeaDeComoSeHace; //desviación típica
		
		/*Scanner sc;
		sc = new Scanner(System.in);*/ //En vez de hacer esto en dos lineas...
		Scanner sc = new Scanner(System.in); //Se puede hacer esto en una sola línea
		
		System.out.println("Introduzca el primer número para hacer el cálculo:");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el siguiente número:");
		num2 = sc.nextDouble();
		System.out.println("Introduzca el siguiente número:");
		num3 = sc.nextDouble();
		System.out.println("Introduzca el último número:");
		num4 = sc.nextDouble();
		
		mediaAritmetica = (num1 + num2 + num3 + num4) / 4;
				
		varianza = (Math.pow(num1-mediaAritmetica,2)+Math.pow(num2-mediaAritmetica,2)
			+Math.pow(num3-mediaAritmetica,2)+Math.pow(num4-mediaAritmetica,2))/4;
			// Math.pow sirve para poder calcular exponentes
		
		loOtroQueNiIdeaDeComoSeHace = Math.sqrt(varianza);
			// Math.sqrt sirve para calcular la raiz cuadrada
		
		System.out.println("La media aritmética es "+mediaAritmetica);
		System.out.println("La desviación típica es "+loOtroQueNiIdeaDeComoSeHace);
		System.out.println("La varianza es "+varianza);
		
		sc.close();
	}

}
