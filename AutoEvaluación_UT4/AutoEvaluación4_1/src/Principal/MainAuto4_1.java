package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAuto4_1
{

	public static void main(String[] args)
	{
		String sabor;
		String blancoONegro;
		String nata;
		String conTuNombre;
		double precio = 0;
		boolean teQuedasteSinNataPorGordo = false;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿De que sabor quiere el usuario la tarta? 🍰:");
		System.out.println("(Escribir en minúsculas)");
		System.out.println(" manzana / fresa / chocolate");
		sabor = sc.next();
		
		if(sabor.equals("manzana"))
			precio = 18;
		else if(sabor.equals("fresa"))
			precio = 16;
		else if(sabor.equals("chocolate")){
			System.out.println("Chocolate blanco o negro:");
			System.out.println("(Escribir en minúsculas)");
			System.out.println(" blanco / negro");
			blancoONegro = sc.next();
			if(blancoONegro.equals("blanco"))
				precio = 15;
			else if(blancoONegro.equals("negro"))
				precio = 14;
			else{
				System.out.println("Como sos pelotudo te quedaste sin tarta");
				teQuedasteSinNataPorGordo = true;
			}
		}
		else{
			System.out.println("Opción no permitida");
			teQuedasteSinNataPorGordo = true;
		}
		
		
		if(teQuedasteSinNataPorGordo != true){
			System.out.println("¿Quieres nata?:");
			System.out.println("(Escribir en minúsculas)");
			System.out.println(" si / no");
			nata = sc.next();
			if(nata.equals("si")){
				System.out.println("¿Lo quieres con tu nombre tilín?:");
				System.out.println("(Escribir en minúsculas)"); 
				System.out.println(" si / no");
				conTuNombre = sc.next();
				if(nata.equals("si")){
					precio = precio + 2.75;
					System.out.println("Disfruta de tu tarta 👍");
				}
				else if(nata.equals("no")){
					precio = precio + 2.50;
					System.out.println("Disfruta de tu tarta 👍");
				}
				else{
					System.out.println("Si o no gordo");
					System.out.println("Te quedaste sin nata");
					teQuedasteSinNataPorGordo = true;
				}
			}
			else if(nata.equals("no"))
				System.out.println("Disfruta de tu tarta 👍");
			else{
				System.out.println("Si o no gordo");
				System.out.println("Te quedaste sin nata");
				teQuedasteSinNataPorGordo = true;
			}
		}
		else
			System.out.println("Reinicie el programa");
		
		if(teQuedasteSinNataPorGordo != true)
			System.out.println("El precio a pagar por este manjar es "+precio);
		sc.close();

	}
}