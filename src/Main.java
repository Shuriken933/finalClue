

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		// suspects
		Player player1 = new Player("Miss Scarlett");
		Player player2 = new Player("prof. Plum");
		Player player3 = new Player("Colonnello Mustard");
		Player player4 = new Player("Reverendo Green");
		Player player5 = new Player("Mrs White");
		Player player6 = new Player("Contessa Peacock");
		Player[] allPlayers = new Player[6];
		allPlayers[0] = player1;
		allPlayers[1] = player2;
		allPlayers[2] = player3;
		allPlayers[3] = player4;
		allPlayers[4] = player5;
		allPlayers[5] = player6;
		
		// weapons
		Weapon weapon1 = new Weapon("corda");
		Weapon weapon2 = new Weapon("tubo di piombo");
		Weapon weapon3 = new Weapon("pugnale");
		Weapon weapon4 = new Weapon("chiave inglese");
		Weapon weapon5 = new Weapon("candeliere");
		Weapon weapon6 = new Weapon("rivoltella");
		Weapon[] allWeapons = new Weapon[6];
		allWeapons[0] = weapon1;
		allWeapons[1] = weapon2;
		allWeapons[2] = weapon3;
		allWeapons[3] = weapon4;
		allWeapons[4] = weapon5;
		allWeapons[5] = weapon6;
		
		// rooms
		Room room1 = new Room("Sala da ballo");
		Room room2 = new Room("Serra");
		Room room3 = new Room("Sala da biliardo");
		Room room4 = new Room("Biblioteca");
		Room room5 = new Room("Studio");
		Room room6 = new Room("Anticamera");
		Room room7 = new Room("Scantinato");
		Room room8 = new Room("Veranda");
		Room room9 = new Room("Sala da pranzo");
		Room room10 = new Room("Cucina");
		Room[] allRooms = new Room[10];
		allRooms[0] = room1;
		allRooms[1] = room2;
		allRooms[2] = room3;
		allRooms[3] = room4;
		allRooms[4] = room5;
		allRooms[5] = room6;
		allRooms[6] = room7;
		allRooms[7] = room8;
		allRooms[8] = room9;
		allRooms[9] = room10;
		
		// solution
		Random random = new Random();
		Player assassin = allPlayers[random.nextInt(6)];
		Weapon murderWeapon = allWeapons[random.nextInt(6)];
		Room crimeScene = allRooms[random.nextInt(10)];
		
		// show solution
		System.out.println("SOLUZIONE");
		System.out.println("l'assassino è: " + assassin.getName());
		System.out.println("l'arma del delitto è: " + murderWeapon.getName());
		System.out.println("la scena del crimine è: " + crimeScene.getName());

	}

}
