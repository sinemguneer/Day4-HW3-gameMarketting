package gameMarketting.abstracts;

import gameMarketting.entities.Game;

public interface GameService {
	
	public void addGame(Game game);
	public void removeGame(Game game);
	public void multiAdd(Game[] games);
	
	
	

}
