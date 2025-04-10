package Principal;

public class Main {

	public static void main(String[] args)
	{
		int hexadecimal = 0x10;
		// Esta pasaría el número decimal a hexadecimal, a al revés, no se estoy camsado
		int binario = 0b10;
		// Esta pasaría el decimal a binario
		int octal = 010;
		// ünicamente con un 0 a la izquierda se pasaría a octal
		System.out.println("El número 10 en hexadecimal vale "+hexadecimal);
		System.out.println("El número 10 en binario vale "+binario);
		System.out.println("El número 10 en octal vale "+octal);

	}

}
