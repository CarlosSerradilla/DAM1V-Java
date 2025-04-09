import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b;
		double mayor,menor;
		double Result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce los numeros");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		mayor = (a>b)? a : b; 
		menor = (a<b)? a : b;
		
		Result = (mayor/menor);
		if(Result % 1 == 0){
		System.out.println("son multiplos");
		}
		else{
			System.out.println("no son multiplos");
		}
		sc.close();
	}

}
