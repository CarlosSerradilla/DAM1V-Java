package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		Contactos contactos = new Contactos();
		
		contactos.leerFicheros("Contactos.txt");
		
		contactos.leerFicherosV2("Contactos.txt");
		
		contactos.add(new Contacto("My Friend Pedro","45615","DeadToast@entreteinment.com"));
		contactos.add(new Contacto("Jose Rodriquez","876543","DeadCant@square.com"));
		
		contactos.leerFicherosV2("Contactos.txt");
		
		System.out.println(contactos);

	}

}
