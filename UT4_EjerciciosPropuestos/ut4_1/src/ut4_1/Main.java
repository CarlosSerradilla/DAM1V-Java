package ut4_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		int mayor,menor;
		String result;
		Scanner sc = new Scanner(System.in);
		
		// enter data
		System.out.println("introduce datos");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		//process
		//locate mayor y minor
		//y determinate the divisibility
		
		mayor = (n1>n2)?n1:n2;
		menor = (n1>n2)?n2:n1;
		
		if (mayor%menor == 0)
			result = mayor+" es multiplo de "+menor;
		else
			result = mayor+" no es multiplo de "+menor;
		
		//resultado
		System.out.println(result);
		sc.close();
		

	}

}
