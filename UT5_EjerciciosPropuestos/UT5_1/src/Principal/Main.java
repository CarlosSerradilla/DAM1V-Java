package Principal;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Empleado emp1,emp2;
		
		emp1 = new Empleado();
		emp2 = new Empleado("Ana Perez" ,8,2500);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		emp2.incrementarSalario(15);
		System.out.println(emp2);
	}

}
