package Principal;

public class Movil {
	private String numero;
	private Tarifa tarifa;
	private int minutos;
	
	public Movil(String numero, Tarifa tarifa) {
		this.numero = numero;
		this.tarifa = tarifa;
		this.minutos = 0;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



	public void Llamar (int segundos) {
		this.minutos += Math.ceil(((double)segundos/60));
	}
	
	public void Reiniciar () {
		this.minutos = 0;
	}
	
	public String toString () {
		String resultado="";
		resultado +="FACTURA\n";
		resultado +="\n";
		resultado +="Numero: "+this.numero+"\n";
		resultado +="Tarifa:"+tarifa.name()+"\n";
		resultado +="Consumo:"+this.minutos+" min\n";
		resultado +="Coste:"+this.minutos*this.tarifa.getCosteXMinuto()+" euros";
		return resultado;
	}

}
