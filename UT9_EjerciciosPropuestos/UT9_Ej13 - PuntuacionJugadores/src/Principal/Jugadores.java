package Principal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Jugadores 
{
	ArrayList<Jugador> lista;
	
	public Jugadores()
	{
		lista = new ArrayList<>();
	}
	
	public boolean add(Jugador j)
	{
		return lista.add(j);
	}
	
	public Jugador get(int i)
	{
		return lista.get(i);
	}
	
	public void escribirFicheroBinario(String nombreFichero) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(nombreFichero);
		DataOutputStream salida = new DataOutputStream(fos);
		for (Jugador j: lista)
		{
			salida.writeUTF(j.getNombre());
			salida.writeInt(j.getPuntos());
		}
		salida.close();
		fos.close();
	}
	
	public void leerFicheroBinario(String nombreFichero) throws IOException
	{
		FileInputStream fis = new FileInputStream(nombreFichero);
		DataInputStream entrada = new DataInputStream(fis);
		boolean fin = false;
		lista.clear();
		while (!fin)
		{
			try
			{
			lista.add(new Jugador(entrada.readUTF(),entrada.readInt()));
			}
			catch (EOFException e)
			{
				break;
			}
		}
		
		entrada.close();
		fis.close();
	}
	
	public int buscarPorNombre(String nombre)
	{
		for (int i=0;i<lista.size();i++)
			if (nombre.equals(lista.get(i).getNombre()))
					return i;
		return -1;
	}
	
	public String toString()
	{
		String resultado="";
		for (Jugador j :lista)
			resultado += j +"\n";
		return resultado;
	}
}
