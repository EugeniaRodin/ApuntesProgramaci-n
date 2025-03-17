package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.Actor;

public interface ActorDAO {
	List<Actor> getAllActors() throws SQLException;
	Actor getActorById(int id) throws SQLException;
	void saveActor(Actor actor) throws SQLException;
	void deleteActor(Actor actor);
	
}
