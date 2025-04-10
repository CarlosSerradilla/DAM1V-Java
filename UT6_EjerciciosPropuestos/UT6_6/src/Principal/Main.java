package Principal;

public class Main {

	public static void main(String[] args)
	{
		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int inversion[] = new int [numeros.length];
		
		for(int i=0; i<inversion.length; i++)
			inversion[i] = numeros[numeros.length-1-i];
		
		for(int i=0; i<inversion.length; i++)
			System.out.println(inversion[i]+" ");

	}

}
