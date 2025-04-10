package Principal;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws Throwable 
	{
		Scanner sc = new Scanner(System.in);
		Jugadores jugadores= new Jugadores();
		int opcion,pos,puntos;
		String nombre;
		try
		{jugadores.leerFicheroBinario("Puntos.dat");}
		catch (FileNotFoundException e)
		{
			System.out.println("No había datos iniciales");
		}
		do
		{
			opcion = menu(sc);
			switch (opcion)
			{
			case 1:
				jugadores.add(new Jugador(sc));
				jugadores.escribirFicheroBinario("Puntos.dat");
				break;
			case 2:
				System.out.println(jugadores);
				break;
			case 3:
				System.out.println("Nombre del jugador:");
				nombre = sc.nextLine();
				pos = jugadores.buscarPorNombre(nombre);
				if (pos==-1)
					System.out.println("Ese jugador no existe");
				else
				{
					System.out.println(jugadores.get(pos));
					System.out.println("Indique nueva puntuación");
					puntos =sc.nextInt();
					sc.nextLine();
					jugadores.get(pos).setPuntos(puntos);
					jugadores.escribirFicheroBinario("Puntos.dat");
				}
				break;
			case 4: 
				jugadores.escribirFicheroBinario("Puntos.dat");
			}
		} while (opcion!=4);
	}
	
	public static int menu(Scanner sc)
	{
		int opcion;
		do
		{
			System.out.println("1 - Registrar puntuaciones");
			System.out.println("2 - Mostrar puntuaciones");
			System.out.println("3 - Actualizar puntuación");
			System.out.println("4 - Salir");
			System.out.println("Opcion:");
			try {opcion = sc.nextInt();}
			catch (InputMismatchException e)
			{
				opcion = 0;
			}
			sc.nextLine();
			if (opcion<1|| opcion>4)
				System.out.println("¡Opción incorrecta!");
		} while (opcion<1|| opcion>4);
		return opcion;
	}
}
