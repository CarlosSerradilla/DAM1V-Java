package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Conductores conductores;
		
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		conductores = new Conductores (sc,5);
		// IMPORTANTE crear el escaner antes de pasarselo
		
		do {
			opcion = menu(sc);
			switch(opcion)
			{
			case 1:
				conductores.altaConductor();
				break;
			case 2:
				conductores.addKmConductor();
				break;
			case 3:
				conductores.bajaConductor();
				break;
			case 4:
				conductores.modificarConductores();
				break;
			case 5:
				conductores.listarConductores();
				break;
			case 6:
				System.out.println("¡Hasta luego! 😃😃😃");
				break;
			}
		}while(opcion != 6);
		
		sc.close();
	}
	
	public static int menu(Scanner sc)
	{
		int opcion;
		do{
			System.out.println("Menu principal");
			System.out.println("============================");
			System.out.println(" 1 - Nuevo conductor");
			System.out.println(" 2 - Añadir km a conductor");
			System.out.println(" 3 - Eliminar conductor");
			System.out.println(" 4 - Modificar conductor");
			System.out.println(" 5 - Listar conductores");
			System.out.println(" 6 - Salir");
			System.out.println("Eliga la opción: ");
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e)
			{
				opcion = 0;
				// Aqui hace falta borrar el buffer para que no se quede atascado
			}

			sc.nextLine();	// Limpiar buffer
			if(opcion < 1 || opcion > 6)
				System.err.println("Opción incorrecta\n");
			// "/n" fuerza un salto de línea
		}while(opcion < 1 || opcion > 6);
		
		return opcion;
	}

}