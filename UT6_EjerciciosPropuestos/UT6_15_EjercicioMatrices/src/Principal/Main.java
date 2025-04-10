package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// Matríz:
		double [][] matriz;
		// Datos de la matríz:
		int filas = 4;
		int columnas = 5;
		
		double [] vector;
		
		matriz = new double[filas][columnas];
		// Con esto tendríamos 20 doubles (4 * 5)
		
		vector = new double [filas];

		Scanner sc = new Scanner (System.in);
		
		// Con estos bucles se recorrería la matriz
		for(int f=0; f<filas; f++)
			for(int c=0; c<columnas; c++) {
				System.out.println("Introduzca el elemento: "+f+"."+c);
				matriz[f][c]=sc.nextDouble();
			}
		
		for(int f=0; f<filas; f++){
			vector[f]=0;
			for(int c=0; c<columnas; c++)
				vector[f]=vector[f]+matriz[f][c];
			}
		
		for(int f=0; f<filas; f++) {
			for(int c=0; c<columnas; c++)
				System.out.print(matriz[f][c]+" ");
			System.out.print(" -- "+vector[f]);
			System.out.println();	//Salto de línea
		}
		
		sc.close();
	}

}
