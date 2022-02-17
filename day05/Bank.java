//package jb05.part08;

// 1. abstract class 는 intreface(기능의 정의)와 달리 일반 공유 method와 Field를 가질 수 있다.

public abstract class Bank{
	//Field
	private String name;

	//Constructer
	public Bank(){		
	}
	public Bank(String name){
		this.name = name;
	}

	//Method
	//은행명을 출력하는 display method를 추상 Method로 정의
	public abstract void display();
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
	
	
}//end of class