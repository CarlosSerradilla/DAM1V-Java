package Principal;

import java.util.Scanner;

public class Main_Ut4_23 
{

	public static void main(String[] args) 
	{
		int n, fila, columna;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("introduce un numero para la piramide");
		
		n = sc.nextInt();
		
		for (fila=1;fila<=n;fila++) 
		{
			System.out.println("");
			for (columna=1;columna<=fila;columna++)
			{
				System.out.print("*");
			}
			
		}

	}

}
