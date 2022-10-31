package ZooKeeper1;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Swoosh Swoosh Swoosh");
		displayEnergy();

	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Humans are tasty!");
		displayEnergy();
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Run Everyone! The bat is here!");
		displayEnergy();
	} 
}
