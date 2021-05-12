package gameMarketting.concrete;

import gameMarketting.abstracts.CheckRealPlayerService;
import gameMarketting.abstracts.PlayerService;
import gameMarketting.entities.Player;

public class PlayerManager implements PlayerService {
	
private CheckRealPlayerService checkRealPlayerService;
	
	
	public PlayerManager(CheckRealPlayerService checkRealPlayerService) {
		super();
		this.checkRealPlayerService = checkRealPlayerService;
	}
	

	
	@Override
	public void addPlayer(Player player) {
		
		if(checkRealPlayerService.checkIfRealPlayer(player)) {
		System.out.println("The player has registered to the system : " + player.getFirstName());
		}
		else {
			System.out.println("Not a valid player.");
		}
		
	}

	@Override
	public void removePlayer(Player player) {
		System.out.println("The player has been deleted from the system : " + player.getId());
		
	}

	@Override
	public void updateInfoPlayer(Player player) {
		System.out.println("The player information has been updated : " + player.getFirstName());
		
	}
	
	@Override
	public void logIn(Player player) {
		System.out.println("The player logged in." + player.getFirstName());
		
	}


}
