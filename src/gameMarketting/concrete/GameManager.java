package gameMarketting.concrete;

import gameMarketting.abstracts.GameService;
import gameMarketting.entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println("Game loaded : " + game.getGameName());
		
	}

	@Override
	public void removeGame(Game game) {
		System.out.println("Game deleted : " + game.getGameName());
		
	}

	@Override
	public void multiAdd(Game[] games) {
		for (Game game : games) {
			System.out.println("Game added and listed on market : " +game.getGameName());
			
		}
		
	}
	
	

}
