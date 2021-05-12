package gameMarketting.entities;

import gameMarketting.abstracts.Entity;

public class Campaign implements Entity{
	
	int discountPercent;
	String info;
	
	public Campaign() {
		
	}

	public Campaign(int discountPercent, String info) {
		super();
		this.discountPercent = discountPercent;
		this.info = info;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	

}
