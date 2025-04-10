package Principal;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int fila;
		int n = 3;
		
		
		for(fila=n; fila>1; fila--) 
		{
			dibujaLinea(n-fila," ");
			dibujaLinea(fila*2 - 1,"*");
			System.out.println();
		}
		for(fila=1; fila<=n; fila++) 
		{
			dibujaLinea(n-fila," ");
			dibujaLinea(fila*2 - 1,"*");
			System.out.println();
		}
	}

	public static void dibujaLinea(int n, String symbol)
	{
		int i;
		for(i=1;i<=n;i++) 
		{
			System.out.print(symbol);
		}
	}
}