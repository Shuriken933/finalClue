import java.util.Scanner;

public class Game {

	private Suspect[] allSuspects;
	private Weapon[] allWeapons;
	private Room[] allRooms;
	private Player[] allPlayers;
	private CrimeSolution crimeSolution;
	private boolean isCrimeOpen;

	public Game() {
		this.isCrimeOpen = true;
		ClueFactory clueFactory = new ClueFactory();
		this.allSuspects = clueFactory.createSuspects();
		this.allWeapons = clueFactory.createWeapons();
		this.allRooms = clueFactory.createRooms();

		this.crimeSolution = new CrimeSolution(allSuspects, allWeapons, allRooms);
	}

	public void play() {
		System.out.println("Benvenuto nel gioco!");
		showAllClues();

		this.crimeSolution.showTheSolution();

		Scanner scanner = new Scanner(System.in);

		int countAttempts = 0;

		do {
			countAttempts++;

			System.out.print("\n\nInserisci il nome del sospettato: ");
			String suspectName = scanner.nextLine();
			System.out.print("\n\nInserisci il nome dell'arma: ");
			String weapontName = scanner.nextLine();
			System.out.print("\n\nInserisci il nome della stanza: ");
			String roomName = scanner.nextLine();

			makeSuggestion(suspectName, weapontName, roomName);

			if(!(countAttempts<5)) {isCrimeOpen = false;}

		} while(isCrimeOpen && countAttempts<5);


		scanner.close();

	}

	private void showAllClues() {
		System.out.print("\nTutti i sospettati: ");
		for (Suspect suspect : this.allSuspects) {
			System.out.print(suspect.getName() + " - ");
		}

		System.out.print("\n\nTutte le armi: ");
		for (Weapon weapon : this.allWeapons) {
			System.out.print(weapon.getName() + " - ");
		}

		System.out.print("\n\nTutte le stanze: ");
		for (Room room : this.allRooms) {
			System.out.print(room.getName() + " - ");
		}
	}

	private void makeSuggestion(String suspect, String weapon, String room) {
		if(this.crimeSolution.isTheAssassin(suspect) && this.crimeSolution.isTheMurderWeapon(weapon) && this.crimeSolution.isTheCrimeScene(room)) {
			System.out.println("Complimenti! Hai risolto il caso!");
			isCrimeOpen = false;
		} else {
			System.out.println("Hai sbagliato, riprova.");
		}
	}
}
