package Principal;
enum TarifaEnum {ELEFANTE,TIGRE,GATO}

public class Movil
{
	// Variables
	int numeroTel, consumoMin;
	TarifaEnum tarifa;
	
	// Método constructor
	public Movil(int numeroTel, int consumoMin, TarifaEnum tarifa){
		this.numeroTel = numeroTel;
		this.consumoMin = consumoMin;
		this.tarifa = tarifa;
	}
	
	
	// Funciones que piden:
	public float Llamar()
	{
		float coste = 0;
		
		switch(tarifa)
		{
		case ELEFANTE: coste = 0.30f; break;
		case TIGRE: coste = 0.18f; break;
		case GATO: coste = 0.07f; break;
		}
		
		return coste;
	}
	
	public void Reiniciar()
	{
		consumoMin = 0;
	}
	
	public String toString()
	{
		String resultado;
		
		resultado = "Número "+this.numeroTel+this.consumoMin+this.tarifa;
		
		return resultado;
	}
}
