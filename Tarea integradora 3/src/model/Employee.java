package model;
public abstract class Employee implements Precio,Nivel{

//Attributes
private String name;
private String id;
private double salary;
private String status;
private double nivel;
private double precio;

public  Employee(String name, String id, double salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.status = "ACTIVE";
}
//get method
public String getName() {
	return name;
}
//set method
public void setName(String name) {
	this.name = name;
}

public void setStatus(String status) {
	this.status = status;
}



}
