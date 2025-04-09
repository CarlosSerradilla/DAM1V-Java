package Principal;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Complejo c1,c2,c3,c4,c5,c6;
		
		c1 = new Complejo(2,3);
		c2 = new Complejo(3,4);
		
		// No se puede poner "c1 + c2" en su lugar hay que poner "c1.suma(c2)"
		c3 = c1.suma(c2);
		c4 = c1.diferencia(c2);
		
		c5 = c1.producto(c2);
		c6 = c1.cociente(c2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados "+c1+" y "+c2);
		System.out.println("La suma es "+c3);
		System.out.println("La diferencia es "+c4);
		System.out.println("El producto es "+c5);
		System.out.println("El cociente es "+c6);
		
		sc.close();
	}

}
