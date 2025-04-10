package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int [][] ticTacToe;
		int filas = 3;
		int columnas = 3;
		int f = 0;
		int c = 0;
		boolean GameOver = false;
		
		int optionPlayerA, optionPlayerB;
				
		ticTacToe = new int[filas][columnas];
		
		
		Scanner sc = new Scanner (System.in);
		
		do {
		for(f=0; f<filas; f++) {
				for(c=0; c<columnas; c++)
					System.out.print(ticTacToe[f][c]+" ");
				System.out.println();	//Salto de línea
		}
		System.out.println("Turno del jugador A");
		System.out.println("1 - Arriba a la izquierda");
		System.out.println("2 - Arriba al centro");
		System.out.println("3 - Arriba a la derecha");
		System.out.println("4 - Al centro a la izquierda");
		System.out.println("5 - Al centro del todo");
		System.out.println("6 - Al centro a la derecha");
		System.out.println("7 - Abajo a la izquierda");
		System.out.println("8 - Abajo al centro");
		System.out.println("9 - Abajo a la derecha");
		optionPlayerA = sc.nextInt();
		
		for(f=0; f<filas; f++) {
			for(c=0; c<columnas; c++)
				System.out.print(ticTacToe[f][c]+" ");
			System.out.println();	//Salto de línea
		}
		
		System.out.println("Turno del jugador B");
		System.out.println("1 - Arriba a la izquierda");
		System.out.println("2 - Arriba al centro");
		System.out.println("3 - Arriba a la derecha");
		System.out.println("4 - Al centro a la izquierda");
		System.out.println("5 - Al centro del todo");
		System.out.println("6 - Al centro a la derecha");
		System.out.println("7 - Abajo a la izquierda");
		System.out.println("8 - Abajo al centro");
		System.out.println("9 - Abajo a la derecha");
		
		optionPlayerB = sc.nextInt();
		
		GameOver = true;
		}while(GameOver == false);
		
		for(f=0; f<filas; f++)
			for(c=0; c<columnas; c++) {
				if(f==0 || f ==4)
				{
					ticTacToe[f][c]=1;
				}
				else if(c==0 || c ==14)
				{
					ticTacToe[f][c]=1;
				}
			}
		
		
		sc.close();
		
		// Metodos:
		
		//private int
	}
}