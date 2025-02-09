import java.util.Random;

public class CrimeSolution {
	
	private Suspect assassin;
	private Weapon murderWeapon;
	private Room crimeScene;
	
	
	public CrimeSolution(Suspect[] allSuspects, Weapon[] allWeapons, Room[] allRooms) {
		Random random = new Random();
		this.assassin = allSuspects[random.nextInt(6)];
		this.murderWeapon = allWeapons[random.nextInt(6)];
		this.crimeScene = allRooms[random.nextInt(10)];
	}
	
	public boolean isTheAssassin(String suspectName) {
		return suspectName.equals(this.assassin.getName());
	}
	
	public boolean isTheMurderWeapon(String weaponName) {
		return weaponName.equals(this.murderWeapon.getName());
	}
	
	public boolean isTheCrimeScene(String roomName) {
		return roomName.equals(this.crimeScene.getName());
	}
	
	public void showTheSolution() {
		System.out.println("\n\n ****************");
		System.out.println("SOLUTION: " + this.assassin.getName() + " " + this.murderWeapon.getName() + " " + this.crimeScene.getName());
		System.out.println("\n\n ****************");
	}
	
	

}
