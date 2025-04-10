package Principal;

import java.util.Scanner;

public class Conductor
{
	private String nombre;
	private int km;
	
	public Conductor(String nombre, int km) {
		super();
		this.nombre = nombre;
		this.km = 0;
	}
	
	public Conductor (Scanner sc)
	{
		System.out.println("Nombre del conductor:");
		this.nombre = sc.nextLine();
		this.km = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	public void addKm(int km)
	{
		this.km += km;
	}
	
	@Override
	public String toString() {
		return nombre + ", km="+km;
	}
	
	// Las clases que almacenan los getter, setter, y toString son las clases POJOs
}
