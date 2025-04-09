package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NeptunoBD
{
	private String rutaBD;
	private String url;
	
	public NeptunoBD()
	{
		rutaBD = "./database/neptuno.mdb";
		url = "jdbc:ucanaccess://"+rutaBD; // Java Data Base Connection
		try (Connection conexion = DriverManager.getConnection(url))
		{
			System.out.println("Conexión exitosa!");
			String comandoSQL = "SELECT * FROM Clientes";
			try(PreparedStatement ps = conexion.prepareStatement(comandoSQL);
					ResultSet rs = ps.executeQuery())
			{
				while(rs.next())
				{
					System.out.println(rs.getString("IdCliente") +" "+rs.getString("NombreContacto"));
				}
			}
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	
}
