package implementation;

/**
 * A person has weight and height greater than zero.
 * @author Andrew Fisher, Chun-Wah Chung, Akin Adewale
 *
 */
public class Person {
	
	/**
	 * Constant representing the minimum value of weight or height.
	 */
	public final double MIN = 0.0;
	
	private String name;
	private double weight;
	private double height;
	
	/**
	 * Initialize the person with an initial value 'name'.
	 * @param name Name of person.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Read current name of person.
	 * @return Name of person.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Read current weight of person.
	 * @return Weight of person.
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Read current height of person.
	 * @return Height of person.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets weight of person.
	 * @param weight Weight of person.
	 * @throws IllegalArgumentException When weight is out of bounds.
	 */
	public void setWeight(double weight) throws IllegalArgumentException {
		if (weight > MIN) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Sets height of person.
	 * @param height Height of person.
	 * @throws IllegalArgumentException When height is out of bounds.
	 */
	public void setHeight(double height) throws IllegalArgumentException {
		if (height > MIN) {
			this.height = height;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Calculates body mass index.
	 * @return Body mass index of person.
	 */
	public double getBMI() {
		return (Math.round((weight / Math.pow(height, 2.0)) * 10.0)) / 10.0;
	}
	
	/**
	 * Interprets body mass index as a label.
	 * @return Label interpretation of person's body mass index.
	 */
	public String getInterpretationOfBMI() {
		if (getBMI() < 18.5) {
			return "underweight";
		} else if (getBMI() >= 18.5 && getBMI() <= 25.0) {
			return "normal";
		} else if (getBMI() >= 25.0 && getBMI() < 30.0) {
			return "overweight";
		} else {
			return "obese";
		}
	}

}
