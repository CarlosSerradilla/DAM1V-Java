package Principal;

public class Producto
{
	// Variables:
	private int codigoProducto;
	private String nombreProducto;
	private double precioProducto;
	private int cantidadStock;
	
	// Método/s constructor/es:
	public Producto(int codigoProducto, String nombreProducto, double precioProducto, int cantidadStock) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.cantidadStock = cantidadStock;
	}

	// Getters y Setters:
	public int getCodigoProducto() {
		return codigoProducto;
	}public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}public String getNombreProducto() {
		return nombreProducto;
	}public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}public double getPrecioProducto() {
		return precioProducto;
	}public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}public int getCantidadStock() {
		return cantidadStock;
	}public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", cantidadStock=" + cantidadStock + "]";
	}
	
}
