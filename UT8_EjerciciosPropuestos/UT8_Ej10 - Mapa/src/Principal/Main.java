package Principal;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main 
{
	public static void main(String[] args) 
	{
		HorarioAcademico horario = new HorarioAcademico();
		
		crearHorario(horario);

		horario.consultarModulo(LocalDateTime.of(2025, 3, 3, 20, 15));
		
		System.out.println("Horario Semanal");
		horario.visualizarHorarioSemanal();
	}
	
	public static void crearHorario(HorarioAcademico horario)
	{
		horario.darDeAltaHorario(DiasSemana.LUNES, 1, "BBDD");
		horario.darDeAltaHorario(DiasSemana.LUNES, 2, "BBDD");
		horario.darDeAltaHorario(DiasSemana.LUNES, 3, "ED");
		horario.darDeAltaHorario(DiasSemana.LUNES, 4, "ED");
		horario.darDeAltaHorario(DiasSemana.LUNES, 5, "LM");
		horario.darDeAltaHorario(DiasSemana.LUNES, 6, "LM");
		
		horario.darDeAltaHorario(DiasSemana.MARTES, 1, "BBDD");
		horario.darDeAltaHorario(DiasSemana.MARTES, 2, "BBDD");
		horario.darDeAltaHorario(DiasSemana.MARTES, 3, "ED");
		horario.darDeAltaHorario(DiasSemana.MARTES, 4, "ED");
		horario.darDeAltaHorario(DiasSemana.MARTES, 5, "LM");
		horario.darDeAltaHorario(DiasSemana.MARTES, 6, "LM");
		
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 1, "BBDD");
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 2, "BBDD");
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 3, "ED");
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 4, "ED");
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 5, "LM");
		horario.darDeAltaHorario(DiasSemana.MIÉRCOLES, 6, "LM");
		
		horario.darDeAltaHorario(DiasSemana.JUEVES, 1, "BBDD");
		horario.darDeAltaHorario(DiasSemana.JUEVES, 2, "BBDD");
		horario.darDeAltaHorario(DiasSemana.JUEVES, 3, "ED");
		horario.darDeAltaHorario(DiasSemana.JUEVES, 4, "ED");
		horario.darDeAltaHorario(DiasSemana.JUEVES, 5, "LM");
		horario.darDeAltaHorario(DiasSemana.JUEVES, 6, "LM");
		
		horario.darDeAltaHorario(DiasSemana.VIERNES, 1, "BBDD");
		horario.darDeAltaHorario(DiasSemana.VIERNES, 2, "BBDD");
		horario.darDeAltaHorario(DiasSemana.VIERNES, 3, "ED");
		horario.darDeAltaHorario(DiasSemana.VIERNES, 4, "ED");
		horario.darDeAltaHorario(DiasSemana.VIERNES, 5, "LM");
		horario.darDeAltaHorario(DiasSemana.VIERNES, 6, "LM");
	}
}