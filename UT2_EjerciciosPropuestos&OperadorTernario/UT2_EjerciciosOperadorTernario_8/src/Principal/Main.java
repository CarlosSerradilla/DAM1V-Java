package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int hora;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Flaco, tenes hora?");
		System.out.println("(Escribe la hora sin los minutos con el formato 0h - 24h)");
		hora = sc.nextInt();
		
		if(hora >= 8 && hora < 13)
		{
			System.out.println("Es por la mañana");
			System.out.println("Ohayou Gozaimasu");
		}
		else if(hora >= 13 && hora < 21)
		{
			System.out.println("Es por la tarde");
			System.out.println("Konbanwa");
		}
		else if(hora >= 21 && hora <= 24 || hora >= 0 && hora < 8)
		{
			System.out.println("Es de noche");
			System.out.println("Oyasumi");
		}
		else
		{
			System.out.println("Eso no es una hora válida");
			System.out.println("Ya te la sabes");
		}
		
		sc.close();

	}

}
