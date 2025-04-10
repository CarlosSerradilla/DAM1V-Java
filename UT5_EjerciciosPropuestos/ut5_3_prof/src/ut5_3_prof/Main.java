package ut5_3_prof;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Sucursal suc1 = new Sucursal ("C/Caoba","Madrid");
		Sucursal suc2 = new Sucursal ("C/Paseo de la Esperanza","Madrid");
		Scanner sc = new Scanner (System.in);
		int op;
		String sucursalActiva="A";
		Paquete p;
		
		do 
		{
			op = menu(sc);
			switch (op)
			{
			case 1:
				System.out.println("Seleccione sucursal");
				System.out.println("A -" +suc1);
				System.out.println("A -" +suc2);
				sucursalActiva = sc.nextLine();
				break;
			case 2:
				//p = new Paquete ("REF1",23.6,"123456789-X",Prioridad.ALTA);
				p = new Paquete(sc);
				if (sucursalActiva.equals("A"))
					System.out.println("Precio: "+suc1.setPrecio(p));
				else
					System.out.println("Precio: "+suc2.setPrecio(p));
				break;
				
			case 3:
				default:
					System.out.println("Fin del programa");
					break;
			}
		
		
		// Esto sería Hard Code
		//En vez de pedir los valores a tra´ves de consola se introducen directamente en el script
	}while(op!=3);}
	
	//Main es estatico en todos los metodos
	public static int menu(Scanner sc) {
		int opcion;
		
		do
		{
		System.out.println("1 - Seleccionar sucursal");
		System.out.println("2 - Enviar un paquete");
		System.out.println("3 - Salir");
		
		while(!sc.hasNextInt())
		{
			System.out.println("Introduce numero de la opcion");
			sc.nextLine();
		}
		opcion = sc.nextInt();
		if(opcion<1 || opcion>3)
			System.out.println("Incorrecta");
	}while(opcion<1 || opcion>3);
	return opcion;

}}
