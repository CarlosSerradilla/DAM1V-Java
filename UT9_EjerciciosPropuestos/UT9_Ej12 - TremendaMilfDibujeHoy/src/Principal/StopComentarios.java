package Principal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StopComentarios
{
	private String nombreFicheroEntrada;
	private String nombreFicheroSalida;

	public StopComentarios(String fi, String fo) throws IOException
	{
		this.nombreFicheroEntrada = fi;
		this.nombreFicheroSalida = fo;
		procesar();
	}
	
	private void procesar() throws IOException
	{
		FileReader entrada = new FileReader(nombreFicheroEntrada);
		FileWriter salida = new FileWriter(nombreFicheroSalida);
		
		int c;
		int estado = 0;
		while((c=entrada.read())!=-1) // Mientras sea distinto de menos uno significa que estoy leyendo caracteres
		{
			switch (estado)
			{
				case 0:
					if((char)c=='/')
						estado = 1;
					else
						salida.write(c); // Grabamos c
					break;
				case 1: // Detecta un comentario
					if((char)c=='/') //de una línea
						estado = 2;
					else if((char)c=='*') //multilínea
						estado = 3;
					else
					{
						salida.write('/'); // Grabamos la barra
						salida.write(c); // Grabamos c
						estado = 1;
					}
					break;
				case 2: // Detectando comentario de una línea
					if((char)c=='\n')
					{
						salida.write(c); // Grabamos c
						estado = 0;
					}
					break;
				
				case 3: // Comprobando si genera documentación o no
					if((char)c=='*')	// SI genera documentacion
						estado = 5;
					else				//NO, lmao
						estado = 4;
					break;
				case 4: // NO genera documentación
					if((char)c=='*') // Comprobar si se termina el comentario
						estado = 6;
					break;
				case 5: // SI genera documentacion
					if((char)c=='*') // Comprobar si se termina el comentario
						estado = 6;
					break;
				case 6: //Se termino el comentario multilínea
					if((char)c=='/')
						estado = 0;
					else
						estado = 4;
					break;
				case 7: //Se termino el comentario multilínea con documentación
					if((char)c=='/')
						estado = 0;
					else
						estado = 5;
					break;
			}
		}
		
		salida.close();
		entrada.close();
	}
}