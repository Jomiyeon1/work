//package jb02.part02;

class  WhileTest
{
	public static void main(String[] args) 
	{
		//while��
		int i = 0;
		while(i < 10){
		System.out.println("����� while�� ���ξ��� i = " + i);
		i++;
		}

		//do while��
		int j = 0;
		do{
		System.out.println("\n\t ����� do�� ������ j = " + j);
		j++;
		}while(j<1);
		System.out.println("\n=============================\n");

		//while���� �̿��� 5���� ����ϴ� ���α׷�
		int k = 1;
		while(k<10){
			System.out.println("5 * " + k + " = " + 5*k);
			k++;
		}

		//���ѷ��� compile error����
		while(true){
		System.out.println("����� �ݺ��������� ���ѷ���");
		}


	}//end of main
}//end of class
