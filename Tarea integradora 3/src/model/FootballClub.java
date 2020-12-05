package model;
import java.util.ArrayList;
public class FootballClub{
	
	//Attribute
	private String name;
	private String nit;
	private String foundationDate;
	

	//obj//arraiz
	private ArrayList <Employee> employee;

	//Constructor



	public FootballClub(String name, String nit, String foundationDate){
		this.name=name;
		this.nit=nit;
		this.foundationDate=foundationDate;
		//ArrayList<String> employee = new ArrayList<String>();
		this.employee = new ArrayList <Employee>(); 
	}

	//gets method
	public String getName() {
	return name;
	}
	public String getNit() {
	return nit;
	}
	public String getFoundationDate() {
	return foundationDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}

	

	public Employee findEmployee(String name){
		Employee objSearch=null;
		boolean findPl=false;
		for (int i=0;i<54 && !findPl;i++){
			if (employee.get(i).getName().equalsIgnoreCase(name)){
				objSearch=employee.get(i);
				findPl=true;	
			}
		}
		return objSearch;

	}
	//________________________principal coach_____________________________________________________________
	public String addEmployee(int yearsExperience, String name, String id, double salary, int numbersTeams, int championships){
		String message="";
		boolean addPl=false;
		
		Employee objSearch=findEmployee(name);
		if(objSearch!=null)
			message="Error. the employee already exist";
		else{
			for (int i=0;i<54 && !addPl;i++){
				if (employee.get(i)==null){
					employee.get(i)=new HeadCoach(name);
					addPl=true;
					message="The employee has been registered";
				}
			}
			if (addPl==false)
				message="All employee are already created";
		}
		return message;
	}
	//________________________Asistent coach_____________________________________________________________
	public String addEmployee(int yearsExperience, String name, String id, double salary, String exPlayer, String expertise){
		String message="";
		boolean addPl=false;
		
		Employee objSearch=findEmployee(name);
		if(objSearch!=null)
			message="Error. the employee already exist";
		else{
			for (int i=0;i<54 && !addPl;i++){
				if (employee.get(i)==null){
					employee.get(i) = new AssistantCoach(name);
					addPl=true;
					message="The employee has been registered";
				}
			}
			if (addPl==false)
				message="All employee are already created";
		}
		return message;
	}
	//________________________soccer player_____________________________________________________________
	public String addEmployee(String name, String id, double salary, int dorsal, int goals, double rating, String position){
		String message="";
		boolean addPl=false;
		
		Employee objSearch=findEmployee(name);
		if(objSearch!=null)
			message="Error. the employee already exist";
		else{
			for (int i=0;i<54 && !addPl;i++){
				if (employee.get(i)==null){
					employee.get(i) = new Player(name);
					addPl=true;
					message="The employee has been registered";
				}
			}
			if (addPl==false)
				message="All employee are already created";
		}
		return message;
	}

	//agragar un nuevo empleado en el puesto que despedimos
	public String dismiss(String name){
		String message="";
		boolean addPl=false;
		
		Employee objSearch=findEmployee(name);
		if(objSearch ==null){
			message = "dont exist";
		}else{
			objSearch.setStatus("INACTIVE");
		}

	}

	
}