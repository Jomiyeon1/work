//package jb03.part04;

class MethodSyntax
{

		//Field
		String name = "ȫ�浿";
		String add = "�Ѿ�";

		//Method
		public void browerOn(){
			System.out.println("brower�� �Ѵ�.");
		}


		// �۾��� �ϰ� �۾� ������ boolean type�� return�ϴ� ����
		public boolean documentWork(){
			System.out.println("document �۾��� �ϰ� �۾��ϼ� ������ boolean return");
			return true;
		}


		//�ΰ��� ������ �޾� ���� return
		public int sum(int i, int j){
			System.out.println("<<"+i+">>�� <<"+j+">>���� �޾� �� return");
			return(i+j);
		}


		//�̸��� return
		public String getName(){
			System.out.println("�̸��� �����մϴ�.");
			return name;
		}


		//�ּ�
		public String getAdd(){
			System.out.println("�ּҸ� �����մϴ�.");
			return add;
		}


	
		//�̸�, �ּ� array type���� return
		public String[] getAllInformation(){
			String[] str = {name, add};
			return str;
		}
		
	
}//class