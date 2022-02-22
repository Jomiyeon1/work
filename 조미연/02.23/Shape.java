public abstract class Shape{
	// - : private, + : public, # : protected

	//Field
	private String name;
	protected double area;
	private Shape[] shape;
	
	//Constructor
	public Shape(){
	}
	public Shape(Shape[] shape){
		this.shape = shape;
	}

	//=====================
	
	public Shape(String name){
		this.name = name;
	}
	//==========================

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}


	public void setArea(double area){
		this.area = area;
	}

	public double getArea(){
		return area;
	}
	

	//=============================
	abstract void calculationArea();

	public void print(){
		for(int i = 0; i < shape.length; i++){
			Shape shape = shape[i];
			//calculationArea
			area += shape[i].calculationArea();
			
		}
		System.out.println(name + "의 면적은" + area);
	}
		
}//end of class