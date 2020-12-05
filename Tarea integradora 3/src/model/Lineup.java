package model;
public class Lineup{
//Attributes
	private String date;
	
	//matriz 10x7
	private String formation;
	//Relationship

	private Tactic tactic;

	public Lineup(String date, String formation, String tactic){
		this.date = date;
		this.formation = formation;
		this.tactic = Tactic.valueOf(tactic);

	}
	
	
}