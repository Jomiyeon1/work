// package jb04.part07;

public class Other{
	//Field
	String name = "ȫ�浿";
	String job = new String("������");
	// �� String Data Type �� name job ���°��� ������ ���� �����Ѵٸ�..
	// Other.class Has A String.class ( ~~~ Has A ~~ : Assocation Relation)
	// �Ʒ��� Father Data Type �� Other ���� �����..

	Father owner = new Father(); // ==> Father �ν��Ͻ� ����

	//Constructor
	public Other(){
		System.out.println(this.owner.name); // public String name = "ȫ�浿";
		System.out.println(owner.bank);  //protected String bank = "�Ѿ�����";
		System.out.println(owner.branch); // String branch = "���ﵿ����";
		// System.out.println(f.password); //private int password = 1234;

		//Field�� Method�� �̿� ����
		System.out.println("���� ��й�ȣ : " + this.owner.getPassword(0));

	}

}