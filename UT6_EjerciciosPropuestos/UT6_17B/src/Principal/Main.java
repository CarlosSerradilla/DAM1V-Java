package Principal;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Tablero tablero = new Tablero(3);
		int jugadorActual=1;
		boolean finJuego = false;
		int fila,columna;
		
		tablero.display();
		do
		{
			System.out.println("Turno del jugador "+jugadorActual);
			System.out.print("Introduzca fila y columna:");
			fila = sc.nextInt();
			columna = sc.nextInt();
			if (tablero.jugada(fila,columna,jugadorActual)==false)
				System.out.println("Movimiento incorrecto");
			else
			{
				tablero.display();
				if (tablero.esGanador(fila,columna,jugadorActual))
				{
					System.out.println("Gana el jugador "+jugadorActual);
					finJuego=true;
				}
				else
					if (tablero.completo())
					{
						System.out.println("Empate");
						finJuego=true;
					}
					else
						jugadorActual = (jugadorActual%2)+1;
			}
		} while (!finJuego);
		sc.close();
	}
}
