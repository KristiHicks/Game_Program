//Elf.java
//Kristi Hicks, hicksk2
public class Elf extends Creature{
	String name;
	int strength;
	int hit;
	
	public Elf(String newName, int newStrength, int newHit){
		name = newName;
		strength = newStrength;
		hit = newHit;
	}
	public String getSpecies(){
		return "Elf";
	}
	public int getDamage(){
		int d = super.getDamage("Elf", strength);
		int chance = (int) (Math.random() * 100 + 1);
		if (chance <= 10){
			System.out.println("Your magical attack activates!");
			d = super.getDamage("Elf", strength) * 2;
		}
		return d;
	}

}
