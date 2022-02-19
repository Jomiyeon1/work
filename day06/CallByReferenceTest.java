//package jb01.part02;

/*
	1. Reference type variable : Method 인자 ==> Call By Reference
	2. 실행결과를 예측하고, 코딩하여 예측결과 확인. Call Bt Reference 이해

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

		//method 인자 값으로 call (reference data type)
		call.referenceChange(call);
	}


}//end of class
