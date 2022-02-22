//package jb02.part02;
/*
	java ExceptionTest 10 20 0 ����� 3��° ���ڰ��� 0�̸� ����� �����߻�.
	> ��� ���(����� ����)�а� ��°�� Ȯ��
	�ذ� 1. try{}catch()�� ����(Exception:: ����) �߻����� ó��. ��������
	------------------------------------------------------------------------
	�ذ� 2. throws�� JVM���� ������ ȣ����(������ �߻���Ų)������ �߻��� Exception�� ������
			(?, ����). (����? ȣ���� ��.(���� ������ ��))

*/

public class ExceptionTest03{
	//Field
	private int sum;
	private int avg;

	//Contructor
	public ExceptionTest03(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> ����");
		sum = x + y;
		System.out.println("1. ==> �� : " + sum);
		System.out.println("1. ==> sum ��");
	}

	//JVM���� ���� AritmethicException�� �ٽ� �ڽ��� ȣ���� ������ ����(?, ����)��.
	public void avg(int z) throws ArithmeticException{
		System.out.println("2. ==> avg����");
		//z = 0 �ΰ�� �Ҵ�
		avg = sum/z;
		System.out.println("��� : " + avg);
		System.out.println("2. ==> avg��");
	}
		//main
		public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest03 et = new ExceptionTest03();
		et.sum(i, j);

		// ==> � Exception�� �߻��ϴ��� Ȯ������
		et.avg(k);

		System.out.println("main Method End....");

		}//end of main

}// end of class