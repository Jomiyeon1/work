class Circle extends Shape{
	//Field
	private double radius;
	
	public Circle(){
	}

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}

	public void calculationArea(){
		double area = getRadius() * getRadius() * 3.14;
		//System.out.println(area);
	
	}
}