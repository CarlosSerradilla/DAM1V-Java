package ut4_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int num;
		int decenas;
		int unidades;
		String numeroLetra;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type a number");
		num = sc.nextInt();
		if (num<0 || num>99) {
			System.out.println("num null, type betten (0-99)");
		}while (num<0 || num>99);
		
		decenas = num / 10;
		unidades = num % 10;
		
		if (num<10) 
			
		switch (decenas) 
		{
		case 2: numeroLetra="veinte";break;
		case 3: numeroLetra="treinta";break;
		case 4: numeroLetra="cuarenta";break;
		case 5: numeroLetra="cincuenta";break;
		case 6: numeroLetra="sesenta";break;
		case 7: numeroLetra="setenta";break;
		case 8: numeroLetra="ochenta";break;
		case 9: numeroLetra="noventa";break;
		}
		
		if (num>30) 
			numeroLetra+="y";
		
		switch (unidades) 
		{
		case 1: numeroLetra+="uno";break;
		case 2: numeroLetra+="dos";break;
		case 3: numeroLetra+="tres";break;
		case 4: numeroLetra+="cuatro";break;
		case 5: numeroLetra+="cinco";break;
		case 6: numeroLetra+="seis";break;
		case 7: numeroLetra+="siete";break;
		case 8: numeroLetra+="ocho";break;
		case 9: numeroLetra+="nueve";break;
		}
		
		System.out.println("result is ");
		sc.close();
	}

}
