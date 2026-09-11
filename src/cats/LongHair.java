package cats;

public class LongHair {
	private String furLength;
	private double fluffiness;
	private boolean shedsALot;

	public LongHair() {
		furLength = "Long";
		fluffiness = 9.5;
		shedsALot = true;
	}

	public LongHair(String furLength, double fluffiness, boolean shedsALot) {
		this.furLength = furLength;
		this.fluffiness = fluffiness;
		this.shedsALot = shedsALot;
	}

	@Override
	public String toString() {
		return "LongHair{furLength='" + furLength + "', fluffiness=" + fluffiness + ", shedsALot=" + shedsALot + "}";
	}

	public String getFurLength() {
		return furLength;
	}

	public void setFurLength(String furLength) {
		this.furLength = furLength;
	}

	public double getFluffiness() {
		return fluffiness;
	}

	public void setFluffiness(double fluffiness) {
		if (fluffiness >= 0) {
			this.fluffiness = fluffiness;
		}
	}

	public boolean getShedsALot() {
		return shedsALot;
	}

	public void setShedsALot(boolean shedsALot) {
		this.shedsALot = shedsALot;
	}
}
