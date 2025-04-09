package ut4_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dia;
		String diaSemana;
		Scanner sc = new Scanner(System.in);
		
		//Introduce data
		do 
		{	
			System.out.println("introduce un numero");
			dia = sc.nextInt();
			if(dia<1 || dia>7)
				System.out.println("null day, type betten(1-7)");
		}while(dia<1 || dia>7);
		
		//Process
		if (dia==1) 
			diaSemana="Monday";
		else
			if (dia==2) 
				diaSemana="Tuesday";
			else
				if (dia==3) 
					diaSemana="Wensday";
				else
					if (dia==4) 
						diaSemana="Thursday";
					else
						if (dia==5) 
							diaSemana="Friday";
						else
							if (dia==6) 
								diaSemana="Saturday";
							else
								diaSemana="Sunday";
		
		//Result
		System.out.println(diaSemana);
		sc.close();						
		

	}

}
