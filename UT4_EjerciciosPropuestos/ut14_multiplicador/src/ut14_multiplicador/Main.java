package ut14_multiplicador;

import java.util.Iterator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int number;
		int i;
		String answer = "Y";
		Scanner sc = new Scanner(System.in);


		do
		{
			do
			{
				System.out.println("Type a number betten(1-10)");
				number = sc.nextInt();
				sc.nextLine();

				if (number<0 || number>10)
					System.out.println("Out of range");
			}while(number<0 || number>10);

			for(i=1;i<=10;i++) 
			{
				System.out.println(i+"x"+number+"="+(i*number));
				System.out.println("continue(Y/N)");
				answer = sc.nextLine();
				System.out.println(answer);
			}
		}while(answer.toUpperCase().equals("Y"));
		sc.close();
		
	}
}