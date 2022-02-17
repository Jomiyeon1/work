//package jb05.part07;

/*
	<< interface >>
	 - abstract method ����. (��ɸ� ������ class / pure abstract class)
	   ���(method)�� ���� ����(����)class���� O/R ����
	 - �ν��Ͻ� �����Ұ�(�߻�Ŭ������ �ν��Ͻ� �����Ұ��� ���� �ǹ�)
	   SPEC�� ������ ������ ���̸�, ������ ����� SPEC�� ������ ����ü(���� ��ü)�� ���.
*/

class BusCharge{
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
}//end of  BusCharge class

// charge()�� ������ interface
// ==> ����� ����(��ɸ� �����Ͽ� �����Ѵٸ�..) : ����ö, �װ�, �ý� ��ݿ��� ��밡��.
interface Fee{
	public void charge();
}

//interface ������ abtract method ���� ������(OverRiding)�ؾ���. <- ������
class Student extends BusCharge implements Fee{
	public Student(){
		super("�л�");
	}
	// ==> �Ʒ��� Method�� �ּ�ó���ϰ� ������ �غ���.. ������ Ȯ���غ���.
	public void charge(){
		System.out.println("300��");
	}
} // end of class

//interface ������ abtract method ���� ������(OverRiding)�ؾ���. <- ������
class Adult extends BusCharge implements Fee{
	public Adult(){
		System.out.println("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}
} // end of class

//interface ������ abtract method ���� ������(OverRiding)�ؾ���. <- ������
class Old extends BusCharge implements Fee{
	public Old(){
		System.out.println("���");
	}
	public void charge(){
		System.out.println("����");
	}
}// end of class

public class Display04{
	//main method
	public static void main(String args[]){
		//<< ����1 >> �Ʒ��� ������ �������� ��µȴ�.
/*		Student bc1 = new Student(); 
		Adult bc2 = new Adult(); 
		Old bc3 = new Old(); 

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
*/
		//<< ����2 >> �Ʒ��� �������� ���� �߻� : �����Ͻ� ����
		//1. ������ �߻��� ����
		//2. ������ �ذ��Ͽ� ����� �� �� �ֵ��� ������ ������ ��.
		// ��Ʈ : CastingComplete.java�� ����°�� ��������.
		//       >> casting �����ڸ� ����� ������?
		
		Fee[] fee = new Fee[3]
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

		for(int i = 0; i < fee.length; i++){
			fee[i].information();
			System.out.print(fee[i].section);
			fee[i].charge();
		}//end of for


	}// end of main
}