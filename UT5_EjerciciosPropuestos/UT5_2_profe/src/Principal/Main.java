package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int op;			//Opcion selecionada
		String idMovil; //Identifica el movil del la relacion de moviles
		Movil telefono1 = new Movil("555 123 456", Tarifa.ELEFANTE);
		Movil telefono2 = new Movil("123 456 789", Tarifa.GATO);
		do
		{
		op = Menu(sc);
		switch (op) 
		{
		case 1:
			System.out.println("Telefonos disponibles");
			System.out.println("---------------------");
			System.out.println("A -"+telefono1);
			System.out.println("B -"+telefono2);
		case 2:
			System.out.println("Indica la letra del movil");
			idMovil = sc.nextLine();
			switch (idMovil)
			{
			case "A":
				telefono1.Llamar((int)(5+Math.random()*7204));
				break;
			case "B":
				telefono2.Llamar((int)(5+Math.random()*7204));
				break;
				default:
					System.out.println("Este movil no existe");
			case "C":
			}
		case 3:
		case 4:
		case 5: System.out.println("Fi¡n del programa");break;
		default: System.out.println("a miracle OMG");
	}}while(op!=5);
		
		sc.close();
		}

	public static int Menu(Scanner sc) {
		int opcion;
		do {
			opcion = 0;
			System.out.println("1 - Ver moviles disponibles");
			System.out.println("2 - Llamar dese un movil");
			System.out.println("3 - Reiniciar un movil");
			System.out.println("4 - Ver la factura de un movil");
			System.out.println("5 - Salir");
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("debe intriducir otro numero");
				sc.nextLine();
			}
			if (opcion < 1 || opcion > 5)
				System.out.println("Opcion incorrecta");
		} while (opcion < 1 || opcion > 5);
		return opcion;

	}

}
