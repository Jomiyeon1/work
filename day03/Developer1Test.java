//package jb03.part05;

class Developer1Test{

	public static void main(String[] args) 
	{
		//Developer1.class �� Instance ����
		Developer1 developer = new Developer1();
		
		//developer �ĺ����� ���� Instance. �����ڸ� ���� ���
		System.out.println("�̸��� : " + developer.name);
		System.out.println("������ : " + developer.job);
		System.out.println("��� ������ : " + developer.avgIncome);
		System.out.println("PJT ����� : " + developer.projectCareer);

		System.out.println("==========================");

		//project�� ����
		developer.participateProject();
		System.out.println("��� ������ : " + developer.avgIncome);
		System.out.println("project ���� ����� : " + developer.projectCareer);

		System.out.println("==========================");

		// 1���� ������ ����
		developer.instruct();
		System.out.println("��� ������ : " + developer.avgIncome);

		// �߰��� �κ� ===========================================
		System.out.println("==========================");
		 
		// ȫ�浿�� �ѹ����� project�� ����
		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		// ==> �� �ζ����� �Ʒ��� ���� ǥ���ߴ�. �ּ� Ǯ�� Ȯ���� ��!
		//hong1.participateProject("�ѹ�����");
		System.out.println("��� ������ : " + developer.avgIncome);
		System.out.println("project ���� ����� : " + developer);

		System.out.println("==========================");

		// ȫ�浿�� 2�� ������ ����
		int lectureCount = 2;
		developer.instruct(lectureCount);
		// ==> �Ʒ��� ���� �ڵ�. �ּ�Ǯ�� Ȯ���� ��!
		//hong1.instruct(2);
		System.out.println("��ռ����� : " + developer.avgIncome);



	}//main
}//class