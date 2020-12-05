package model;
public class Player extends Employee{

	//Attributes
	private int dorsal;
	private int goals;
	private double rating;



	//Relationships
	private Position position;

	public Player(String name, String id, double salary, int dorsal, int goals, double rating, String position){
	super(name,id,salary);
	this.dorsal=dorsal;
	this.goals=goals;
	this.position=Position.valueOf(position);
	this.precio=calcularMercado();
	this.calcularNivel();


	}

	public double calcularMercado(){
		switch(position){
		  	case GOALKEEPER:
		  		double precio=(salary*12)+(rating*150);
		  	break;
		  	case DEFENDER:
		  		double precio=(salary*13)+(rating*125)+(goals*100);
		  	break;
		 	case MIDFIELDER:
		  		double precio=(salary*14)+(rating*135)+(goals*125);
		  	break;
		  	case FORWARD:
		  		double precio=(salary*15)+(rating*145)+(goals*150);
		  	break;
		}
		return precio;
	}

	public double calcularNivel(){
		switch(position){
	  		case GOALKEEPER:
	  			double nivel = (rating * 0.9);
	 		break;
	  		case DEFENDER:
	  			double nivel = (rating * 0.9)+ (goals/100);
	  		break;
	  		case MIDFIELDER:
	  			double nivel = (rating * 0.9)+ (goals/90);
	  		break;
	  		case FORWARD:
	  			double nivel = (rating * 0.9)+ (goals/80);
	  		break;
		}
		return nivel;

	}

}