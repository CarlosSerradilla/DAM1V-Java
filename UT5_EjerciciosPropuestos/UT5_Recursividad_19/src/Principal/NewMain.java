package Principal;

import java.util.Scanner;

public class NewMain {

	public static void main(String[] args)
	{
		String resultado;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		n = sc.nextInt();
		resultado = decimal2binario(n);
		System.out.println("El número binario es "+resultado);
		resultado = "0b" + resultado;
		System.out.println("El número en valor binario es "+resultado.valueOf(n));
		sc.close();

	}
	
	public static String decimal2binario(int n)
	{
		String resultado = "";
		if(n == 0 || n == 1)
			resultado = String.valueOf(n);
		else
			resultado = decimal2binario(n/2) + n%2;
		return resultado;
	}

}
