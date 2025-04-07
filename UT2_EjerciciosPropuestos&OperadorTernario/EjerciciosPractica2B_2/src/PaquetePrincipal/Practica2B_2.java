package PaquetePrincipal;

import java.util.Scanner;

public class Practica2B_2
{

	public static void main(String[] args)
	{
		int num;
		String numString;
		
		Scanner sc;
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		numString = (num%2==0)?" es par":" es impar";
		System.out.println("El número elegido"+numString);
		
		sc.close();
	}

}
