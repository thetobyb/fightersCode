

public class Fighters {
	String name;
	int lightAttack;
	int heavyAttack;
	int bite;
	int block;
	int attack;
	int defence;
	int health;
	boolean alive;
	
	public Fighters(String Name, int LightAttack, int HeavyAttack, int Block, int Attack, int Defence, int Health, boolean Alive) {
		
		name = Name;
		lightAttack = LightAttack;
		heavyAttack = HeavyAttack;
		block = Block;
		attack = Attack;
		defence = Defence;
		health = Health;
		alive = Alive;
	}
	
	void lightAttack(int BigGabeLight, int MikeLight, int MikeHealth, int MikeBlock) {
		
		if(BigGabeLight > MikeLight && BigGabeLight > MikeBlock ) {
			System.out.println("BigGabe used Light Attack! His attack was successful.");
			MikeHealth -= 10;
			
			System.out.println("BigGabe wins!");
		} else {
			
			System.out.println("BigGabe attacked Mike with a Light Attack!");
			System.out.println("Mike blocked the Light Attack! His HP is still " + MikeHealth);
		}	
	}
	
void heavyAttack(int BigGabeHeavy, int MikeHeavy, int MikeHealth, int MikeBlock) {
		
		if(BigGabeHeavy > MikeHeavy && BigGabeHeavy > MikeBlock ) {
			System.out.println("BigGabe used Heavy Attack! His attack was successful.");
			MikeHealth -= 10;
			System.out.println("Mike has lost 10 Health Points! His HP is now " + MikeHealth);
		} else {
			
			System.out.println("BigGabe attacked Mike with a Heavy Attack");
			System.out.println("Mike blocked the Heavy Attack! He hasn't lost any HP.");
		}	
	}
	
	void trainAttack()  {
		attack++;
		lightAttack++;
		heavyAttack++;
		
	System.out.println("The Lion has trained it's attack! The new values are: LightAttack: " + lightAttack + " and HeavyAttack: " + heavyAttack);
		
	if(lightAttack >= 10) {
		lightAttack = 10;
		System.out.println("You've trained bite too much! Max Light Attack achieved.");
	}
	if(heavyAttack >= 10) {	
		heavyAttack = 10;
		System.out.println("You've trained attack too much! Max Heavy Attack achieved.");
	}
	}
	
	void trainDefence()  {
		
		block++;
		defence++;
	
		if(block >= 10) {
			block = 10;
			System.out.println("You've trained block too much! Max block achieved.");
		}
		if(defence >= 10) {	
			defence = 10;
			System.out.println("You've trained defence too much! Max defence achieved.");
		}
		}
	void isAlive() {
		if(health <= 0) {
			alive = false;
			System.out.println("Oops, you've killed the lad! His health is 0.");
			
		}
		
	}
	}
