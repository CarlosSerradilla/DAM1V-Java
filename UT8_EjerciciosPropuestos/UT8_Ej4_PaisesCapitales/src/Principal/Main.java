package Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args)
	{
		String [] VPaises= {"Japón", "Sudáfrica", "Canadá", "Brasil", "Australia", "Argentina", "India", "Dinamarca"};
		String [] VCapitales= {"Tokio", "Pretoria", "Ottawa", "Brasilia", "Camberra", "Buenos Aires", "Nueva Delhi", "Copenhague"};
		
		List<String> paises = new ArrayList<String>();
		LinkedList<String> capitales = new LinkedList<String>();

		for (int i=0; i<VPaises.length; i++)
			paises.add(VPaises[i]);
		
		for (int i=0; i<VCapitales.length; i++)
			paises.add(VCapitales[i]);
		
		System.out.println("Países:");
		System.out.println(paises);
		System.out.println("Capitales:");
		System.out.println(capitales);
		
		Iterator<String> it = paises.iterator(); // Los iteradores son de un solo uso
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		// Normalmente se usan los iteradores para modificar listas
		
		
		ListIterator<String> lit = paises.listIterator();
		ListIterator<String> litC = capitales.listIterator();
		while (lit.hasNext() && litC.hasNext())
		{
			lit.next();
			lit.add(litC.next());
		}
		System.out.println(paises);
	}

}
