//package jb01.part02;

/*
	1. Primitivw typr variable : Method 인자 ==> call By Value
	2. 실행결과를 예측하고, 코딩하여 예측결과 확인. Call By value 이해
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

		//method의 인자값으로 int(primitive Data Type)
		call.valueCharge(call.number);
		System.out.println("number : " + call.number);
	}
	
}//end of class