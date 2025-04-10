package Principal;

public enum Tarifa {
	ELEFANTE(0.30), TIGRE(0.18), GATO(0.07);
	private double costeXMinuto;
	
	private Tarifa (double costeXMinuto) {
		this.costeXMinuto = costeXMinuto;
	}
	
	public double getCosteXMinuto () {
		return this.costeXMinuto;
	}
}
