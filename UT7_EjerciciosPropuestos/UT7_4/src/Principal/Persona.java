package Principal;

public class Persona
{
	private String name = "";
	private int telf;
	private int edad;
	
	public Persona(String name, int telf, int edad) {
		super();
		this.name = name;
		this.telf = telf;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
		this.telf = telf;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", telf=" + telf + ", edad=" + edad + "]";
	}
	
	
}
