package Principal;

public class Main {

	public static void main(String[] args)
	{
		int [][] marco;
		int filas = 5;
		int columnas = 15;
				
		marco = new int[filas][columnas];

		
		//Aqui empieza la bueno ;)
		
		for(int f=0; f<filas; f++)
			for(int c=0; c<columnas; c++) {
				if(f==0 || f ==4)
				{
					marco[f][c]=1;
				}
				else if(c==0 || c ==14)
				{
					marco[f][c]=1;
				}
			}
		
		
		for(int f=0; f<filas; f++) {
				for(int c=0; c<columnas; c++)
					System.out.print(marco[f][c]);
				System.out.println();	//Salto de línea
		}
		
	}

}
