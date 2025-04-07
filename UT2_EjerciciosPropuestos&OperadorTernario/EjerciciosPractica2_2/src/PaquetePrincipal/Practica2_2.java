package PaquetePrincipal;

import java.util.Scanner;

public class Practica2_2
{

	public static void main(String[] args)
	{
		double gradosC;
		double gradosF;
		
		Scanner sc;
		sc = new Scanner (System.in);
		System.out.println("Ponga los grados centigrados:");
		gradosC = sc.nextInt();
		gradosF = 1.8 * gradosC + 32;
		System.out.println("Illo, en total eso serían "+gradosF+" grados Farenhein");
		sc.close();

	}

}
