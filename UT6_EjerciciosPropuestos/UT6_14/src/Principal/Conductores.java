package Principal;

import java.util.Scanner;

public class Conductores
{
	private Conductor[] vector;
	private int nConductoresActual;	// Los conductores que tenemos actualmente
	private int nConductoresMax;
	
	Scanner sc = new Scanner(System.in);
	
	// Constructor
	public Conductores(Scanner sc, int n)
	{
		this.sc = sc;
		this.nConductoresActual = 0;
		this.nConductoresMax = n;
		this.vector = new Conductor[n];
	}
	
	
	public void altaConductor()
	{
		// Comprobar si hay espacio para dar de alta a un conductor
		if (nConductoresActual >= nConductoresMax)
			System.out.println("\nNo hay espacio disponible\n");
		else
			vector[nConductoresActual++] = new Conductor(sc);
	}
	
	public void addKmConductor()
	{
		int pos;
		int kilometros;
		pos = buscarConductor();
		if (pos == -1)
			System.out.println("El conductor nombrado no existe");
		else
		{
			System.out.println(vector[pos]);
			System.out.println("¿Cuántos KM quieres añadir?");
			kilometros  = sc.nextInt();
			sc.nextLine();
			//vector[pos].setKm(kilometros + vector[pos].getKm());
			vector[pos].addKm(kilometros);
			System.out.println(vector[pos]);
		}
	}
	
	public void bajaConductor()
	{
		int pos;
		String respuesta;
		
		pos = buscarConductor();
		if(pos == - 1)
			System.out.println("El conductor nombrado no existe");
		else {
			System.out.println(vector[pos]);
			System.out.println("¿Seguro que quiere eliminar el conductor? (S/N)");
			respuesta = sc.nextLine();
			respuesta = respuesta.toUpperCase();
			if(respuesta.charAt(0) == 'S')
			{
				for(int i=pos; i<this.nConductoresActual-1; i++)
					vector[i] = vector[i+1];
				this.nConductoresActual--;
			}
			else
				System.out.println("Operación cancelada");
		}
	}
	
	public void modificarConductores()
	{
		int pos;
		String respuesta;
		
		pos = buscarConductor();
		
		if (pos == -1)
			System.out.println("El conductor nombrado no existe");
		else
		{
			System.out.println(vector[pos]);
			System.out.println("¿Como lo quieres renombrar?");
			respuesta = sc.nextLine();
			vector[pos].setNombre(respuesta);
			System.out.println("Fue renombrado correctamente a "+respuesta);
		}
	}
	
	public void listarConductores()
	{
		for(int i=0; i<nConductoresActual; i++)
			System.out.println(vector[i]);
	}
	
	
	
	public int buscarConductor()
	{
		String name;
		System.out.println("Introduzca el nombre del conductor a buscar:");
		name = sc.nextLine();
		
		for(int pos=0; pos<nConductoresActual; pos++)
		{
			if(name.equals(vector[pos].getNombre()))
				return pos;
		}
		return -1; // No existe ese conductor
		
	}
	
	
	// Esta clase NO es una clase POJO, ya que representa varias entidades
}