package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Actor;

public class ActorDAOImplementacion implements ActorDAO {
	
	private static Connection conexion;
	
	public ActorDAOImplementacion() {
		conexion=EjemploSingleton.getConnection();
	}
	
	@Override
	public List<Actor> getAllActors() throws SQLException { 
		Statement sentencia;
		ResultSet rs;
		String sql="SELECT * FROM ACTOR LIMIT 1000";
		Actor actor;
		List<Actor> listaResultado=new ArrayList<Actor>();
		if(conexion!=null) {
			sentencia=conexion.createStatement();
			sentencia.executeQuery(sql);
			rs=sentencia.executeQuery(sql);
			while(rs.next()) {
				actor=new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("last_update"));
				listaResultado.add(actor);
				
			}
			rs.close();
			sentencia.close();
		}
		
		return listaResultado;
	}

	@Override
	public Actor getActorById(int id) throws SQLException {
		Actor actor=null;
		String sql="SELECT * FROM ACTOR WHERE ACTOR_ID="+id;
		Statement sentencia;
		ResultSet rs=null;
		
		if(conexion!=null) {
			sentencia=conexion.createStatement();		
			rs=sentencia.executeQuery(sql);
			if(rs.next()) {
				actor=new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("last_update"));
			}

			 rs.close();
			 sentencia.close();
			 
		}
		
		return actor;
	}
	
	//MAS SEGURO!!! ->

	//public Actor getActorById(int id) throws SQLException {
		//Actor actor=null;
	//String sql="SELECT * FROM ACTOR WHERE ACTOR_ID="+id;
	//PreparedStatement sentencia;
	//ResultSet rs=null;
		
	//if(conexion!=null) {
	//sentencia=conexion.prepareStatement(sql);		
	//setencia.setInt(1,id);
	//rs=sentencia.executeQuery();
	//if(rs.next()) {
	//actor=new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("last_update"));
	//}
			/*
			 * rs.close;
			 * sentencia.close;
			 * */
	//}
		
	//	return actor;
	//}
	
	

	@Override
	public void saveActor(Actor actor) throws SQLException {
		Statement sentencia;
		String sql;
		if(conexion!=null) {
			sentencia=conexion.createStatement();
			sql="INSERT INTO ACTOR VALUES("+actor.getActor_id()+",\""+actor.getFirst_name()+"\",\""+actor.getLast_name()+"\",\""+actor.getFecha()+"\")";
			System.out.println(sql);
			sentencia.executeUpdate(sql);
			sentencia.close();
		}
	}

	@Override
	public void deleteActor(Actor actor) {
		// TODO Auto-generated method stub
		
	}
	
}
