package gameMarketting.concrete;

import gameMarketting.abstracts.CheckRealPlayerService;
import gameMarketting.entities.Player;

public class CheckRealPlayerManager implements CheckRealPlayerService {

	@Override
	public boolean checkIfRealPlayer(Player player) {
		
		return false;
	}

}
