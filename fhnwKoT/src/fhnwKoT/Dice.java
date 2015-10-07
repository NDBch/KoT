
public class Dice {

	private boolean active = true;
	private GenericDiceValues value;
	private String imageURL;
	private boolean isNumeric;

	public Dice() {
		this.roll();
	}

	public enum GenericDiceValues {
		Eins("1_Würfel.png", true),
		Zwei("2_Würfel.png", true),
		Drei("3_Würfel.png", true),
		Blitz("Blitz_Würfel.png", false),
		Herz("Herz_Würfel.png", false),
		Tatze("Tatze_Würfel.png", false);

		public final String url; // public, da nicht mehr änderbar (final)
		public final boolean numeric;

		private GenericDiceValues(String imageUrl, boolean num) {
			this.url = imageUrl;
			this.numeric = num;
		}
	}

	public void roll() {
		if (this.active) {
			int random = (int) (Math.random() * GenericDiceValues.values().length);
			this.value = GenericDiceValues.values()[random];
			this.imageURL = GenericDiceValues.values()[random].url;
			this.isNumeric = GenericDiceValues.values()[random].numeric;
		}
	}

	public GenericDiceValues getValue() {
		return value;
	}

	public void switchStatus() {
		if (this.active == true) {
			this.active = false;
		} else {
			this.active = true;
		}
	}

	public boolean getStatus() {
		return active;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public boolean getNumericStatus() {
		return this.isNumeric;
	}

}
