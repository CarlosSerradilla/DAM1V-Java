package Principal;

public class Main {

	public static void main(String[] args)
	{
		Carrito carrito = new Carrito();
		
		carrito.addElemento(new Elemento("SANABI", 19.99, 1));
		carrito.addElemento(new Elemento("Katana ZERO", 19.99, 3));
		carrito.addElemento(new Elemento("Hollow Knight", 14.99, 2));

		System.out.println("Los elementos de tu carrito son: ");
		System.out.println(carrito);
		
	}

}
