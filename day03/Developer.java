//package jb03.part03;

class Developer 
{

		//Fiels ==> Ư��, �Ӽ�(attribute) ǥ��
		String name = "ȫ�浿";
		String job = "������";
		int avgIncome = 100;
		int projectCareer; // <== Field ���� �� ���(������ ���� �� ���) �ʱ�ȭ ������?
		// System.out.println(projectCareer); int �ʱⰪ�� ���� ������.
		
		//Method => ���, ����(behavior)ǥ��


		public void partcipateProject(){
			System.out.println("���α׷� ���߷� ��������, ��½���)");
				avgIncome++;
				projectCareer++;
		
		}//��������, ��½��� void



		public void instruct(){
			System.out.println("���Ǹ� ���� ��������");
			avgIncome++;
		
		}//���� ���� ���� void


	
} //class