package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		Notas notas = new Notas();
		
		notas.leerFichero("alumnos_notas.txt");
		
		System.out.println(notas);
	}

}
