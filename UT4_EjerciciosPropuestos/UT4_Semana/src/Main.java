import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		int miCodigoEsGodElTuyoZZZ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el día de la semana (Del 1 al 7)");
		miCodigoEsGodElTuyoZZZ = sc.nextInt();
		
		if (miCodigoEsGodElTuyoZZZ>0 && miCodigoEsGodElTuyoZZZ<8)
		{
			System.out.println("Has puesto un número valido en tu código GOD");
			
			if(miCodigoEsGodElTuyoZZZ==1)
			{
				System.out.println("Hoy es lunes :(");
			}
			else if(miCodigoEsGodElTuyoZZZ==2)
			{
				System.out.println("Hoy es martes");
			}
			else if(miCodigoEsGodElTuyoZZZ==3)
			{
				System.out.println("Hoy es miercoles");
			}
			else if(miCodigoEsGodElTuyoZZZ==4)
			{
				System.out.println("Hoy es jueves");
			}
			else if(miCodigoEsGodElTuyoZZZ==5)
			{
				System.out.println("¡Hoy es viernes! SIUUUUU");
			}
			else if(miCodigoEsGodElTuyoZZZ==6)
			{
				System.out.println("Hoy es sábado de no hacer nada");
			}
			else if(miCodigoEsGodElTuyoZZZ==7)
			{
				System.out.println("Hoy es domingo de no levantarse de la cama");
			}
		}
		else
		{
			System.out.println("Eso no es un número válido");
		}
		sc.close();
	}
}