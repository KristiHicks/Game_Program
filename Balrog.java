//Balrog.java
//Kristi Hicks, hicksk2
public class Balrog extends Creature{
	String name;
	int strength;
	int hit;
	public Balrog(String newName, int newStrength, int newHit){
		name = newName;
		strength = newStrength;
		hit = newHit;
	}
	public String getSpecies(){
		return "Balrog";
	}
	public int getDamage(){
		int d = super.getDamage("Balrog", strength);
		int chance = (int) (Math.random() * 100 + 1);
		if (chance <= 10){
			System.out.println("Your magical attack activates!");
			d = super.getDamage("Balrog", strength) * 2;
		}
		return d;
	}

}
