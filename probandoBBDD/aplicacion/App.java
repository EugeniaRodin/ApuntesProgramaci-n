package aplicacion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.ActorDAOImplementacion;
import modelo.Actor;

public class App {

	public static void main(String[] args) {
		ActorDAOImplementacion actorDAO;
		List<Actor> lista=new ArrayList<>();
		actorDAO= new ActorDAOImplementacion();
		Actor actor1;
		
		try {
			actorDAO.saveActor(new Actor(502,"Pepe","Isbert","2025-03-17"));
			lista=actorDAO.getAllActors();
			for(Actor actor:lista) {
				System.out.println(actor);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			actor1=actorDAO.getActorById(7);
			if(actor1==null) {
				System.out.println("Sin resultado.");
			} else {
				System.out.println(actor1);
			}
		}catch(SQLException a) {
			a.printStackTrace();
		}
	}

}
