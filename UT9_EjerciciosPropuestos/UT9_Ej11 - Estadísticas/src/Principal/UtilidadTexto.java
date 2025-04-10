package Principal;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UtilidadTexto
{
	private String nombreFichero;
	private int caracteres;
	private int palabras;
	private int lineas;
	
	private HashMap<String,Integer> mapa; // Los hashmap tienen dos tipos de datos, la clave y el valor
	private int frecuenciaMax;
	private ArrayList<String> palabrasFrecuentes;
	
	public UtilidadTexto(String nombreFichero) throws IOException
	{
		this.nombreFichero = nombreFichero;
		this.caracteres = 0;
		this.palabras = 0;
		this.lineas = 0;
		this.frecuenciaMax = 0;
		this.mapa = new HashMap<>();
		this.palabrasFrecuentes = new ArrayList<>();
		procesar();
	}
	
	private void procesar() throws IOException
	{
		// "File" no te da métodos para leer nada de el fichero,
		//trabaja a nivel de objeto más que a nivel de contenido
		// Por eso para leer el contenido es más cómodo FileReader
		FileReader fr = new FileReader(nombreFichero);
		Scanner entrada = new Scanner(fr);
		String [] tokens;
		
		while(entrada.hasNextLine()) // Mientras entrada (el fichero), tenga más líneas la seguimos leyendo
		{
			// Se puede inicializar la String aqui, pero es mas recomendable inicializarla fuera del bucle
			String linea = entrada.nextLine();
			tokens = linea.split("[^A-Za-zñ]"); // ^En este caso separara cada vez que no se una letra de la A a la Z
			// El circunflejo ^ significa que todo lo que no se especifique son separadores
			
			for (String s : tokens)
			{
				mapa.put(s,mapa.getOrDefault(s,0)+1); // Encontramos una palabra, y si esa palabra esta en el mapa se da el valor asociado para saber las veces que se han añadido y se le suma uno mas, con getOrDefault en caso de que no haya salido nunca esa palabra se le asigna 0 para que al salir la primera vez 0+1 sea igual a 1 (la primera vez que salio la palabra)  ;v
				if (mapa.get(s)>frecuenciaMax)
					frecuenciaMax = mapa.get(s); // Guarda el nuevo (palabra) valor que mas veces aparece
				this.caracteres += s.length(); // Acumulamos los caracteres totales
			}
			
			this.palabras += tokens.length;
			this.lineas++;
		}
		// Para recorrer el mapa:
		for (Map.Entry<String, Integer> m : mapa.entrySet())
			if (m.getValue()==frecuenciaMax)
				palabrasFrecuentes.add(m.getKey());
		
		entrada.close();
		fr.close();
	}
	
	public String toString()
	{
		String resultado="Las estadísticas del fichero "+nombreFichero+" son: \n";
		resultado += "Caracteres:  "+this.caracteres+"\n";
		resultado += "Palabras:  "+this.palabras+"\n";
		resultado += "Líneas:  "+this.lineas+"\n";
		resultado += "La frecuencuia absoluta en palabras es "+frecuenciaMax;
		resultado += "La palabra/s son: ";
		for (String s : palabrasFrecuentes)	
			resultado += s+" ";
		return resultado;
	}
	
}
