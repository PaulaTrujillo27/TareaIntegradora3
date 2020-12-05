package ui;
import java.util.Scanner;
import model.*;

public class Main{

	private  Scanner sc;
	private FootballClub club;

	public Main(){
		sc = new Scanner(System.in);
		club = new FootballClub();	
	}

	public static void main(String[] args) {

		


		Main ppal= new Main();
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
	}
		

	public int showMenu() {
		addFootballClub();
		int option=0;

		System.out.println(
			"Selec one option to start\n"+
			"(1) to register employees\n"+
			"(2) to dismiss employee\n"+
			"(3) to calculate market price\n"+
			"(4) to \n" + 
			"(5) to \n" +  
			"(6) to \n" +  
			"(7) to \n" +  
			"(8) to \n" +
			"(0) Exit"
					);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

	public void executeOperation(int operation) {
		String message="";
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerEmployee();
			break;
		case 2:
			dismissEmployee();
			break;
		case 3:
			calculatepriceEmployee();
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;	
		case 8:
			
			break;
		default:
			System.out.println("Invalid option");
		}
	}




	public void addFootballClub(){
		

		String name, nit, foundationDate;
		System.out.println("write the name of the club");
		name = sc.nextLine();
		System.out.println("Enter the club's NIT");
		nit = sc.nextLine();
		System.out.println("Enter foundation date");
		foundationDate = sc.nextLine();
		
	}

	public void registerEmployee(){
		System.out.println("********************");
		System.out.println("Register information");
		System.out.println("********************");
		
		System.out.println("write the name");
		String name = sc.nextLine();
		System.out.println("Write the id");
		String id = sc.nextLine();
		System.out.println("Write the salary");
		double salary = sc.nextDouble();sc.nextLine();

		System.out.println("write (1) for  coachs, (2) for players");
		int	numplay = sc.nextInt();sc.nextLine();
		switch(numplay){

			case 1:
				System.out.println("write the years of experience");
				int yearsExperience = sc.nextInt();sc.nextLine();
				System.out.println("Write (1) to head coach or (2) to assitant coach");
				int	num = sc.nextInt();sc.nextLine();
				switch(num){

					case 1:
						System.out.println("teams in charge");
						int numbersTeams=sc.nextInt();sc.nextLine();
						System.out.println("championships won");
						int championships = sc.nextInt();sc.nextLine();

					break;
					case 2:
						System.out.println("he is a former football player, yes / no");
						String exPlayer = sc.nextLine();
						//if(exPlayer.equalsIgnoreCase("yes"))
						System.out.println("what is your expertise?(OFFENSIVE, DEFENSIVE, POSSESSION,LAB_PLAY)");
						String expertise = sc.nextLine().toUpperCase();

					break;
					default:
					System.out.println("Invalid option");
				}
			break;
			case 2:
				System.out.println("write "+ name + "'s number");
				int dorsal = sc.nextInt();sc.nextLine();
				System.out.println("write "+ name +"'s position, (GOALKEEPER, DEFENDER, MIDFIELDER, FORWARD)");
				String position = sc.nextLine().toUpperCase();
				System.out.println("write the number of goals that " + name + " scored");
				int goals = sc.nextInt();sc.nextLine();
				System.out.println("soccer player rating");
				double rating = sc.nextDouble();sc.nextLine();

			break;
			default:
			System.out.println("Invalid option");
		}
	}

	public void dismissEmployee(){

		System.out.println("write the name of the person you are going to fire ");
		String name = sc.nextLine();
		String message = club.dismiss(name);
		System.out.println(message);

	}





	
}
