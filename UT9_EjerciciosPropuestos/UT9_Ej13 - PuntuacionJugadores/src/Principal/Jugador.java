package Principal;

import java.util.Scanner;

public class Jugador implements Comparable<Jugador>
{
	private String nombre;
	private int puntos;
	
	public Jugador(String nombre, int puntos) 
	{
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}
	
	public Jugador (Scanner sc)
	{
		System.out.println("Introduzca nombre del jugador");
		nombre = sc.nextLine();
		System.out.println("Introduzca puntuación:");
		puntos = sc.nextInt();
		sc.nextLine();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString()
	{
		return nombre + " " + puntos;
	}

	@Override
	public int compareTo(Jugador o) 
	{
		return Integer.compare(puntos, o.puntos);
	}
}
