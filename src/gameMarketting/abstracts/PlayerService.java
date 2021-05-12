package gameMarketting.abstracts;

import gameMarketting.entities.Player;

public interface PlayerService {
	
	public void addPlayer(Player player);
	public void removePlayer(Player player);
	public void updateInfoPlayer(Player player);
	public void logIn(Player player);
}
