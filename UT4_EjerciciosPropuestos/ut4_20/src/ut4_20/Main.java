package ut4_20;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int ElPrimo;
		int ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas;
		int YSiNoLasTraesYSiNoLasTraesEresUnImbDeM;
		int i;
		int contadorPrimos=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número para ver los números primos entre 1 y el número puesto");
		ElPrimo = sc.nextInt();
		
		for (ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas=1;ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas<=ElPrimo;ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas++)
		{
			YSiNoLasTraesYSiNoLasTraesEresUnImbDeM = 0;
			for(i=1;i<=ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas;i++)
			{
				if (ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas%i == 0)
				{
					YSiNoLasTraesYSiNoLasTraesEresUnImbDeM++;
				}
			}
			if (YSiNoLasTraesYSiNoLasTraesEresUnImbDeM <= 2)
			{
				System.out.print(ahoraQueSomosAmigosPodemosHacerUnaPijamadaConTusPrimas+" ");
				contadorPrimos++;
			}
		}
		System.out.println("");
		System.out.println("Hay "+contadorPrimos+" en total");
		
		sc.close();
		
		//https://www.youtube.com/watch?v=fZT5tGKQc2M&pp=ygUcdGFpbHMgYWhvcmEgcXVlIHNvbW9zIGFtaWdvcw%3D%3D
	}
}