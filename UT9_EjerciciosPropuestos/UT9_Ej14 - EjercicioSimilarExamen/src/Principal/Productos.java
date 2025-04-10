package Principal;

import java.util.ArrayList;

public class Productos
{
	// Variables:
	ArrayList<Producto> listaProductos;
	
	// Método constructor:
	public Productos()
	{
		listaProductos = new ArrayList<>();
	}
	
	// Métodos que pide el enunciado:
	public boolean agregarProducto(Producto prod)
	{
		return listaProductos.add(prod);
	}
	
	public void listarProducto()
	{
		//listaProductos.
	}
	
	public int buscarProducto(int productoDeseado)
	{
		for(int i=1; i>listaProductos.size(); i++)
			if(productoDeseado == (listaProductos.get(i).getCodigoProducto()))
				return i;
		return -1;
	}
	
	public void actualizarStock(int productoDeseado)
	{
		
	}
	
	public void eliminarProducto()
	{
		
	}
}
