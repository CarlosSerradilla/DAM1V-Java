# JAVA - Programación (DAM1V)
<img src="https://cdn.worldvectorlogo.com/logos/java.svg" alt="JavaLogo" width="200" height="200">

```java
package Principal;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Ejercicio 1
		int Precio,Porcentaje; //El precio y el porcentaje que descontamos
		int ResultadoTotal;
		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Introduzca el precio:");
		Precio = sc.nextInt();
		System.out.println("Introduzca el descuento:");
		Porcentaje = sc.nextInt();
		ResultadoTotal = Precio - Precio * Porcentaje / 100;
			// Con este cálculo calculamos el porcentaje de descuento
		
		//Resultado:
		System.out.println("El resultado es: "+ResultadoTotal);
		sc.close();
	}

}
```

## Algunos temarios pueden estar incompletos
### Contenido que hemos ido dando en clase de Programación sobre Java
