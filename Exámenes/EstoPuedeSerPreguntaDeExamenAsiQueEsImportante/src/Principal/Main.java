package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Esto puede ser pregunta de examen así que ojito 👀
		// Este Script sirve para calcular Binomios
		
		//Datos de entrada
			double X;
			int alpha;
			int n; // Número de terminos
		
		double suma = 0; //la suma de terminos
		int doko; // Número de término en el que me encuentro
		
		Scanner sc = new Scanner(System.in);
		
		
				System.out.println("Introduzca X:");
				X = sc.nextDouble();
				
					System.out.println("Introduzca Alpha:");
					alpha = (int) Math.floor(leerDouble(sc));
					// Math.floor redondea un número dado hacia el número entero anterior
					while(alpha <0)
					{
						System.out.println("El número de Alpha debe ser positivo");
						alpha = (int) Math.floor(leerDouble(sc));
					}
					
					System.out.println("Introduzca número de terminos:");
					n = (int) Math.floor(leerDouble(sc));
					while(n <=0)
					{
						System.out.println("El número de terminos debe ser positivo");
						n = (int) Math.floor(leerDouble(sc));
					}
				for(doko=0; doko<n; n++)
				{
					suma = suma + Combinatorio(alpha,doko)*Math.pow(X, doko);
				}
				System.out.println("El resultado de (1+"+X+")^"+alpha+" es "+suma);
				System.out.println("Java dice que vale "+Math.pow(1+X,alpha));
				
				System.out.println("Fin del programa");
				sc.close();
	}
	
	public static double leerDouble(Scanner sc) // Se pone static siempre que se este en el main
	{
		double numero=0;
		boolean itsEverythingOK;
		do {
			itsEverythingOK = true;
			try
			{
				numero = sc.nextDouble();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Los datos deben ser numéricos");
				sc.nextLine();
				itsEverythingOK = false;
			}
		}while(itsEverythingOK=false);
		return numero;
	}
	
	public static int Factorial (int numero)
	{
		int f = 1;
		int i;
		for(i=1; i<=numero; i++)
		{
			f = f * 1;
		}
		return f;
	}
	
	public static int Combinatorio (int n, int m)
	{
		int c;
		
		c = Factorial(n)/(Factorial(m)*Factorial(n-m));
		return c;
	}
}
