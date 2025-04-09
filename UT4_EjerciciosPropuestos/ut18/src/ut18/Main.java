package ut18;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int n1,n2;
		int n3,n4;
		Scanner sc = new Scanner(System.in);
		boolean fin = false;

		do
		{
		//Primera pareja
		do
		{
			System.out.println("type two numbers");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if (n2-n1!=1)
				System.out.println("not consecutive numbers");
		}while(n2-n1!=1);

		//Segunda pareja
		do
		{
			System.out.println("Consecutive numbers");
			n3 = sc.nextInt();
			n4 = sc.nextInt();
			if (n4-n3!=1)
				System.out.println("Los números no son consecutivos");
		}while(n4-n3!=1);	

		if (n3-n2==1)
			fin = true;
		n1=n3;
		n2=n4;	
		
		}while(fin==false);
	System.out.println("Gracias");
	sc.close();
}

}
