//package jb04.part02;
// iam.class �� �Ϲ�ȭ����
// iam.class �� �Ӽ��� ������ �����ϸ� �߰��� ��ü���� �Ӽ�, ������ ���´�.


class Son extends Iam{
	//Field
	String school;

	//Constructor
	public Son(){
		System.out.println("Son class default Constructor");
	}

	// setter
	public void setSchool(String str){
		school = str;
	}

	//getter
	public String getSchool(){
		return school;
	}

	//mian method
	public static void main(String[] args) {
		Son son = new Son();

		son.setName("ȫ�浿 �̸�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("����Ƽ��������");
		
		System.out.println("�̸� : " + son.getName());
		System.out.println("���� : " + son.getAge());
		System.out.println("���� : " + son.getJob());
		System.out.println("�Ҽ� : " + son.getSchool());

	} // mian
}//class
