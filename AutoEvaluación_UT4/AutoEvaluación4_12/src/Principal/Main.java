package Principal;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args)
	{
		// Script para sacarle los cuartos a los chabales en el Roblox
		
		// Aquí almacenamos las 5 opciones que nos pueden salir
        String[] figura = {"Corazón","Herradura","Diamante","Campana","Limón"};
        
        // Este objeto almacena los valores random
        Random random = new Random();
        
		int robux = 5;
		int sacaCuartos = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe 1 para hacer una tirada");
		System.out.println("Pon cualquier otro número para salir del programa");
		sacaCuartos = sc.nextInt();
		
		while(sacaCuartos == 1 && robux>0)
		{
			// Genera un índice aleatorio entre 0 y 4
	        int indiceAleatorio = random.nextInt(figura.length);
	        
	        robux--;
	        
	        // Imprime una figura seleccionada al azar
	        System.out.println("Cadena aleatoria: " + figura[indiceAleatorio]);
	        
	        if(robux > 0) {
	        System.out.println("Aun te quedan "+robux+" monedas");
	        System.out.println("Escribe 1 para hacer otra tirada");
			System.out.println("Pon cualquier otro número para salir del programa");
			sacaCuartos = sc.nextInt();}
	        else
	        	System.out.println("Te has quedado sin dinero");
		}
		
		System.out.println("GAME OVER");
        sc.close();
        
	}
}