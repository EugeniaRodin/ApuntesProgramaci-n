package probandoBBDD;

import java.sql.ResultSet;

public class Test {
	conexion = EjemploSingleton.getConnection();
	IF(conexion!=null){
		System.out.println("COnectado! :)");
		stmt = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stmt.executeUpdate(sql);
		String query = "select actor_id, first_name from actor";
			ResultSet rs = stmt.executeQuery(query);
			rs.absolute(50);
			int id = rs.getInt(1);
			String nombre = rs.getString(2);
			System.out.println("Nombre " + nombre + ", id" + id);
			/*while (rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				System.out.println("Nombre " + nombre + ", id" + id);
			}*/
			
			id = rs.getInt(1);
			nombre = rs.getString(2);
			System.out.println("Nombre " + nombre + ", id" + id);
	}
	

	/*
	 * 
	 * 
	 * [...]luego van los catch y el finally.
	 * 
	 * 
	 * */
}
