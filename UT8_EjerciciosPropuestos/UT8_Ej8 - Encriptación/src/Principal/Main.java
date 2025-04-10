package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		Criptografia criptografia = new Criptografia(1);
		
		//criptografia.encriptar("Saludo.txt", "SaludoCript.txt");
		criptografia.desencriptar("SaludoCript.txt", "SaludoDescript.txt");
		
		
	}

}
