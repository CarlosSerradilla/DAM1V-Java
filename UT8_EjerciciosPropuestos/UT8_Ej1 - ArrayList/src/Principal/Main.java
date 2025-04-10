package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		ArrayList listaNumerica = new ArrayList();
		Scanner sc = new Scanner (System.in);
		int numeroIntroducido,sumaNumeros,numerosIndex = 0;
		double mediaAritm;
		
		sumaNumeros = 0;
		
		do {
			System.out.println("Introduzca un número entero o introduzca 0 para terminar");
			numeroIntroducido = sc.nextInt();
			
			sumaNumeros = sumaNumeros + numeroIntroducido;
			
			if (numeroIntroducido != 0)
			{
				listaNumerica.add(numeroIntroducido);
				numerosIndex++;
			}
			
			
			
		}while(numeroIntroducido != 0);
		
		System.out.println(listaNumerica);
		
		sc.close();
	}

}
