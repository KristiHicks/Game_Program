//Demon.java
//Kristi Hicks, hicksk2
public class Demon extends Creature{
	String name;
	int strength;
	int hit;
	public Demon(String newName, int newStrength, int newHit){
		name = newName;
		strength = newStrength;
		hit = newHit;
	}
	
	public String getSpecies(){
		return "Demon";
	}
	
	public int getDamage(){
		int d = super.getDamage("Demon", strength);
		int chance = (int) (Math.random() * 100 + 1);
		if (chance <= 10){
			System.out.println("Your magical attack activates!");
			d = super.getDamage("Demon", strength) * 2;
		}
		return d;
	}
}
