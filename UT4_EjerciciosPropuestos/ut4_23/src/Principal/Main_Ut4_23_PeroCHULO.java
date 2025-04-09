package Principal;

import java.util.Scanner;

public class Main_Ut4_23_PeroCHULO {

	public static void main(String[] args)
	{
		int n, fila, columna;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("introduce un numero para la piramide");
		
		n = sc.nextInt();
		
		for (fila=1;fila<=n;fila++) 
		{
			System.out.println("");
			for (columna=1;columna<=(n-fila);columna++)
			{
				// Imprime los espacios en blanco
				System.out.print(" ");
			}
			for (columna=1;columna<=fila;columna++)
			{
				// Imprime los asteriscos
				System.out.print("* ");
			}
		}
	}
}