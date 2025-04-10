package Principal;

enum Tarifa{NORMAL, ALTA, URGENTE}
// CON ESTA LÍNEA ACABAMOS DE CREAR UN TIPO NUEVO, EL TIPO "TARIFA"
// Este es el método sencillo

public class Paquete {
	
	private int id;
	private Tarifa prioridad;
	// Esta es la referencia a la línea que hemos creado en este Script
	
	private TarifaScript tarifa;
	// Esta hace referencia al script Enum
	
	private double peso;
	
	public double getCoste()
	{
		double coste;
		coste = 12 * peso;
		
		// Este Switch esta usando la clase que hemos creado en este Script
		switch(prioridad)
		{
		case NORMAL:break;
		case ALTA: coste += 40;break;
		case URGENTE: coste += 60;
		}
		
		coste += prioridad.getCosteAdicional();
		
		// Este Switch esta usando el Script que hemos creado al lado, TarifaScript
		switch(prioridad)
		{
		case NORMAL:coste += tarifa.NORMAL.getCosteAdicional();break;
		case ALTA:coste += tarifa.ALTA.getCosteAdicional();break;
		case URGENTE:coste += tarifa.URGENTE.getCosteAdicional();
		}
		
		tarifa.ALTA.ordinal();
		tarifa.ALTA.toString();
		System.out.println(tarifa.ALTA);
		
		for(tarifa t : tarifa.values());
			suma = suma + t.getCosteAdicional();
		
			tarifa.valueOf("ALTA");
		return coste;
	}
}
