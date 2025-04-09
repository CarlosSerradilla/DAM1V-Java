package Principal;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double note;
		System.out.println("Introduce your calification");
		note = sc.nextDouble();

			if(note < 0 || note > 10){
				System.out.println("Select other number");
			}
			else{
				
				if(note < 5 && note > -1) {
					System.out.println("Insufficient");
				}
				else if(note < 6 && note > 4) {
					System.out.println("Enough");
				}
	
				else if(note<7) {
					System.out.println("Good");
				}
	
				else if(note<9) {
					System.out.println("Remarkable");
				}
	
				else if(note<=10) {
					System.out.println("Outstanding");
				}
			}
			sc.close();
		}
		

	}

