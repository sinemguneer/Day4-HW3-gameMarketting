package gameMarketting.entities;

public class StudentPlayer extends Player{
	
	String schoolName;
	String schoolNumber;
	
	public StudentPlayer() {
		
	}
	public StudentPlayer(String schoolName, String schoolNumber) {
		super();
		this.schoolName = schoolName;
		this.schoolNumber = schoolNumber;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	
	

}
