//package jb04.part04;

class BusCharge{
	//Field
	String section;
	//Constructor
	public BusCharge(){		
	}
	public BusCharge(String str){
		section = str;
	}
	//method
	public void information(){
		System.out.println("버스요금 안내");
	}
	public void charge(){
		System.out.println("학생 : 300, 일반인 : 500, 어르신 무료.");
	}
} // end of BusCharge class

//=====================================
class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println(":: 300원 \n");
	}
} // end of Student class

//======================================
class Adult extends BusCharge{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println(":: 500원 \n");
	}
} // end of Adult class

class Old extends BusCharge{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println(":: 무료\n");
	}
}//end of Old class


public class Display{
	//mian method
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

	}//main

} // end of Display class