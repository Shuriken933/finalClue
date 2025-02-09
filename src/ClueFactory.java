
public class ClueFactory {
	
	public ClueFactory() {
		
	}
	
	public Suspect[] createSuspects() {
		return new Suspect[] {
				new Suspect("Miss Scarlett"),
				new Suspect("prof. Plum"),
				new Suspect("Colonnello Mustard"),
				new Suspect("Mrs White"),
				new Suspect("Contessa Peacock"),
				new Suspect("Reverendo Green")
		};
	}
	
	public Weapon[] createWeapons() {
		return new Weapon[]{
	            new Weapon("corda"),
	            new Weapon("tubo di piombo"),
	            new Weapon("pugnale"),
	            new Weapon("chiave inglese"),
	            new Weapon("candeliere"),
	            new Weapon("rivoltella")
	      };
	}
	
	public Room[] createRooms() {
		return new Room[] {
				new Room("Sala da ballo"),
				new Room("Serra"),
				new Room("Sala da biliardo"),
				new Room("Biblioteca"),
				new Room("Studio"),
				new Room("Anticamera"),
				new Room("Scantinato"),
				new Room("Veranda"),
				new Room("Sala da pranzo"),
				new Room("Cucina")
		};
	}
	
	

}
