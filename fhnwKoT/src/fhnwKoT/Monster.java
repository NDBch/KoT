
public class Monster {

	private int health;
	private int energy;
	private int fame;
	public final GenericMonsters type;
	public final String imageURL;
	public final String name;
	
	
	public Monster(GenericMonsters monster){
		this.type = monster;
		this.health = 10;
		this.energy = 0;
		this.fame = 0;
		this.imageURL = monster.url;
		this.name = monster.name;
	}
	
	public enum GenericMonsters {
		Alienoid("1_W�rfel.png", "Alienoid"),
		CyberBunny("2_W�rfel.png", "Cyber Bunny"),
		GigaZaur("3_W�rfel.png", "Giga Zaur"),
		Kraken("Blitz_W�rfel.png", "Kraken"),
		MekaDragon("Herz_W�rfel.png", "Meka Dragon"),
		TheKing("Tatze_W�rfel.png", "The King");

		public final String url; // public, da nicht mehr �nderbar (final)
		public final String name;

		private GenericMonsters(String imageUrl, String name) {
			this.url = imageUrl;
			this.name = name;
		}
	}
	
	
	public void manageHealth(int modify){
		this.health += modify;
	}
	public void manageEnergy(int modify){
		this.energy += modify;
	}
	public void manageFame(int modify){
		this.fame += modify;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
