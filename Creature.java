	import java.util.Random;
import java.util.Scanner;
public class Creature extends GameProgram{
	/**
	*
	* @author Kristi Hicks
	*/
	//variables
	    int Playernu;
	    String[] nameA;
	    String[] SpecA;
	    int[] StrA;
	    int[] HPA;
	    int V = 0;
	    int turn = 0;
	    int sc = 0;
	 
	    int counter = 0;
	    
	    public Creature (){
	    	
	// order the methods, as to run in RPG
	   // public Creature() {
	        playerNum();
	       Gamepiece();
	       scorebored();
	        Turn();
	    }
	   
	// Method that runs throught all the players as the choose actions, until one is left and crowned the victor
	    public void Turn() {
	        while (counter < (Playernu - 1)) {
	            turn = turn * 0;
	            while (turn < Playernu) {
	                int T;
	                if (HPA[turn] <= 0) {
	                    turn = turn + 1;
	                }
	                Scanner user_input = new Scanner(System.in);
	                System.out.println(nameA[turn] + " you're up, what do you want to do?");
	               System.out.println("1.Attack, 2.Pass, 3.Quit");
	                T = user_input.nextInt();
	                if (T == 1) {
	                    int total = 0;
	                    total = getDamage(SpecA[turn], StrA[turn]);
	                    System.out.println("Which player will you attack?");
	                    int st = 0;
	                    while (st < Playernu) {
	                        System.out.println((st + 1) + "." + nameA[st]);
	                        st = st + 1;
	                    }
	                    int ch = 0;
	                    ch = user_input.nextInt();
	                    System.out.println(nameA[turn] + " does " + total + " points of damage to " + nameA[(ch - 1)]);
	                    HPA[(ch - 1)] = HPA[(ch - 1)] - total;
	                    if (HPA[ch - 1] <= 0) {
	                        counter = counter + 1;
	                    }
	                    turn = turn + 1;
	                    if (counter > (Playernu - 1)) {
	                        System.out.print("Congrats " + nameA[(turn+1)] + " you're the last one alive");
	                        System.exit(0);
	                    }
	                }
	                if (T == 2) {
	                    System.out.println(nameA[turn] + " waits");
	                    turn = turn + 1;
	                }
	                if (T == 3) {
	                    HPA[turn] = HPA[turn] * 0;
	                    counter = counter + 1;
	                    System.out.println(nameA[turn] + " falls on their sword");
	                    turn = turn + 1;
	                    if (counter > (Playernu - 1)) {
	                        System.out.print("Congrats " + nameA[(turn+1)] + " you're the last one alive");
	                        System.exit(0);
	                    }
	                }
	            }
	            scorebored();
	            if (counter > (Playernu - 1)) {
	                System.out.print("Congrats " + nameA[(turn+1)] + " you're the last one alive");
	                System.exit(0);
	            }
	        }
	                System.out.println("Congrats " + nameA[(turn+1)] + " you're the last one alive");
	                System.exit(0);
	    }
	   
	// sets up each creaters
	    public void Gamepiece() {
	        while (V < Playernu) {
	            System.out.println("Player " + (V + 1) + " let's set up your stats");
	            getName();
	            getSpecies();
	            SetStrength();
	            setHitPoint();
	            V = V + 1;
	        }
	    }
	   
	// scorebored for the game
	    public void scorebored() {
	        sc = sc * 0;
	        while (sc < Playernu) {
	            System.out.println(nameA[sc] + " | " + SpecA[sc] + " | " + StrA[sc] + " | " + HPA[sc]);
	            sc = sc + 1;
	        }
	    }
	   
	// rules, playernumber, and array set up
	    public void playerNum() {
	        Scanner user_input = new Scanner(System.in);
	        System.out.println("                              Welcom to the Arena!!!");
	        System.out.println("                                Here are the Rules");
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.println("1.Each player will pick his creatures name and species");
	        System.out.println("2.Then you will randomly get Hitpoints(Highest attackpower) and Strength(Health)");
	        System.out.println("3.From there, in order, you will be able to attack, pass, or quit");
	        System.out.println("4.The Arena has secrets, telling you everything is no fun");
	        System.out.println("5.Last one alive wins, May the odds be in you favor");
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n");
	        System.out.println("But first, how many players?");
	        Playernu = user_input.nextInt();
	        nameA = new String[Playernu];
	        SpecA = new String[Playernu];
	        StrA = new int[Playernu];
	        HPA = new int[Playernu];
	    }
	   
	//gets players species
	    public String getSpecies() {
	        Scanner user_input = new Scanner(System.in);
	        String Species = null;
	        try {
	            System.out.println("Species name?" + "\n" + "Human, Cyberdemon, Belrog, Elven");
	            Species = user_input.next();           
	            SpecA[V] = Species;
	        } catch (Exception e) {
	            System.out.print("Invalid Species");
	        }
			return Species;
	    }
	   
	// gets name of players character
	    public void getName() {
	        Scanner user_input = new Scanner(System.in);
	        String Name = null;
	        try {
	            System.out.println("Name of Creature?");
	            Name = user_input.next();
	            nameA[V] = Name;
	        } catch (Exception e) {
	            System.out.print("Invalid name");
	        }
	        System.out.print(Name);
	    }
	   
	// random strength for the character
	    public void SetStrength() {
	        int Strength = 0;
	        Random rand = new Random();
	 
	        Strength = rand.nextInt(15 - 10 + 1) + 10;
	        StrA[V] = Strength;
	        System.out.println("Strength is " + Strength);
	    }
	   
	// random HP for the character
	    public void setHitPoint() {
	 
	        int HitPoints = 0;
	        Random rand = new Random();
	 
	        HitPoints = rand.nextInt(90 - 60 + 1) + 60;
	        HPA[V] = HitPoints;
	        System.out.println("Hit Points are " + HitPoints);
	 
	    }
	   
	// Method that runs Total attack damage for the player including species bonus
	    public int getDamage(String Species, int STA) {
	        int Totalattack = 0;
	        int Damage = (int) (Math.random() * (STA - 0)) + 0;
	        int Bonus = 0;
	        if (Species == ("Belrog")) {
	            System.out.println(" A Balrog is so quick they hit twice");
	            int BalBonus = (int) (Math.random() * (STA - 0)) + 0;
	            Bonus=BalBonus*1;
	            int BalrogsDam = (int) (Math.random() * (100 - 0)) + 0;
	            if (BalrogsDam > 95) {
	                Bonus = Bonus + 50;
	                Bonus = BalBonus + Bonus;
	            }
	        }
	        if (Species == ("Cyberdemon")) {
	            int BalrogsDam = (int) (Math.random() * (100 - 0)) + 0;
	            if (BalrogsDam > 95) {
	                Bonus = Bonus + 50;
	            }
	        }
	        if (Species == ("Elven")) {
	            int ElvenDam = (int) (Math.random() * (100 - 0)) + 0;
	            if (ElvenDam > 91) {
	                Bonus = Damage * 2;
	            }
	        }
	        Totalattack = Bonus + Damage;
	        return Totalattack;
	    }
	}
//}
