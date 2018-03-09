package converter;

public enum Length {
	
	Meter(1.0000),
	Kilometer(1000.0),
	Centimeter(0.0100),
	Mile(1609.344),
	Foot(0.30480),
	Wa(2.00000),
	AU(149597870700.0);
	
	private final double VALUE;
	
	private Length(double value) { this.VALUE = value;}
	
	public double getValue() {return this.VALUE;}
}
