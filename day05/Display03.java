//package jb05.part05.test04;

/*
	1. BusCharge.class�� chargr() Method ��� ������..?
	2. ���� Ŭ����(Student, Adult, Old)���� chager() Method�� OverRiding �ʴ´ٸ�?

	--------------------------------------------------------------------------------
	==> abstract Method / abstract class�� �ʿ伺 �� ����
	1. abstract Method
	 - ��ü���� �ʿ䰡 ���� Method.
	 - ���� Ŭ�������� ��ü������ ������(OverRiding)�ؾ��ϴ� �������� ���� Method
	2. abstract class
	 - ��ü������ ���� abstract Methodr�� ���ǵ� Ŭ����
	 - �Ϲ�ȭ�� ���� �� ������, �Ϲ��� ������ �Ӽ� ������������ ���ǵ� Ŭ����
	 �ڡ� abstract class�� intance ������ �� ����. �ڡڡ� �߿�!!

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
		System.out.println("������� �ȳ�");
	}
	// ������ ������, ���� Ŭ������ OverRiding�� �����ϴ� �߻�޼��� ����
//	public abstract charge(){
//		System.out.println("�л� : 300, �Ϲ��� : 500, ��� ����.");
//	}

	public abstract void charge();

}//end of  BusCharge class

// abstract ��ӽ� abstract method ���� ������(OverRiding)�ؾ���! <- ������!
class Student extends BusCharge{
	public Student(){
		super("�л�");
	}
	public void charge(){
		System.out.println("300��");
	}
} // end of Student class
// abstract ��ӽ� abstract method ���� ������(OverRiding)�ؾ���! <- ������!

class Adult extends BusCharge{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}
} // end of Adult class

class Old extends BusCharge{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("����");
	}
}//end of Old class

public class Display03{
	//main method
	public static void main(String args[]){
		//���� ���۷����� ���� �ν��Ͻ��� ��������(������ ����ȯ ~ is a ~ Relation)
		//abstract class �� ��ü���� �Ұ� �׷��� type ������?
		Student bc1 = new Student(); // Student b1 = new Student();
		Adult bc2 = new Adult(); // Adult b2 = new Adult();	
		Old bc3 = new Old(); // Old b3 = new Old();
		// Polymorphism : �ϳ��� �������̽��� ���� �� �پ��� Ȱ��


		bc1.information(); 
		System.out.println(bc1.section);
		bc1.charge(); // � Ŭ������ method�� ��µǾ����� Ȯ��. >> �л�
		System.out.println("===================");

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();
		System.out.println("=====================");

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();

		// ���� �ڵ��� �Ʒ� �ڵ��� ���ϸ�...
		// 1. �ݺ��� �κ��� ���°�?
		// 2. ���� Data Type ����(�迭:Array)�� �̿��Ͽ� �ϰ������� ���� �� ���� ���°�?
		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		//BusCharge bc1 = new Student();
		//Student b1 = new Student();
		bc[1] = new Adult();
		//BusCharge bc2 = new Adult();
		//Adult b2 = new Adult();
		bc[2] = new Old();
		//BusCharge bc03 = new Old();
		//Old bc3 = new Old();
	
		System.out.println("****************************");
		for(int i = 0; i < bc.length; i++){
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}


	}// end of main
}