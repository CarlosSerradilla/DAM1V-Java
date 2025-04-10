package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BdeBanco {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int opcion;
		double cantidad = 500;
		CuentaBancaria cuenta = new CuentaBancaria("ES12345678121234567890", "Esteban Dido");
		
		do {
			opcion = menu(sc);
			switch(opcion)
			{
			case 1:
				System.out.println("Datos de la cuenta");
				System.out.println("IBAN: "+cuenta.getIBAN());
				System.out.println("Titular: "+cuenta.getTitular());
				System.out.println("Saldo: "+
						String.format("%.2f",cuenta.getSaldo()));
				break;
			case 2:
				System.out.println("IBAN: "+cuenta.getIBAN());break;
			case 3:
				System.out.println("Titulra: "+cuenta.getTitular());break;
			case 4:
				System.out.println("Saldo: "+
						String.format("%.2f",cuenta.getSaldo()));break;
			case 5:
				System.out.println("Introduzca cantidad a ingresar:");
				cantidad = sc.nextDouble();
				if (cuenta.Ingreso(cantidad))
					System.out.println("Operación realizada con exito");
				else
					System.out.println("Ups! Algo fue mal :(");
				break;
			case 6:
				System.out.println("Introduzca cantidad a retirar:");
				cantidad = sc.nextDouble();
				if (cuenta.Reintegro(cantidad))
					System.out.println("Operación realizada con exito");
				else
					System.out.println("Ups! Algo fue mal :(");
				break;
			case 7:
				cuenta.VerMovimientos();
				break;
			case 8:
				System.out.println("Fin del programa");
				break;
			}
			
		}while(opcion != 8);
		System.out.println("¡Hasta pronto!");
		
		
		sc.close();

	}
	
	public static int menu(Scanner sc)
	{
		int op;
		
		do {
			System.out.println("1 - Datos de la cuenta");
			System.out.println("2 - Mostrar el IBAN");
			System.out.println("3 - Mostrar el titular");
			System.out.println("4 - Mostrar el saqldo disponible");
			System.out.println("5 - Ingresar fondos");
			System.out.println("6 - Retirar fondos");
			System.out.println("7 - Historial de movimientos");
			System.out.println("8 - Salir de la aplicación");
			System.out.println("	Introduzca la opción deseada:");
			try {
				op = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Debe introducir un número");
				sc.nextLine();
				op = 0;
			}
			if(op<1 || op>8)
				System.out.println("Esa opción no existe");
		}while(op<1 || op>8);
		sc.nextLine();
		return op;
	}

}
