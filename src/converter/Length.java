package converter;

/**
 * Handling the units for converting.  
 * @author Poorin Pichayamongkol
 */
public enum Length {
	
	//enum members
	Meter(1.0000),
	Kilometer(1000.0),
	Centimeter(0.0100),
	Mile(1609.344),
	Foot(0.30480),
	Wa(2.00000),
	AU(149597870700.0);
	
	//attributes of the enum members
	private final double VALUE;
	
	/**
	 * Initializing the Length of Enum.
	 * @param value of enum members
	 */
	private Length(double value) { this.VALUE = value;}
	
	/**
	 * Geting value from Length then return it.
	 * @return the value of enum members
	 */
	public double getValue() {return this.VALUE;}
}
