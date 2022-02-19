//package jb01.part02;

/*
	1. Reference type variable : Method ���� ==> Call By Reference
	2. �������� �����ϰ�, �ڵ��Ͽ� ������� Ȯ��. Call Bt Reference ����

*/

public class CallByReferenceTest{
	//Field
	int number = 100;

	//Method
	public void referenceChange(CallByReferenceTest value){
		System.out.println("=======================");
		value.number = 100 + value.number;
		System.out.println("value.number : " + value.number);
		System.out.println("=======================");
	}//Method

	//main
	public static void main(String[] args){
		
		CallByReferenceTest call = new CallByReferenceTest();

		//method ���� ������ call (reference data type)
		call.referenceChange(call);
	}


}//end of class
