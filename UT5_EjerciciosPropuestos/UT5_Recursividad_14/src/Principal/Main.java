package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int alto = 0, ancho = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca alto y ancho:");
			try
			{
				alto = sc.nextInt();
				ancho = sc.nextInt();
			}catch(InputMismatchException e)
			{
				sc.nextLine();
			}
			
			if(alto<=0 || ancho<=0)
				System.out.println("Los valores deben de ser positivos");
		}while(alto<=0 || ancho<=0);
		
		
		dibujaRectangulo(alto, ancho);
		
		System.out.println("Alto: "+alto+" | Ancho: "+ancho);
		
	}
	
	// Recursividad enter in the chat
	public static void dibujaRectangulo(int alto, int ancho)
	{
		if(alto == 1)
			dibujaLinea(ancho);
		else {
			dibujaLinea(ancho);
			dibujaRectangulo(alto-1,ancho);
		}
	}
	
	public static void dibujaLinea(int ancho)
	{
		for (int i=1; i<=ancho; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}