//package jb04.part02;
// = Human.class �� �Ϲ�ȭ ����
// = Human.class�� �Ӽ��� ������ �����ϸ� �߰���, ��ü���� �Ӽ�, ������ ���´�.

public class Iam extends Human{
	//Field
	String job;

	//Constructor
	public Iam(){
		System.out.println("Iam class default Constructor");
	}

	//method
	//setter
	public void setJob(String str){
		job = str;
	}
	//getter
	public String getJob(){
		return job;
	}



	public static void main(String[] args){
		//1. �Ʒ��� �ν��Ͻ� ������ ��� ����� Ȯ��/����
		//2. OOP�� �Ϲ�ȭ������ ����(�Ӽ�, ����)�� OOPL���� ��� �����ϴ��� ����
		//3. �Ʒ��� �ּ��� Ǯ�� �Ӽ�, ������ ������ Ȯ���Ѵ�.
		Iam iam = new Iam();
/*
		iam.setName("ȫ�浿");
		iam.setAge(100);
		iam.setJob("������");

		System.out.println("�̸� : " + iam.getName());
		System.out.println("���� : " + iam.getAge());
		System.out.println("���� : " + iam.getJob());
*/
	
	}//main
}//class