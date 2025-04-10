package Principal;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		CuentaCorriente cuenta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del titular de la cuenta: ");
		nombreT = sc.nextString();
		System.out.println("Introduzca el dni: ");
		dni = sc.nextDouble();
		
		sc.close();
	}

}