package Principal;

import java.util.ArrayList;

public class Nota
{
	private String nombreAlumno;
	private ArrayList<Integer> listaNotas; //
	
	public Nota(String nombreAlumno) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.listaNotas = new ArrayList<>();
	}
	
	public void addNota(int nota)
	{
		listaNotas.add(nota);
	}
	
	public String toString()
	{
		String resultado ="";
		double media;
		int suma = 0;
		
		for (Integer nota : listaNotas)
			suma += nota;
		media = (double) suma/listaNotas.size();
		resultado = nombreAlumno + " " + media;
		
		return resultado;
	}
	
}
