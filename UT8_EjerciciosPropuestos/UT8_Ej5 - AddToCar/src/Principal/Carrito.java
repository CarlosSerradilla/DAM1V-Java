package Principal;

import java.util.ArrayList;

public class Carrito
{
	private ArrayList<Elemento> listaCarrito;
	//List<Integer> lista = new ArrayList<>();
		// Ejemplo de lista base que usa una ArrayList

	// Método constructor
	public Carrito() {
		listaCarrito = new ArrayList<>();
	}
	
	
	public boolean addElemento(Elemento e)
	{
		return listaCarrito.add(e);
	}

	public boolean delElemento(Elemento e)
	{
		return listaCarrito.remove(e);
	}

	@Override
	public String toString() {
		return "  " + listaCarrito;
	}
	
}
