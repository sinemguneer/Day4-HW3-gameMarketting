package gameMarketting;

import java.time.LocalDate;

import gameMarketting.adapter.MernisServiceAdapter;
import gameMarketting.concrete.CampaignManager;
import gameMarketting.concrete.GameManager;
import gameMarketting.concrete.PlayerManager;
import gameMarketting.entities.Campaign;
import gameMarketting.entities.Game;
import gameMarketting.entities.Player;
import gameMarketting.entities.StudentPlayer;

public class Main {

	public static void main(String[] args) {
		
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		Player player = new Player(1,"Sinem","Güner",LocalDate.of(1995,10,12),"57262211040");
		playerManager.addPlayer(player);
		playerManager.removePlayer(player);
		Player student = new StudentPlayer();
		student.setId(1);
		student.setFirstName("Simge");
		student.setLastName("Güner");
		student.setDateOfBirth(LocalDate.of(2000, 7, 5));
		
		
		
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(11,"Tetris","Standart",90);
		Game game2 = new Game(22,"Snake","Advence",60);
		Game game3 = new Game(33,"Cs Go","Standart",200);
		Game [] games = {game1, game2, game3};
		gameManager.multiAdd(games);
		
		
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(10,"Special");
		campaignManager.addCampaign(campaign, game1);
		campaignManager.studentCampaign(game3, student);
	
		
		
				
		
		
		
		
		
		
		
	
		

		
		
		

	}

}
