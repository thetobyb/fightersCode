



public class Boxers {
//	String name;
//	int lightAttack;
//	int heavyAttack;
//	int block;
//	int attack;
//	int defence;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighters BigGabe = new Fighters("BigGabe", 3, 8, 4, 8, 3, 100, true);
		Fighters Mike = new Fighters("Mike", 7, 2, 7, 6, 6, 100, true);
		System.out.println(BigGabe.lightAttack);
		System.out.println(Mike.block);
		System.out.println("Mike HP is " + Mike.health);
		
		BigGabe.lightAttack(BigGabe.lightAttack, Mike.lightAttack, Mike.health, Mike.block);
		System.out.println("\n");
		BigGabe.heavyAttack(BigGabe.heavyAttack, Mike.heavyAttack, Mike.health, Mike.block);
		System.out.println("\n");
		BigGabe.heavyAttack(BigGabe.heavyAttack, Mike.heavyAttack, Mike.health, Mike.block);
		// Health doesn't go down to 80 ^
		
		
		

	}

}

