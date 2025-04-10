package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int n = 100; //La cantidad máxima de alumnos con la que queremos trabajar
		Alumnos alumnos = new Alumnos(n);
		Scanner sc = new Scanner (System.in);
		String nombre;
		int edad;
		
		System.out.println("Introduzca un nombre (*=FIN)");
		nombre = sc.nextLine();
		while(!nombre.equals("*")) {
			System.out.println("Introduzca edad:");
			edad = sc.nextInt();
			sc.nextLine();
			if(alumnos.addAlumno(nombre, edad)==false)
				System.out.println("No hay espacio libre");
		}

		
		// Algo falla, solucionarlo
	}

}
