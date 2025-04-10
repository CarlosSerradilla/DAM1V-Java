package Principal;

import java.util.Scanner;

public class Catalogo
{
	private Libro[] libros;
	private int nLibrosMax = 100;
	private int nLibrosActual;
	
	// Método constructor
	public Catalogo()
	{
		this.nLibrosMax = 100;
		this.nLibrosActual = 0;
		libros = new Libro[100];
	}
	
	public void addBook(Scanner sc)
	{
		if(this.nLibrosActual >= this.nLibrosMax)
			System.out.println("No puede registrar más libros");
		else
			libros[this.nLibrosActual++]= new Libro(sc);
		// ERROR: No me deja resolver "sc" como una variable cuando intento llamar a un método constructor
		// Solución: Se me habia olvidado solicitar la variable "Scanner sc" entre los parentesis al llamar al método
	}
	
	public void readBook(Libro libro) // SIN TERMINAR
	{
		System.out.println("Introduzca el ISBN que quiere consultar: ");
		libro.getISBN();
	}
	
	/*Poner los diferentes métodos aqui:
	
	public metodo2()
	
	public metodo3()
	
	public metodo4()
	
	public metodo5()
	
	*/
	
	//Poner un toString aquí
}
