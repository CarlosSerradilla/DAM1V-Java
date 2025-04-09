package ut4_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double note; 
		String result;
		Scanner sc = new Scanner(System.in);
		
		do
		{
		System.out.println("type your note");
		note = sc.nextDouble();
		if (note<0 || note>10)
			System.out.println("null number, introduce(0-10)");
		}while (note<0 || note>10);
		
		if (note<7) 
			result ="Insufficient";
		else
			if (note<7) 
				result ="Good";
				else
					if (note<9)
						result ="Remarkable";
					else
						result ="Outstanding";
								
		//Exit
		System.out.println("your note is "+result);
									
		sc.close();
	}

}
