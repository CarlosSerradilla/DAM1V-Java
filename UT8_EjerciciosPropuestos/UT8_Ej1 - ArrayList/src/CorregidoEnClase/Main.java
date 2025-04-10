package CorregidoEnClase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner (System.in);
		List<Integer> lista = new ArrayList<>();
		int numero;
		int suma = 0;
		double media;
		int contador = 0;
		
		System.out.println("Introduzca secuencia de enteros o 0 para terminar");
		numero = sc.nextInt();
		while(numero != 0)
		{
			lista.add(numero);
			numero = sc.nextInt();
		}
		
		for(Integer n : lista)
			suma += n;
		media = (double)suma / lista.size();
		
		for (Integer n : lista)
			if(n>media)
				contador++;
		
		System.out.println("La suma vale "+suma);
		System.out.println("La media vale "+media);
		System.out.println("La cantidad de números que superan la media es "+contador);

		lista.sort(null);
		// Los integer se pueden ordenar poniendo únicamente null con este comando
		
		System.out.println(lista);
		
	}

}
