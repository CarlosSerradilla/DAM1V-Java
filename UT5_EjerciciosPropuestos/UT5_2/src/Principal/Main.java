package Principal;

public class Main
{
	public static void main(String[] args)
	{
		Movil movil1, movil2, movil3;
		
		movil1 = new Movil(654645666,35,TarifaEnum.ELEFANTE);
		movil2 = new Movil(679123269,69,TarifaEnum.TIGRE);
		movil3 = new Movil(654645777,24,TarifaEnum.GATO);
		
		System.out.println(movil1);
		System.out.println(movil2);
		System.out.println(movil3);

	}

}