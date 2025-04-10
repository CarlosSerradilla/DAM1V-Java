package Principal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Contactos
{
	private ArrayList<Contacto> listaContactos; // Una lista de tipo Contacto
	
	public Contactos()
	{
		listaContactos = new ArrayList<>();
	}
	
	public boolean add(Contacto c)
	{
		return listaContactos.add(c);
	}
	
	public void leerFicheros(String fileName) throws IOException //FileReader / FileWriter
	{
		FileReader fEntrada = new FileReader(fileName);
		int c;
		String linea="";
		String[] tokens;
		
		while ((c=fEntrada.read())!=-1)
		{
			if(c=='\n')
			{
				tokens = linea.split(";");
				listaContactos.add(new Contacto(tokens[0],tokens[1],tokens[2]));
				linea="";
			}
			linea += (char)c;
		}
		
		fEntrada.close();
	}
	
	public void leerFicherosV2(String fileName) throws IOException // Scanner / PrintWriter
	{
		FileReader fEntrada = new FileReader(fileName);
		Scanner entrada = new Scanner(fEntrada);
		
		String linea="";
		String[] tokens;
		
		while (entrada.hasNextLine()) // Mucho mas comodo
		{
			linea = entrada.nextLine();
			tokens = linea.split(";");
			listaContactos.add(new Contacto(tokens[0],tokens[1],tokens[2]));
		}
		
		entrada.close();
		fEntrada.close();
	}
	
	public void escribirFicherosV2 (String fileName) throws IOException
	{
		FileWriter fsalida = new FileWriter(fileName);
		PrintWriter salida = new PrintWriter(fsalida);
		
		for(Contacto c: listaContactos)
			salida.println(c);
		
		salida.close();
		fsalida.close();
	}
	
	public String toString()
	{
		String resultado ="";
		for (Contacto c : listaContactos)
			resultado += c + "\n";
		return resultado;
	}
}
