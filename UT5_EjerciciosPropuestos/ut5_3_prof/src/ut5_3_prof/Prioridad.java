package ut5_3_prof;

public enum Prioridad {
	NORMAL(0),ALTA(10),URGENTE(20),AYER(50);
	
	private double incremento;
	
	private Prioridad(double incremento)
	{
		this.incremento = incremento;
	}
	
	public double getIncremento()
	{
		return this.incremento;
	}

}
