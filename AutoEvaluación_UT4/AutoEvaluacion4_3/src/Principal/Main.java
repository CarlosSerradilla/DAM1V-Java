package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int laVariableDeBabel = 0;
		int laVariableLeyenda;
		int numerosIntroducidos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		laVariableLeyenda = sc.nextInt();
		laVariableDeBabel = laVariableDeBabel + laVariableLeyenda;
		numerosIntroducidos++;
			double media = laVariableLeyenda;
		System.out.println("Hasta que la suma de todos los numeros no supere 10000 deberas seguir poniendo números");

		while(laVariableDeBabel <= 10000)
		{
			System.out.println("Aún no se ha superado el número");
			System.out.println("Introduce otro número:");
			laVariableLeyenda = sc.nextInt();
			laVariableDeBabel = laVariableDeBabel + laVariableLeyenda;
			numerosIntroducidos++;
			media = laVariableDeBabel / numerosIntroducidos;
		}
		
		System.out.println("Has superado el numero 10000");
		System.out.println("El número final es "+laVariableDeBabel);
		System.out.println("Has escrito un número "+numerosIntroducidos+" veces");
		System.out.println("La media de todos los números es "+media);
		
		
		sc.close();
	}
}