package gameMarketting.entities;

import gameMarketting.abstracts.Entity;

public class Game  implements Entity{
	
	int gameId;
	String gameName;
	String info;
	double price;
	
	public Game() {
	}

	public Game(int gameId, String gameName, String info, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.info = info;
		this.price = price;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
