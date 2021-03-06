//package jb03.part08;
/*
:: Constructor 의미이해
 1. 인스턴스 생성시 new A() 의미 이해
 2. new와 같이 사용되는 특수한 행위를 하는 method 이해
 3. Constructor 주작업, 용도?
 ======================================================
 => 생성자는 인스턴스 생성시 호출된다.
 => 주작업은 Field variable 초기화 작업(상태값 설정)
 => 생성시 상태를 갖는 인스턴스 생성
*/

class User02{

	//Field
	String name;
	int javaLevel;

	//Constructor
	public User02(){
		System.out.println("Constructor Method");
		name = "홍길동";
		javaLevel = 0;
	}

	//Method
	// getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}
	
	
	//main =====================
	public static void main(String[] args) 
	{
		System.out.println("===================");
		User02 user = new User02();
		System.out.println("===================");

		System.out.println("name : " + user.getName());
		System.out.println("javaLevel : " + user.getJavaLevel());

	}//main
}//class
