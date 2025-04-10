package Principal;

import java.util.Arrays;

public class Alumnos
{
	private Alumno[] alumno;
	// Al crear una array podemos generar tantos alumnos como querammos
	private int nAlumnosMax, nAlumnosActual;
	
	public Alumnos(int n)
	{
		this.nAlumnosMax = n;
		this.nAlumnosActual = 0;
		alumno = new Alumno[n];
	}
	
	public boolean addAlumno(Alumno a)
	{
		if(this.nAlumnosActual == this.nAlumnosMax)
			return false;
		
		else{
			alumno[this.nAlumnosActual++] = a;
			return true;}
	}
	
	public boolean addAlumno(String nombre, int edad)
	{
		if(this.nAlumnosActual == this.nAlumnosMax)
			return false;
		
		else{
			alumno[this.nAlumnosActual++] = new Alumno(nombre, edad);
			return true;}
	}
	
	public int buscarXNombre(String nombre)
	{
		for(int i=0; i<alumno.length; i++)
		{
			if (alumno[i].getNombre().equals(nombre)) 
				return i;
			return -1;
				
		}
		return 0;
	}
	
	public boolean deleteAlumno(String nombre)
	{
		int pos = buscarXNombre(nombre);
		if(pos == -1)
			return false;
		else {
			for(int i=pos;i<alumno.length-1; i++)
				alumno[i] = alumno[i+1];
			this.nAlumnosActual--;
			return true;
		}
	}
	
	public boolean updateAlumno(String nombreOld, String nombreNew)
	{
		int pos = buscarXNombre(nombreOld);
		if(pos ==-1)
			return false;
		else {
			alumno[pos].setNombre(nombreNew);
			return true;
		}
	}

	@Override
	public String toString() {
		String resultado = "";
		for (int i=0; i<alumno.length; i++)
			resultado += alumno[i];
		return resultado;
	}
}
