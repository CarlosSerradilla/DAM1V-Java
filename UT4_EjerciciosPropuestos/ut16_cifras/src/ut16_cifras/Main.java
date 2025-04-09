package ut16_cifras;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int num;
		int ncifras=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a number");
		num = sc.nextInt();
		
		do
		{
		num = num/10;
		ncifras++;
		}while (num!=0);
		
		System.out.println("the number has "+ncifras+" cifras");
		sc.close();
	}

}
