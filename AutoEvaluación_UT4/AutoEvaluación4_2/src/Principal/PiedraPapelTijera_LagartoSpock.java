package Principal;
import java.io.Console;
import java.util.Scanner;

public class PiedraPapelTijera_LagartoSpock{

	public static void main(String[] args)
	{
		String eleccion1,eleccion2;
		
		//Console console = System.console();
		Scanner sc = new Scanner(System.in);
		
		
		// Los dos usuarios eligen una de las tres opciones y se confirma que sea una opcion valida
		do
		{
			System.out.println("Usuario 1, eliga una opción (minúsculas):");
			System.out.println(" piedra / papel / tijeras");
			eleccion1 = sc.next();
			//char[] user1 = console.readPassword();
			//String eleccion1 = new String(user1);
			if(!eleccion1.equals("piedra") && !eleccion1.equals("papel") && !eleccion1.equals("tijera"))
				System.out.println("Esa no es una opción valida");
		}
		while(!eleccion1.equals("piedra") && !eleccion1.equals("papel") && !eleccion1.equals("tijera"));
		
		do
		{
			System.out.println("Usuario 2, eliga una opción (minúsculas):");
			System.out.println(" piedra / papel / tijeras");
			//har[] user2 = console.readPassword();
			//String eleccion2 = new String(user2);
			eleccion2 = sc.next();
			if(!eleccion2.equals("piedra") && !eleccion2.equals("papel") && !eleccion2.equals("tijera"))
				System.out.println("Esa no es una opción valida");
		}
		while(!eleccion2.equals("piedra") && !eleccion2.equals("papel") && !eleccion2.equals("tijera"));
		
		
		//Se comprueba quien ha ganado o si ha habido empate
		if(eleccion1.equals(eleccion2))
			System.out.println("EMPATE");
		else if(eleccion1.equals("piedra") && eleccion2.equals("papel"))
			System.out.println("Gano usuario 2");
		else if(eleccion1.equals("papel") && eleccion2.equals("tijeras"))
			System.out.println("Gano usuario 2");
		else if(eleccion1.equals("tijeras") && eleccion2.equals("piedra"))
			System.out.println("Gano usuario 2");
		
		else if(eleccion1.equals("piedra") && eleccion2.equals("tijeras"))
			System.out.println("Gano usuario 1");
		else if(eleccion1.equals("tijeras") && eleccion2.equals("papel"))
			System.out.println("Gano usuario 1");
		else if(eleccion1.equals("papel") && eleccion2.equals("piedra"))
			System.out.println("Gano usuario 1");
		else
			System.out.println("ERROR INESPERADO");
		
		sc.close();
	}

}