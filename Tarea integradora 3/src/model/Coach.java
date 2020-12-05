package model;
public class Coach extends Employee{

//Attributes
private int yearsExperience;

public Coach (String name, String id, double salary, int yearsExperience){
super(name,id,salary);
this.yearsExperience=yearsExperience;
}

}