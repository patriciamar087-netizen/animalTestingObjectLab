package cats;

public class Shorthair {
	private String pattern;
	private double weight;
	private boolean indoor;

	public Shorthair() {
		pattern = "Tabby";
		weight = 8.0;
		indoor = true;
	}

	public Shorthair(String pattern, double weight, boolean indoor) {
		this.pattern = pattern;
		this.weight = weight;
		this.indoor = indoor;
	}

    @Override
    public String toString() {
        return "Shorthair{pattern='" + pattern + "', weight=" + weight + ", indoor=" + indoor + "}";
    }
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }
}

