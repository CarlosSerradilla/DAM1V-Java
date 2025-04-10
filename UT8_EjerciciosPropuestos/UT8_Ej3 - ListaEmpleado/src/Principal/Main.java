package Principal;

public class Main {

	public static void main(String[] args)
	{
		Empleados empleados = new Empleados();
		
		Empleado e;
		empleados.addEmpleado(new Comercial("Pepe","1",1000,15.0));
		empleados.addEmpleado(new Comercial("Ana","2",1020,25.0));
		empleados.addEmpleado(new Consultor("Marta","3",2100,150,4));
		empleados.addEmpleado(new Consultor("Carlos","4",2500,100,2));
		empleados.addEmpleado(new Consultor("Ana","5",2400,100,2));
		
		
		empleados.orderEmpleado();
		System.out.println(empleados);
		e = empleados.findByNSS("3");
		
		System.out.println(e);
	}

}
