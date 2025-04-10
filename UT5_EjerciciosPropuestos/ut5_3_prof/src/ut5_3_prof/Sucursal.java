package ut5_3_prof;

public class Sucursal {
	// Esta variable tiene que ser estática porque este atributu se comparte a través de las diferentes "sucursales"
	private static int secuencia=0;
	private int numero;
	private String directorio;
	private String ciudad;
	
	// ./Source/Generate constructor using Fields
	// Este método se encarga de que cada vez que creemos una sucursal tenga como número de secuencia
	//el siguiente al que tenía la anterior sucursal que creamos
	public Sucursal(String directorio, String ciudad) {
		/**super();**/	// Llama al constructor de Object
		this.directorio = directorio;
		this.ciudad = ciudad;
		this.numero = this.secuencia;
		this.secuencia++;
	}

	// ./Source/Generate Getters and Setters| remove void
	public String getDirectorio() {
		return directorio;
	}

	public String getCiudad() {
		return ciudad;
	}	
	public double setPrecio(Paquete paquete) {
		double precio;
		
		precio = paquete.getPeso()*5.0;
		switch(paquete.getPrioridad())
		{
			case NORMAL:break;
			case ALTA:precio+=10;break;
			case URGENTE:precio+=20;break;
		}return precio;
	}
	
	public String toString()
	{
		String resultado="";
		resultado += "Número"+this.numero;
		resultado += "Ciudad"+this.ciudad;
		resultado += "Dirección"+this.directorio;
		return resultado;
	}
}
