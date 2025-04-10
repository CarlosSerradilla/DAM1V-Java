package Principal;

import java.util.Scanner;

//Clase POJO
public class Libro
{	
	Scanner sc = new Scanner(System.in);
	
	private String titulo;
	private int edition;
	private String autor;
	private String ISBN;
	private int numeroPag;
	
	// Métodos constructores
	public Libro(String titulo, int edition, String autor, String ISBN, String ubicacion, String fecha, int numeroPag) {
		super();
		this.titulo = titulo;
		this.edition = edition;
		this.autor = autor;
		this.ISBN = ISBN;
		this.numeroPag = numeroPag;
	}
	public Libro(Scanner sc)
	{
		System.out.println("Título del libro: ");
		titulo = sc.nextLine();
		System.out.println("Número de edición del libro: ");
		edition = sc.nextInt();
		System.out.println("Autor del libro: ");
		sc.nextLine(); // Eliminar buffer (Me salta la siguiente línea si quito esta)
		autor = sc.nextLine();
		System.out.println("ISBN del libro: ");
		ISBN = sc.nextLine();
		System.out.println("Cuantas páginas tiene el libro: ");
		numeroPag = sc.nextInt();
		sc.nextLine(); // Eliminar buffer
	}
	
	// Getter y Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public int getNumeroPag() {
		return numeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}
}