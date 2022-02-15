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
		System.out.println("������� �ȳ�");
	}
	public void charge(){
		System.out.println("�л� : 300, �Ϲ��� : 500, ��� ����.");
	}
} // end of BusCharge class

//=====================================
class Student extends BusCharge{
	public Student(){
		super("�л�");
	}
	public void charge(){
		System.out.println(":: 300�� \n");
	}
} // end of Student class

//======================================
class Adult extends BusCharge{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println(":: 500�� \n");
	}
} // end of Adult class

class Old extends BusCharge{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println(":: ����\n");
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
		b1.charge(); // � Ŭ������ method�� ��µǾ����� Ȯ��. >> �л�
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