
public class Card {

	
	private int cost;
	private int health;
	private int energy;
	private int fame;
	private int damage;
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public enum GenericCards {
		Eckkneipe("Tatze_W�rfel.png",3,1,0,0,0,0,false),
		Heilung("Herz_W�rfel.png",3,0,2,0,0,0,false),
		Nationalgarde("1_W�rfel.png",3,2,-2,0,0,0,false),
		Bombardement("2_W�rfel.png",4,0,-3,-3,0,0,false),
		Hochbahn("3_W�rfel.png",4,2,0,0,0,0,false),
		Panzer("Blitz_W�rfel.png",4,4,-3,0,0,0,false),
		D�senj�ger("Blitz_W�rfel.png",5,5,-4,0,0,0,false),
		SprungAusGrosserH�he("",5,2,0,0,0,0,true),
		Wohnblock("",5,3,0,0,0,0,false),
		KernkraftWerk("",6,2,3,0,0,0,false),
		�lraffinerie("",6,2,0,-3,0,0,false),
		Wolkenkratzer("",6,4,0,0,0,0,false),
		Evakuierungsbefehl1("",7,0,0,0,-5,0,false),
		Evakuierungsbefehl2("",7,0,0,0,-5,0,false),
		Impulsaufladung("",8,0,0,0,0,9,false);

		public final String url;

		private GenericCards(String imageUrl, int cost, int fame,int ownHealth, int otherHealth, int otherFame, int energy, boolean goToTokyo) {
			this.url = imageUrl;
		}
	}

}
