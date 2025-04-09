package Principal;

import java.util.Scanner;

public class Main_Ut4_22
{
	public static void main(String[] args)
	{
		int n;
		int fila;
		int columna;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el la cantidad de asteriscos que quiere que tenga el cuadrado de ancho y alto");
		n = sc.nextInt();
		
		for(fila = 1;fila<=n;fila++)
		{
			for(columna = 1;columna<=n;columna++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}