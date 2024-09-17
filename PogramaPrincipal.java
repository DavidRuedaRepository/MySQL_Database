package es.ifp.programacion.ejercicio.retouf6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;


/**
 * Programa que imprime en consola los datos de una tabla en una BBDD mySQL.
 */
public class PogramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//Atributos
		Connection conexion=null;
		String URL = "jdbc:mysql://localhost/BBDDRetoUF6";
		final String sql = "Select * from usuarios";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Usuario usr;
		HashMap<Integer,Usuario> mapaPersonas = new HashMap<Integer,Usuario>();




		try {

			//Realizo la conexión con la base de datos.
			conexion=DriverManager.getConnection(URL,"root","");
			//Preparo la consulta SQL la cual tengo almacenada en la variable sql.
			ps = conexion.prepareStatement(sql);
			//Ejecuta la consulta mediante el método executeQuery de la clase PreoareStatement
			rs = ps.executeQuery();

			/*
			 * 	Bucle while que mientras haya resultados recorre el objeto instanciado Usuario mediante los datos de la
			consulta sql y añade al Hashpap.
			 */
		
			while(rs.next()) {
				usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

				mapaPersonas.put(usr.getId(),usr);
			}
/*
 * Iteramos sobre las claves del hashmap "idUsuario" e imprimimos los datos del objeto Usuario.
 */
			for (Integer clave : mapaPersonas.keySet()) {
				
				
				System.out.println("===========DATOS DEL USUARIO=============");
				System.out.println("Id: " + clave + "\n"+ mapaPersonas.get(clave));

			}

		}
		//Controlamos las excepciones.
		catch (SQLException e) {

			e.getMessage();
		}
		//Después de todo cerramos los recursos ps, conexion y rs.
		finally {
			try {
				ps.close();

				conexion.close();
				rs.close();
			}
			//controlamos las excepciones del cierre de recursos
			catch (SQLException e) {

				e.getMessage();
			}

		}





	}

}
