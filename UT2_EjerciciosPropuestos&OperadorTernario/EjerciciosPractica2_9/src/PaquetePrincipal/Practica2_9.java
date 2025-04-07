package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_9 {

	public static void main(String[] args)
	{
		int varMagica = 12345679;
		//int varMagica = 1,2,3,4,5,6,7,9;
		int varUsuario;
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número entre el 1 y el 9:");
		varUsuario = sc.nextInt();
		
		varUsuario = varUsuario * 9;
		varMagica = varMagica * varUsuario;
		
		System.out.println("El número mágico es "+varMagica);
		sc.close();
	}
}