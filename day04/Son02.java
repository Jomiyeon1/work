//package jb04.part07;

// Son�� Father�� ���� package�� �����ϸ�, ��Ӱ����̴�.
// �ּ��� Ǯ��
// compile�� error�� Ȯ���ϰ� error�� �ǹ� ����
// �� Access Modifier�� ���� ������ Ȯ��.

public class Son02 extends Father {
	public Son02(){
		System.out.println(this.name); // ==> public String name = "ȫ�浿";
		System.out.println(bank); // ==> protected String bank = "�Ѿ�����";
		System.out.println(branch); // ==> String branch = "���ﵿ����";
		// System.out.println(password); //private int password = 1234;
			// > password has private access in Father
	
		// ==> Field�� Method�� �̿� ����
		System.out.println("���� ��й�ȣ : " + this.getPassword(0));
	}
}

/*
 1. private�� ����Ͽ� �ٸ� class�� ���� ���� ��������
 2. method�� ���� �������� ���θ� ����
*/