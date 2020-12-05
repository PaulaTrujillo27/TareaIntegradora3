package model;
public class ProfessionalTeam {

//Constant

	private final int MAX_ASSISTANTCOACH=3;
	private final int MAX_PLAYERS=25;

//Attributes

	private String name;

//Relationship
	private Players [] players;
	private AssistentCoach [] assistents;
	private HeadCoach coach;

	public ProfessionalTeam (String name, HeadCoach coach){
	this.name=name;
	player = new Player [MAX_PLAYERS];
	assistents= new AssistentCoach [MAX_ASSISTANTCOACH];
	this.coach=coach;
	}

}