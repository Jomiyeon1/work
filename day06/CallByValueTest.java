//package jb01.part02;

/*
	1. Primitivw typr variable : Method ���� ==> call By Value
	2. �������� �����ϰ�, �ڵ��Ͽ� ������� Ȯ��. Call By value ����
*/

public class CallByValueTest{
	//Field
	int number = 100;

	//Method
	public void valueCharge(int value){
		System.out.println("===============");
		value = value + 100;
		System.out.println("value : " + value);
		System.out.println("===============");
	}// end of method

	//main
	public static void main(String[] args){
		
		CallByValueTest call = new CallByValueTest();

		//method�� ���ڰ����� int(primitive Data Type)
		call.valueCharge(call.number);
		System.out.println("number : " + call.number);
	}
	
}//end of class