//GameProgram.java
//Name: Kristi Hicks, hicksk2
import java.util.Scanner;
import java.util.ArrayList;

public class GameProgram {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Creature creature = new Creature();
		ArrayList <Creature> players = new ArrayList<>();
		String choice = " ";
		String species = " ";
		System.out.println("Welcome to the Fantasy Game");
		System.out.println("1. Add the game players");
		System.out.println("2. Players play in turn until only one is left");
		System.out.println("Good Luck!");
		System.out.println("First, let's add some players: ");
		while(!(choice == "quit")){
		System.out.println("Enter player's name ('quit' when no more players): ");
		choice = input.next();
		System.out.println(choice + ", which species are you?");
		System.out.println("b/B: Balrog");
		System.out.println("c/C: Cyberdemon");
		System.out.println("e/E: Elf");
		System.out.println("h/H: Human");
		System.out.println("Select " + species + "'s species:");
		}
		
		
		
		creature.getName();
		
		players.add(creature);
		
		
		
		System.out.println("Current Players:");
		System.out.println("NAME | SPECIES | STRENGTH | HIT POINTS");
		for(Creature c : players){
			System.out.println(c.getName() + " | " + c.getSpecies() + " | " + c.SetStrength() + " | " + c.setHitPoint());
		}
		creature.toString();
		String options;
		System.out.println("The Players are ready!");
		System.out.println("");
		System.out.println("Let the Battle begin!");
		System.out.println("");
		
		while(!(options == "quit")){
		System.out.println(choice + ", select one of the following options: ");
		System.out.println("a/A: Attack an opponent");
		System.out.println("p/P: Pass(go to the next player)");
		System.out.println("q/Q: Quit the game");
		System.out.println(choice + ", make your selection: ");
		options = input.next();
		System.out.println("Which player are you attacking? ");
		String attacking;
		attacking = input.next();
		}		
	}
}

