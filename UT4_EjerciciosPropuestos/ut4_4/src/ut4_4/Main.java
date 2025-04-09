package ut4_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		String momentDay;
		String sex;
		String salute;
		
		Scanner sc = new Scanner(System.in);
		momentDay = sc.next();
		System.out.println("Sex(m-f):");
		sex = sc.next();
		System.out.println();
		salute = sc.next();
		System.out.println();
		
		switch (momentDay)
		{
		case "m":
		case "M": salute = "Good Morning";break;
		case "a":
		case "A": salute = "Good Afernoon";break;
		case "n":
		case "N": salute = "Good Night";break;
		default: salute = "Gettings,";
		}
		
		switch (sex.charAt(0)) 
		{
		case 'm':
		case 'M': salute = salute + "Mr";break;
		case 'f':
		case 'F': salute = salute + "Ms";break;
		default: salute+= "";
		}
		
		sc.close();
	}

}
