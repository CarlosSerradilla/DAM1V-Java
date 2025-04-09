package Principal;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//Atributos
		int num1,num2;
		int mayor,menor;
		String parOImpar;
		
		Scanner sc = new Scanner (System.in);
		
		// Escribimos los dos número y le decimos si queremos ver los numeros pares o impares
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		System.out.println("Para ver los numeros impares ponga	i");
		System.out.println("Para ver los numeros pares ponga	p");
		parOImpar = sc.next();
		
		//Ordenamos los números en caso de que el primero sea mayor al segundo
		mayor = (num1>num2)? num1 : num2;
		menor = (num1<num2)? num1 : num2;
		
		// Verificar si se ha puesto i o p o si en cambio se puso otra letra
		if(parOImpar.equals("i")||parOImpar.equals("I"))
		{
			for(int i = menor;i<=mayor;i++)
			{
				if (i%2 != 0)
				{
					System.out.println(i);
				}
			}
		}
		else if(parOImpar.equals("p")||parOImpar.equals("P"))
		{
			for(int i = menor;i<=mayor;i++)
			{
				if (i%2 == 0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Solo se aceptan las letras i & p");
			System.out.println("Reinicie y vuelva a intentar");
		}
		
		sc.close();
	}

}