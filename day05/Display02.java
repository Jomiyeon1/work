//package jb05.part05.test03;

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

	public abstract void charge();

}//end of  BusCharge class

// abstract 상속시 abstract method 필히 재정희(OverRiding)해야함! <- 강제성!
class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println("300원");
	}
} // end of Student class
// abstract 상속시 abstract method 필히 재정희(OverRiding)해야함! <- 강제성!

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

public class Display02{
	//main method
	public static void main(String args[]){
		//상위 레퍼런스로 하위 인스턴스를 참조가능(묵시적 형변환 ~ is a ~ Relation)
		//abstract class 는 객체생성 불가 그러나 type 선언은?
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();
		// Polymorphism : 하나의 인터페이스로 접근 및 다양한 활용


		bc1.information(); 
		System.out.println(bc1.section);
		bc1.charge(); // 어떤 클래스의 method가 출력되었는지 확인. >> 학생
		System.out.println("===================");

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();
		System.out.println("=====================");

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();


	}// end of main
} // end of Display02