//Cyberdemon.java
//Kristi Hicks, hicksk2
public class Cyberdemon extends Creature{
	String name;
	int strength;
	int hit;
	public Cyberdemon(String newName, int newStrength, int newHit){
		name = newName;
		strength = newStrength;
		hit = newHit;
	}
	public String getSpecies(){
		return "Cyberdemon";
	}
	public int getDamage(){
		int d = super.getDamage("Cyberdemon", strength);
		int chance = (int) (Math.random() * 100 + 1);
		if (chance <= 10){
			System.out.println("Your magical attack activates!");
			d = super.getDamage("Cyberdemon", strength ) * 2;
		}
		return d;
	}
}
