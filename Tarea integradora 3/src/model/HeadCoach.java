package model;
public class HeadCoach extends Coach{
//Attributes
	private int numbersTeams;
	private int championships;

	public HeadCoach (int yearsExperience, String name, String id, double salary, int numbersTeams, int championships){
		super(name, id, salary, yearsExperience);
		this.numbersTeams=numbersTeams;
		this.championships=championships;
		this.precio=calcularMercado();
		this.nivel=calcularNivel();
	}


public double calcularMercado(){
	double precio=(salary*10)+(yearsExperience*100)+(championships*50);
	return precio;
}

public double calcularNivel(){
	double nivel=5+(championships/10);
	return nivel;
}

}

