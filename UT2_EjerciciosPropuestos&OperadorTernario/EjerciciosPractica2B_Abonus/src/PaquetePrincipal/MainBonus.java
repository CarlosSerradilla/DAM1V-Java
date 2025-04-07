package PaquetePrincipal;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args)
	{
		double precio,abonoUsuario,cambio;
		int cantidad;
		int b20,b10,b5,m2,m1;
		int m050,m020,m010,m005,m002,m001;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Precio del producto:");
		precio = sc.nextDouble();
		System.out.println("Cantidad que abona el usuario:");
		abonoUsuario = sc.nextDouble();
		cambio = abonoUsuario - precio;
		cantidad = (int) Math.round(cambio * 100);
		// Billetes y monedas
		b20 = cantidad / 2000;
		cantidad = cantidad % 2000;
		b10 = cantidad / 1000;
		cantidad = cantidad % 1000;
		b5 = cantidad / 500;
		cantidad = cantidad % 500;
		
		m2 = cantidad / 200;
		cantidad = cantidad % 200;
		m1 = cantidad / 100;
		
		cantidad = cantidad % 100;
		m050 = cantidad / 50;
		cantidad = cantidad % 50;
		m020 = cantidad / 20;
		cantidad = cantidad % 20;
		m010 = cantidad / 10;
		cantidad = cantidad % 10;
		m005 = cantidad / 5;
		cantidad = cantidad % 5;
		m002 = cantidad / 2;
		cantidad = cantidad % 2;
		m001 = cantidad / 1;
		cantidad = cantidad % 1;
		
		System.out.println("Billetes 20€ "+b20);
		System.out.println("Billetes 10€ "+b10);
		System.out.println("Billetes 5€ "+b5);
		
		System.out.println("Monedas 2€ "+m2);
		System.out.println("Monedas 1€ "+m1);
		
		System.out.println("Monedas 50cent "+m050);
		System.out.println("Monedas 20cent"+m020);
		System.out.println("Monedas 10cent "+m010);
		System.out.println("Monedas 5cent "+m005);
		System.out.println("Monedas 2cent "+m002);
		System.out.println("Monedas 1cent "+m001);
		
		System.out.println("Cantidad vale "+cantidad);
		sc.close();

	}

}
