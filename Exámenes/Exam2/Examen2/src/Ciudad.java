
public class Ciudad {

	private String denominacion;
	private double latitud;
	private double longitud;
	private double altitud;
	
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getAltitud() {
		return altitud;
	}
	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}
	
	public Ciudad(String denominacion, double latitud, double longitud, double altitud) {
		super();
		this.denominacion = denominacion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.altitud = altitud;
	}
	
	
	@Override
	public String toString() {
		return "Ciudad [denominacion=" + denominacion + ", latitud=" + latitud + ", longitud=" + longitud + ", altitud="+ altitud + "]";
	}
	
}
