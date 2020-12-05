package model;
public class AssistantCoach extends Coach{
//Attributes
	private boolean exPlayer;

	//Relationship
	private Expertise expertise;

	public AssistantCoach (int yearsExperience, String name, String id, double salary, String exPlayer, String expertise){
		super(name, id, salary, yearsExperience);
		this.exPlayer=exPlayer;
		this.expertise=Expertise.valueOf(expertise);
	}
}

		