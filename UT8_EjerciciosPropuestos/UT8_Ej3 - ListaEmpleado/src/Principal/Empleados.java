package Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleados
{
	// Hay que poner de que va a ser el ArrayList, en este caso del objeto Empleado
	private ArrayList<Empleado> listaE;
	
	// Constructor
	public Empleados()
	{
		listaE = new ArrayList<>(); // NO hace falta especificar que es una lista de empleados	
	}
	
	// List -> Polimorfismo
	
	Scanner sc = new Scanner (System.in);
	
	// Métodos:
	// Le pasamos la variable que vamos a usar, en este caso empleado
	public boolean addEmpleado(Empleado e)
	{
		return listaE.add(e);
	}
	
	public boolean delEmpleado(Empleado e)
	{
		return listaE.remove(e);
	}
	
	public Empleado findByNSS(String numSegSocial)
	{
		for (Empleado e : listaE)
			if (e.getNSS().equals(numSegSocial))
				return e;
		
		// En caso de que no le podamos devolver un empleado le devolvemos NULL
		return null; // Cuando no encontremos un objeto retornamos null
	}
	
	public void orderEmpleado()	// Para métodos de ordenar lo recomendable es void
	{
		listaE.sort(null);
	}

	@Override
	public String toString()
	{
		String resultado = "";
		for (Empleado e : listaE)
			resultado += e + "\n";
		return resultado;		
		//"Empleados [listaE=" + listaE + ", sc=" + sc + "]";
	}
	
}
