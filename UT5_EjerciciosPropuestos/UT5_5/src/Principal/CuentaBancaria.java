package Principal;

public class CuentaBancaria {

	private String IBAN;
	private String titular;
	private double saldo;
	private double mov1,mov2,mov3,mov4,mov5;	// En este caso lo mas recomendable es usar un array
	private int nMovimientos;
	private String movimientos;
	
	public CuentaBancaria(String IBAN, String titular)
	{
		this.IBAN = IBAN;
		this.titular = titular;
		this.saldo = 0;
		this.nMovimientos = 0;
		this.movimientos = "";
	}
	
	public boolean Ingreso(double cantidad)
	{
		boolean exito = false;
		if (cantidad>0) {
			this.saldo += cantidad;
			exito = true;
			this.movimientos += "Ingreso de"+cantidad+"€\n";
			this.nMovimientos++;
			switch(this.nMovimientos)
			{
			case 1: this.mov1 = cantidad;break;
			case 2: this.mov2 = cantidad;break;
			case 3: this.mov3 = cantidad;break;
			case 4: this.mov4 = cantidad;break;
			case 5: this.mov5 = cantidad;break;
			default: System.out.println("No quedan movimientos disponibles");break;
			}
		}
		return exito;
	}
	
	public boolean Reintegro(double cantidad)
	{
		boolean exito = false;
		if (cantidad > 0)
		{
			if(this.saldo - cantidad >= -50) {
				this.saldo -= cantidad;
				exito = true;
				if(this.saldo<0)
					System.out.println("Aviso: Saldo negativo");
				if(cantidad > 3000)
					System.out.println("Aviso: Hacienda viene a por ti");}
				this.movimientos += "Reintegro de "+cantidad+"€\n";
				this.nMovimientos++;
				switch(this.nMovimientos)
				{
				case 1: this.mov1 = -cantidad;break;
				case 2: this.mov2 = -cantidad;break;
				case 3: this.mov3 = -cantidad;break;
				case 4: this.mov4 = -cantidad;break;
				case 5: this.mov5 = -cantidad;break;
				default: System.out.println("No quedan movimientos disponibles");break;
				}
		}
		
		return exito;
	}
	
	public void VerMovimientos()
	{
		int n;
		System.out.println("Todos los movimientos:");
		System.out.println("----------------------");
		System.out.println(this.movimientos);
		
		System.out.println("Primeros movimientos:");
		n = this.nMovimientos;
		
		if(n > 5)
			n = 5;
		switch(n)
		{
		case 5: System.out.println("Movimiento 5:"+mov5);
		case 4: System.out.println("Movimiento 4:"+mov4);
		case 3: System.out.println("Movimiento 3:"+mov3);
		case 2: System.out.println("Movimiento 2:"+mov2);
		case 1: System.out.println("Movimiento 1:"+mov1);break;
		// Al no poner break, al realizar un case se realizarían los case siguientes
		}
	}
	
	public double AjusteDecimal(double cantidad) 
	{
		cantidad = cantidad * 100;
		cantidad = Math.round(cantidad);
		//cantidad = //no se que mas ponía
		return cantidad;
	}

	public String getIBAN() {
		return IBAN;
	}
	public String getTitular() {
		return titular;
	}
	public double getSaldo() {
		saldo = AjusteDecimal(this.saldo);
		return saldo;
	}
}
