//package jb01.part08;

/*
 FileName : SwitchTest.java
 1. �б⹮ Switch ����
*/
public class SwitchTest{
  //main method
  public static void main(String args[]){
	int inputData = Integer.parseInt(args[0]);

	//switch���� () ������ ���� case �� ����� ������ case ������ ���๮�� ����
 	// break ���� ���� ������ �����Ѵ�.

	//==>switch (����) : ������ �ݵ�� �������� ��.(byte, short, int, long, char . 5EA)
	switch(inputData){
	case 1:
	  System.out.println("�Է��Ͻ� ���� 1�Դϴ�.");
	  break;
	case 2:
	  System.out.println("�Է��Ͻ� ���� 2�Դϴ�.");
	case 3:
	  System.out.println("�Է��Ͻ� ���� 3�Դϴ�.");
	case 4:
	  System.out.println("�Է��Ͻ� ���� 4�Դϴ�.");
	case 5:
	  System.out.println("�Է��Ͻ� ���� 5�Դϴ�.");
	  break;
	default : 
	  System.out.println("case���� �� ���(���ϻ���� ���� ���)");
	  System.out.println(" defalut�� �����.. �Է��Ͻ� ����" + inputData + "�Դϴ�.");

	}//end of switch


  }// end of main
}//end of class

/*
case 1 : �� break �� �ּ�ó���ϰ� �����غ���..
� ����� �������� Ȯ������. ==> break �� ����Ȯ��
*/