package Ordenado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int nAncho=6;
		int mAlto=3;
		int reservaAlto, reservaAncho;
		int cuchi;
		int filaAlto, columnaAncho;
		boolean repetirCodigo = true;
		Scanner sc = new Scanner(System.in);
		
		while(repetirCodigo == true && mAlto>1 && nAncho>1){
			
			// Primero hacemos el cuadrilatero
			for(filaAlto = 1;filaAlto<=mAlto;filaAlto++)
			{
				for(columnaAncho = 1;columnaAncho<=nAncho;columnaAncho++)
				{
					if(filaAlto>1 && filaAlto<mAlto && columnaAncho>1 && columnaAncho<nAncho)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
			
			// Y luego modificamos el cuadrilatero
			System.out.println("¿Que quieres hacer cuchurrumín?");
			System.out.println("1 agrandar | 2 achicar | 3 cambiar orientación / invertir | 4 salir");
			cuchi = sc.nextInt();
			switch(cuchi)
			{
				case 1:
				{
					System.out.println("Te lo agrando campeón ;)");
					nAncho++;
					mAlto++;
					break;
				}
				case 2:
				{
					System.out.println("Claro que si cari ;p");
					nAncho--;
					mAlto--;
					break;
				}
				case 3:
				{
					System.out.println("Lo que me pida mi amorcín B)");
					reservaAncho = nAncho;
					nAncho = mAlto;
					reservaAlto = mAlto;
					mAlto = reservaAncho;
					break;
				}
				case 4:
				{
					System.out.println("Adios calabacín <3");
					repetirCodigo = false;
					break;
				}
				default:
				{
					System.out.println("Error Inesperado :(");
					System.out.println("Probablemente pusiste un valor incorrecto");
					break;
				}
			}
		}
		
		if(mAlto<2 || nAncho<2)
			System.out.println("Hiciste el cuadrado demasiado pequeño y se rompio :c");
	}
}