//package jb05.part04.test02;

/*
	1. BusCharge.class의 chargr() Method 사용 유무는..?
	2. 하위 클래스(Student, Adult, Old)에서 chager() Method가 OverRiding 않는다면?

	--------------------------------------------------------------------------------
	==> abstract Method / abstract class의 필요성 및 이해
	1. abstract Method
	 - 구체적일 필요가 없는 Method.
	 - 하위 클래스에서 구체적으로 재정의(OverRiding)해야하는 강제성을 갖는 Method
	2. abstract class
	 - 구체적이지 않은 abstract Methodr가 정의된 클래스
	 - 일반화의 관계 중 공통적, 일반적 행위와 속성 공유목적으로 정의된 클래스
	 ★★ abstract class는 intance 생성할 수 없다. ★★★ 중요!!

*/

abstract class BusCharge{
	String section;
	public BusCharge(){
		//Constructor
	}
	public BusCharge(String section){
		this.section = section;
	}
	//method
	public void information(){
		System.out.println("버스요금 안내");
	}
	// 사용되지 않으며, 하위 클래스에 OverRiding을 강제하는 추상메서드 정의
//	public abstract charge(){
//		System.out.println("학생 : 300, 일반인 : 500, 어르신 무료.");
//	}

	public abstract void charge(); // 추상적으로만 존재함. -> 반드시 하위에 구체적(O/R)해야함

}//end of  BusCharge class

// abstract 상속시 abstract method 필히 재정의(OverRiding)해야함! <- 강제성!
class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println("300원");
	}
} // end of Student class
// abstract 상속시 abstract method 필히 재정의(OverRiding)해야함! <- 강제성!

class Adult extends BusCharge{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println("500원");
	}
} // end of Adult class

class Old extends BusCharge{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println("무료");
	}
}//end of Old class

public class Display{
	//main method
		public static void main(String args[]){
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information(); 
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 method가 출력되었는지 확인. >> 학생
		System.out.println("===================");

		b2.information();
		System.out.println(b2.section);
		b2.charge();
		System.out.println("=====================");

		b3.information();
		System.out.println(b3.section);
		b3.charge();
	
	// 아래의 주석을 풀고 컴파일 에러 확인.
	// 1. abstract class는 객체 생성 불가.
	//BusCharge bc01 = new BusCharge();

	// 2. 객체 생성은 불가능하나, 변수의 선언(Data Type)은 가능하다.
	//BusCharge bc02;

	}//main
	
}