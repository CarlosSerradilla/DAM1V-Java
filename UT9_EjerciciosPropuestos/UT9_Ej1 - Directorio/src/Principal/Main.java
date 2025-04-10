package Principal;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{		
		String rutaDir = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la ruta de un directorio:");
		rutaDir = sc.nextLine();
		
		File dir = new File(rutaDir);
		
		if(dir.exists() && dir.isDirectory())
		{
			System.out.println("Es una ruta de directorio válida");
			System.out.println(dir.getAbsoluteFile()); 
			
			File[] archivos = dir.listFiles();
			
			if (archivos != null) { // Evita NullPointerException si el directorio está vacío o no es accesible
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        System.out.println("[Directorio] " + archivo.getName()); // Directorios
                    } else {
                        System.out.println("[Archivo] " + archivo.getName()); // Archivos
                    }
                }
            }
		}
		else
		{
			System.err.println("La ruta del directorio especificado NO existe");
		}
		
		sc.close();
	}

}
