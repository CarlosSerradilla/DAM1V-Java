package Principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		// Primero hacemos una referencia al script Catalogo
		Catalogo catalogo;
		// Y luego llamamos a su constructor
		catalogo = new Catalogo();
		
		System.out.println(" Bienvenido al catálogo de libros de la biblioteca");
		
		do {
			opcion = menu(sc);
			switch(opcion)
			{
			case 1:
				catalogo.addBook(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println(" Saliendo del programa...");
				break;
			}
		}while(opcion != 6);
		
		System.out.println(" ¡Hasta pronto! (: ");
		
		sc.close();
	}

	public static int menu(Scanner sc)
	{
		int opcion;
		
		do {
			System.out.println("");
			System.out.println(" Eliga la opción que desée hacer: ");
			System.out.println(" ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ඞ ");
			System.out.println(" 1 - Create - Dar de alta un libro");
			System.out.println(" 2 - Read - Consultar un libro por su ISBN");
			System.out.println(" 3 - Update - Modificar el título de un libro por su ISBN");
			System.out.println(" 4 - Delete - Eliminar un libro por su ISBN");
			System.out.println(" 5 - Listar los libros");
			System.out.println(" 6 - Salir del programa");
		
			opcion = sc.nextInt();
			sc.nextLine(); //Limpiar buffer
			
			if(opcion < 1 || opcion > 6)
				System.err.println("¡Opción incorrecta! - Introduzca un número del 1 al 6");
			
		}while(opcion < 1 || opcion > 6);

		return opcion;
	}

}
