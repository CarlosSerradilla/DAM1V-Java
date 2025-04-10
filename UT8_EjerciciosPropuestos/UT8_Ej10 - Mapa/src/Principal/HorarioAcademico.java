package Principal;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

enum DiasSemana {LUNES,MARTES,MIÉRCOLES,JUEVES,VIERNES};

public class HorarioAcademico 
{
	private Map<DiasSemana, String[]> horario;

    public HorarioAcademico() 
    {
        horario = new HashMap<>();
        for (DiasSemana dia : DiasSemana.values())
                horario.put(dia, new String[6]);
    }

    public void darDeAltaHorario(DiasSemana dia, int hora, String modulo) 
    {
        if (hora >= 1 && hora <= 6) 
        {
            horario.get(dia)[hora - 1] = modulo;
        } 
        else 
        {
            System.out.println("Hora no válida. Debe estar entre 1 y 6.");
        }
    }

    public void visualizarHorarioSemanal() 
    {
        for (DiasSemana dia : DiasSemana.values()) 
        {
        	if (horario.getOrDefault(dia, null)!=null)
        	{
        		System.out.println(dia + ":");
        		for (int i = 0; i < 6; i++) 
        		{
        			System.out.println("Hora " + (i + 1) + ": " + horario.get(dia)[i]);
        		}	
        	}
        }
    }

    public void consultarModulo(LocalDateTime fechaHora) 
    {
        DiasSemana dia =DiasSemana.values()[fechaHora.getDayOfWeek().getValue()-1]; 
        int hora = fechaHora.getHour();
        int indiceHora;
        if (hora >= 15 && hora < 21 && horario.containsKey(dia)) 
        {
            indiceHora = hora - 15;
            String modulo = horario.get(dia)[indiceHora];
            System.out.println("El módulo correspondiente es: " + modulo);
        } 
        else 
        {
            System.out.println("No hay clases en esta fecha y hora.");
        }
    }
}