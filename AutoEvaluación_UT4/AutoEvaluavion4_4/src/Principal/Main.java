package Principal;

import java.util.Iterator;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int n, fila, columna;
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		System.out.println("introduce number");
		
		for (fila=1;fila<=n;fila++) 
		{
			System.out.println("");
			for (columna=1;columna<=fila;columna++) 
			{
				
				System.out.print(+n);
				
			}
		}
		
		sc.close();
	}

}
