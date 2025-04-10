package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// ESTO SON 2 RA
// COLECCIONES Y BUCLES
public class Main {

	public static void main(String[] args)
	{
		ArrayList<Producto> carrito = new ArrayList<>();
		HashMap<String,Double> almacen = new HashMap<>();
		inicializarAlmacen(almacen);
		
		String nombreProducto;
		int cantidadProducto;
		double precioProducto;
		Producto producto;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Qué producto vas a comprar?");
		nombreProducto = sc.nextLine();
		
		while (nombreProducto.equals("FIN") == false)
		{
			if (almacen.containsKey(nombreProducto))
			{
				System.out.println("¿Cúantos quieres?");
				cantidadProducto = sc.nextInt();
				sc.nextLine();
				precioProducto = almacen.get(nombreProducto);
				producto = new Producto(nombreProducto,precioProducto,cantidadProducto);
				carrito.add(producto);
			}
			else
				System.out.println("No quedan existencias");
			
			System.out.println("¿Qué otro producto vas a comprar?");
			nombreProducto = sc.nextLine();
		}
		
		if (carrito.isEmpty())
			System.out.println("Carrito vacio");
		else
		{
			double total = 0;
			//System.out.println(carrito);		versión antigua
			for (Producto p : carrito)
			{
				System.out.println(p);
				total += p.getPrecio() * p.getCantidad();
			}
			System.out.println("El coste total es "+total);
		}
		
		sc.close();
	}

	public static void inicializarAlmacen(HashMap<String,Double> almacen)
	{
		almacen.put("Avena",2.21);
		almacen.put("Garbanzos",2.39);
		almacen.put("Tomate",1.59);
		almacen.put("Jengibre",3.13);
		almacen.put("Quinoa",4.5);
		almacen.put("Guisantes",1.6);
	}
	
}
