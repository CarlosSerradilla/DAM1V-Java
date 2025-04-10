package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Creando estas variables aqui las podemos usar en otros metodos a parte de "main"
	private static Zona principal;
	private static Zona compra_venta;
	private static Zona VIP;
	
	public static void main(String[] args)
	{
		int op;
		Scanner sc = new Scanner(System.in);
		String zonaDeCompra;
		int nEntradas;
		principal = new Zona(1000);
		compra_venta = new Zona (200);
		VIP = new Zona(25);
		
		do{
			op = menu(sc);
			switch(op)
			{
			case 1:
				System.out.println("Principal: "+principal);
				System.out.println("Compra_Venta: "+compra_venta);
				System.out.println(" V I P: "+VIP);break;
			case 2:
				System.out.println("Cuantas entradaas desea");
				nEntradas = sc.nextInt();
				sc.nextLine();
				System.out.println("¿Qué zona desea?:");
				zonaDeCompra = sc.nextLine();
				zonaDeCompra = zonaDeCompra.toUpperCase(); // En caso de que ponga mayúsculas
				zonaDeCompra = zonaDeCompra.trim(); // En caso de que ponga espacios en blanco
				realizarCompra(zonaDeCompra,nEntradas);
				break;
			case 3:System.out.println("Fin de programa");break;
			default:System.out.println("ERROR inesperado");break;
			}
		}while(op != 3);
		sc.close();
	}

	public static int menu(Scanner sc)
	{
		int opcion;
		
		do{
			System.out.println("1 - Mostrar entradas libres");
			System.out.println("2 - Vender entradas");
			System.out.println("3 - Salir");
			System.out.println("Eliga la opción:");
			try {
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Debe introducir un número");
				opcion = 0;
				sc.nextLine(); //Borrar buffer del teclado
			}
			if(opcion>3 || opcion<1)
			{
				
			}
		}while(opcion>3 || opcion<1);
		
		return opcion;
	}
	
	public static void realizarCompra(String zonaDeCompra, int nEntradas)
	{
		switch(zonaDeCompra)
		{
		case "PRINCIPAL":
			if(principal.vender(nEntradas))
				System.out.println("Operación realizada con exito");
			else
				System.out.println("No hay entradas en esa zona");
			break;
		case "COMPRA-VENTA":
			if(compra_venta.vender(nEntradas))
				System.out.println("Operación realizada con exito");
			else
				System.out.println("No hay entradas en esa zona");
			break;
		case "VIP":
			if(VIP.vender(nEntradas))
				System.out.println("Operación realizada con exito");
			else
				System.out.println("No hay entradas en esa zona");
			break;
			default:System.out.println("Zona inexistente");
			break;
		}
	}
}