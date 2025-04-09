package PaquetePrinciapal;

public class Persona
{
	// Ejercicio 3 de la práctica 3
	// Atributos
	private String dni;
	private String nombrePersona;
	private String apellidosPersona;
	private int edad;
	
	
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * @param nombrePersona the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	/**
	 * @return the apellidosPersona
	 */
	public String getApellidosPersona() {
		return apellidosPersona;
	}

	/**
	 * @param apellidosPersona the apellidosPersona to set
	 */
	public void setApellidosPersona(String apellidosPersona) {
		this.apellidosPersona = apellidosPersona;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Constructores
	public Persona(String dni,String nombrePersona,String apellidosPersona,int edad)
	{
		this.dni = dni;
		this.nombrePersona = nombrePersona;
		this.apellidosPersona = apellidosPersona;
		this.edad = edad;
	}
	
	public Persona()
	{
		this.dni = "Desconocido";
		this.nombrePersona = "Desconocido";
		this.apellidosPersona = "Desconocidos";
		this.edad = 0;
	}
	
	public String toString()
	{
		String resultado;
		String MayorEdad;
		
		MayorEdad = (this.edad>=18)?" es mayor de edad":" no es mayor de edad";
		resultado ="("+this.nombrePersona+" - "+this.apellidosPersona+" - "+this.dni+" - "+this.edad+")";
		//((this.edad<=18)?" es mayor de edad":" no es mayor de edad");
		resultado = resultado + MayorEdad;
		return resultado;
	}

}
