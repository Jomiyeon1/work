// package jb03.part05;

class Developer1
{
	//Field
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer;
	// ���� ���� ���� ���, ����غ��� ������ ���. 
	// �ʱⰪ�� 0�̶�� �ϳ�, ����� �ȵǴµ�?

	public void participateProject(){
		System.out.println("���α׷� ���߷� ���� ����, ��� ����");
		avgIncome++;
		projectCareer++;
	}

	/* �߰��� method (OverLoading Method) ======================
	* project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	  1. income�� 1 ����
	  2. projectCareer �� 1 ����
	   ���� �� ���� project�� name�� ���÷����ϴ� ����	
	*/
	
	public void participateProject(String project){
		System.out.println( project + "==> project ������ ���� ����, ��½���.");
		avgIncome++;
		projectCareer++;

	}

	// ���Ǹ� ���� ������ ���� => income 1 ���� ����

	public void instruct(){
		System.out.println("���Ǹ� ���� ���� ����");
		avgIncome++;

	}


	// �߰��� method(OverLoading Method)
	// ���Ǹ� ���� ������ ����
	// ���� ���� ���� income ���� ����

	public void instruct(int lectureCount){
		System.out.println(lectureCount + "�� ���Ǹ� ���� ���� ����");
		avgIncome += lectureCount;
	}

}//class
