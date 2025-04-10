package Principal;

public class Empleado 
{
	private String nombreCompleto;
	private int permanencia;
	private double salario;
	
	public Empleado () {
		this.nombreCompleto="";
		this.permanencia=0;
		this.salario=0.0;
	}
	
	public Empleado(String nombre, int p,double s){
		this.nombreCompleto=nombre;
		this.permanencia= p;
		this.salario=s;
	}
	
	public String getClasificacion() {
		String clasificacion;
		if (permanencia<=3)
			clasificacion = "Principiante";
		else
			if (permanencia<18)
				clasificacion = "Intermedio";
			else
				clasificacion = "Senior";
		return clasificacion;
	}
	
	public void incrementarSalario(double porcentaje) {
		double aumento;
		aumento = this.salario * porcentaje / 100;
	}
	
	public String toString() {
		String resultado;
		resultado = this.nombreCompleto+"\n";
		resultado += "permanencia en años" +this.permanencia+ "\n";
		resultado += "Clasificacion:" +this.getClasificacion()+"\n";
		resultado += "Salario "+this.salario;
		return resultado;
	}
	
	
}
