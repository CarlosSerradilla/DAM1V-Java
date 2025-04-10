package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String frase;
		String vector[];
		String resultado = "";
		System.out.println("Introduzca uba frase:");
		frase = sc.nextLine();
		
		vector = frase.split(" ");
		// El metodo "split" se ecarga de separar una String en subcadenas
		
		for(int i=0; i<vector.length; i++)
		{
			resultado = resultado + vector[i].charAt(0);
		}
			System.out.println(resultado);
		sc.close();

	}

}
