package music.types.instrument;

import music.types.WayOfExecution;

public class Instrument extends WayOfExecution {

	private int quantity = 7;

	public Instrument() {

	}

	public Instrument(int century, String era, String genre) {
		super(century, era, genre);

	}

	public void setQuantity(int value) {
		this.quantity = value;

	}

	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public String getWay() {
		String newGetWay = "New override! Now way still instrumental!";
		return newGetWay;
	}

	public void era(int century) {
		System.out.println("New overload! Now century = " + century);
	}

}
