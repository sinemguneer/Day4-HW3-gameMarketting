package gameMarketting.concrete;

import gameMarketting.abstracts.CampaingService;
import gameMarketting.entities.Campaign;
import gameMarketting.entities.Game;
import gameMarketting.entities.Player;
import gameMarketting.entities.StudentPlayer;

public class CampaignManager implements CampaingService {

	
	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+ " : " + "Discounted price : " + (game.getPrice() - game.getPrice()*campaign.getDiscountPercent()/100));
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign deleted.");
		
	}

	@Override
	public void studentCampaign(Game game, Player studentPlayer) {
		System.out.println("Student Campaign : " + (game.getPrice() - game.getPrice()*0.2));
		
	}

	

	
	

}
