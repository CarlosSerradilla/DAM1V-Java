package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int unidades;
		double precioPorUnidad, precioFinal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuántas unidades vas a comprar? (Min 1 | Max 99)");
		System.out.println("Se aplicara un descuento del 5% para compras más de 10 unidades");
		unidades = sc.nextInt();
		while(unidades < 1 || unidades > 99)
		{
			System.out.println("Cantidad inválida. Elija una cantidad válida");
			unidades = sc.nextInt();
		}
		
		System.out.println("¿Cuánto cuesta cada unidad? (Min 0,50 | Max 9,99)");
		precioPorUnidad = sc.nextDouble();
		while(precioPorUnidad < 0.50 || precioPorUnidad > 9.99)
		{
			System.out.println("Cantidad inválida. Elija una cantidad válida");
			precioPorUnidad = sc.nextDouble();
		}
		
		precioFinal = unidades * precioPorUnidad;
		
		// Se revisa si se aplica el descuento con el siguiente operador condicional
		if(unidades > 10)
		{
			precioFinal = precioFinal * 0.95;
		}
		System.out.println("El precio final es "+precioFinal);
		
		sc.close();
	}
}