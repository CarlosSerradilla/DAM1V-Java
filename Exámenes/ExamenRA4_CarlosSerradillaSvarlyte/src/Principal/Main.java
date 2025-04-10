package Principal;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args)
	{
		Presiones presiones = new Presiones(10);	// No confundir Presiones con Presion
		LocalDateTime instante1 = LocalDateTime.of(2025, 2, 3, 13, 10);
		LocalDateTime instante2 = LocalDateTime.of(2025, 7, 6 ,15 ,30);
		
		CentroDeControl rascafria = new CentroDeControl("Ayto","Rascafría",40.9034,-3.8796,1156.00);
		CentroDeControl alamedaDelValle = new CentroDeControl("C.M","Alameda del Valle",40.9176,-3.8437,1109.00);

		RestoDelMundo penalara = new RestoDelMundo("Peñalara", 40,8487, -3.9559, 2360.00);
		RestoDelMundo santaMariaDelPaular = new RestoDelMundo("Santa Mª del Paular", 40,8897, -3.8876, 1154.00);
		
		penalara.setCentroReferencia(rascafria);
		santaMariaDelPaular.setCentroReferencia(rascafria);
			// Pendiente por hacer: Crear el método setCentroReferencia
		
		presiones.add(new Presion (alamedaDelValle,instante1,0.9997532,Unidades.atm));
		presiones.add(new Presion (rascafria,instante1,1.0212681,Unidades.atm));
		presiones.add(new Presion (alamedaDelValle,instante2,1034.8,Unidades.mbar));
		presiones.add(new Presion (rascafria,instante2,1016.2,Unidades.mbar));
		
		presiones.estimarPresion(penalara,instante1.plusMinutes(90));
		presiones.estimarPresion (penalara,instante1.plusMinutes(200));
		
		presiones.remove(alamedaDelValle);
		System.out.println("Presiones");
		System.out.println("=========");
		System.out.println(presiones);
	}

}
