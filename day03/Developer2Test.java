//package jb03.part06;

class Developer2Test 
{
	public static void main(String[] args) 
	{
		//Developer2.class�� Instanec ����
		Developer2 developer = new Developer2();

		//developer �ĺ����� ���� Instance �����ڸ� ���� ���
		System.out.println("�̸��� : " + developer.name);
		System.out.println("������ : " + developer.job);
		System.out.println("��� ������ : " + developer.avgIncome);
		System.out.println("PJT ����� : " + developer.projectCareer);

		System.out.println("====================");

		//method�� ȣ���Ͽ� ������ ���� ���°� �޾� ����ϸ�..
		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸��� : " + name);
		System.out.println("������ : " + job);
		System.out.println("��� ������ : " + avgIncome);
		//�Ʒ��� ������ ��������
		System.out.println("PJT ����� : " + developer.getProjectCareer());

		// ==> �޼ҵ带 ȣ���� �⺻�� �Է��صξ��� Field ������ ����� Ȯ���ϴ� ����.


	}//main
}//class