package IntentoDePrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Principal.Producto;

public class Main {

	public static void main(String[] args)
	{
		ArrayList<Producto> carrito = new ArrayList<>();
		HashMap<String,Double> almacen = new HashMap<>();
		almacen.put("Katana ZERO",14.99);
		almacen.put("Half Life",2.99);
		almacen.put("Rainworld",9.99);
		almacen.put("Tu madre",2.49);
		
		String nombreProducto;
		int cantidadProducto;
		double precioProducto;
		Producto producto;
		String codigoDescuento;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Qué producto vas a comprar?");
		
		sc.close();
	}
}
