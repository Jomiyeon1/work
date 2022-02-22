public class Rectangular extends Shape{

	//Field
	private double width;
	private double hight;
	
	//Constructor
	public Rectangular(){
	}

	public Rectangular(String name, double width, double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHight(double hight){
		this.hight = hight;
	}

	public double getWidth(){
		return width;
	}

	public double getHight(){
		return hight;
	}

	//Method
	public void calculationArea(){
		double area = width * hight ;
		//System.out.println(area);
	
	}

}