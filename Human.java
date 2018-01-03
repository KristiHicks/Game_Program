//Human.java
//Kristi Hicks, hicksk2
public class Human extends Creature{
	String name;
	int strength;
	int hit;
	public Human(String newName, int newStrength, int newHit){
		name = newName;
		strength = newStrength;
		hit = newHit;
	}
	public String getSpecies(){
		return "Human";
	}
	public int getDamage(){
		int d = super.getDamage("Human", strength);
		int chance = (int) (Math.random() * 100 + 1);
		if (chance <= 10){
			System.out.println("Your magical attack activates!");
			d = super.getDamage("Human", strength) * 2;
		}
		return d;
	}
}
