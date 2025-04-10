package Principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notas
{
	private ArrayList<Nota> lista;
	
	public Notas()
	{
		lista = new ArrayList<>();
	}
	
	public boolean add(Nota n)
	{
		return lista.add(n);
	}
	
	public void leerFichero(String fileName) throws IOException
	{
		FileReader fr = new FileReader(fileName);
		Scanner entrada = new Scanner (fr);
		String linea;
		String [] tokens;
		Nota nota;
		
		while (entrada.hasNextLine())
		{
			linea = entrada.nextLine();
			tokens = linea.split("|");
			nota = new Nota(tokens[0]); // Saco el alumno pero le puse nota ya que es el nombre que le puse al script
			for(int i=1; i<tokens.length-1; i++)
				nota.addNota(Integer.parseInt(tokens[i]));
			lista.add(nota);
		}
		
		entrada.close();
		fr.close();
	}
	

	public String toString() {
		String resultado = " ";
		for (Nota n: lista)
			resultado += n+"\n";
		return resultado;
	}
	
	
	
}