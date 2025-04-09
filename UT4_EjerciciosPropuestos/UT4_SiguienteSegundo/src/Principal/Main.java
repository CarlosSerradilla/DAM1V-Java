package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Atributos
		double hora,minuto,segundo;
		
		Scanner sc = new Scanner (System.in);
		
		// ponemos la hora con minutos y segundos
		System.out.println("Introduce la hora actual (sin los min ni seg)");
		hora = sc.nextDouble();
		System.out.println("Introduce los minutos");
		minuto = sc.nextDouble();
		System.out.println("Introduce los segundos");
		segundo = sc.nextDouble();
		
		// Y después de que pase un segundo
		segundo++;
		
		//Confirmamos que sea un número válido (no negativo)
		if(hora<0||minuto<0||segundo<0)
		{
			System.out.println("No se admiten números negativos");
		}
		else
		{
			//pasaría esto
			while(segundo >= 60)
			{
				segundo = segundo - 60;
				minuto++;
			}
			
			while(minuto >= 60)
			{
				minuto = minuto - 60;
				hora++;
			}
			
			// Y finalmente se enseña la hora que es al transcurrir un segundo
			System.out.println("Ahora mismo son las "+hora+"h "+minuto+"m "+segundo+"s");
		}
		
		sc.close();
	}

}
