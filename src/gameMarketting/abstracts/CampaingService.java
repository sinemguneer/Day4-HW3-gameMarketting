package gameMarketting.abstracts;

import gameMarketting.entities.Campaign;
import gameMarketting.entities.Game;
import gameMarketting.entities.Player;
import gameMarketting.entities.StudentPlayer;

public interface CampaingService {
	
	public void deleteCampaign(Campaign campaign);
	public void studentCampaign(Game game, Player studentPlayer);
	void addCampaign(Campaign campaign, Game game);
	
	
	            
}
