package day19;

public enum Planet {

	MERCURY(100,5),
	VENUS(200,7),
	EARTH(300,15),
	MARS(50,3),
	JUPITER(500,25),
	SATURN(400,20),
	URANUS(350,18),
	NEPTUNE(250,12),
	PLUTO(20,2);
	
	
	private double mass;
	private double radius;
	
	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double gravity()
	{
		return this.mass/(this.radius*this.radius);
	}
	
}
