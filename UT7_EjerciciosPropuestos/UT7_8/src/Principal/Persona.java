package Principal;

public class Persona
{
	private static String tablaDNI = "QWERTYUIOPASDFGHJKLZXCVBNM";	//iNVENTADO
	
	private String nombre = "";
	private int edad;// Suele ser más recomendable poner la fecha de nacimiento en vez de la edad
	//Para representar fechas se suele usar la clase LocalDate
	protected String dni_nie = "";
	
	public Persona() // Aunque no lo pongas se crea por defecto sin que se vea
	{
		
	}
	
	public Persona(String nombre, int edad) {	// sin DNI
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad, String dni_nie) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni_nie = dni_nie;
	}

	public Boolean esMayorDeEdad()	// La diferencia entre boolean y Boolean:
	//boolean es un tipo de variable y Boolean es una clase
	{
		if (this.edad<18)
			return false;
		else
		return true;
	}
	
	public Boolean dniValido(String dni)
	{
		dni = dni.toUpperCase(); // Transforma minusculas en mayúsculas

		switch (dni.charAt(0))	// En casod de que sea NIE
		{
		case 'X':dni = "0"+dni.substring(1,dni.length());break;
		case 'Y':dni = "1"+dni.substring(1,dni.length());break;
		case 'Z':dni = "2"+dni.substring(1,dni.length());break;
		}
		
		System.out.println(dni);
		
		char letra = dni.charAt(dni.length()-1);
		long numero = Integer.parseInt(dni.substring(0,dni.length()-1));
		
		char letraOK = tablaDNI.charAt((int)numero%23);
		if (letra == letraOK)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return nombre + " " + edad + " dni_nie=" + dni_nie;
	}
	
	
}
