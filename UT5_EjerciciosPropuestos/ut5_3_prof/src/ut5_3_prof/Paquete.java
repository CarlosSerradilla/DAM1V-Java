package ut5_3_prof;

import java.util.Scanner;

//enum Prioridad {NORMAL,ALTA,URGENTE}
// Este sería un método de enumeración básico
// En su lugar hemos creado un Script especifico para almacenar los tipos de prioridades enum

public class Paquete {
	private String referencia;
	private double peso;
	private String dni;
	private Prioridad prioridad;
	private boolean prioridadOk = true;
	
	public Paquete(String referencia, double peso, String dni, Prioridad prioridad) {
		super();
		this.referencia = referencia;
		this.peso = peso;
		this.dni = dni;
		this.prioridad = prioridad;
	}
	
	public Paquete (Scanner sc) {
		String textPrioridad;
		
	do {
		prioridadOk = true;
	
		System.out.println("Introduzca la referencia:");
		this.referencia = sc.nextLine();
		sc.nextLine();
		System.out.println("Introduzca el peso:");
		this.peso = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca DNI del cliente:");
		this.dni = sc.nextLine();
		System.out.println("Introduzca la prioridad:");
		//System.out.println("NORMAL - ALTA - URGENTE");
		for(Prioridad p:Prioridad.values())
			System.out.print(p.name()+" - ");
		// Este bucle se va a ejecutar tres veces, uno por cada valor
		
		textPrioridad = sc.nextLine();
		
		try {
		this.prioridad = Prioridad.valueOf(textPrioridad);
		}
		catch (IllegalArgumentException e) {
			System.out.println("La prioridad no existe");
			prioridadOk = false;
		}}while(prioridadOk == false);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}
	
	
}
