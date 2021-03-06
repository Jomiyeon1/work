//package jb05.part03;

/*
	1. ModifierTest01 ~ 04를 통해 class구현시 
	   Modifer / Access Modifer 어떻게 활용, 응용되는지 살펴보면..
	2. TopSecret01.class를 Access Modifier, Modifier로 어떻게 변경시키는지를 이해
*/

class TopSecret01{
	///Field
	int secretNo = 7777;
	//Constructor
	public TopSecret01(){
		
	}

	///Method
	///getter
	public int getSecretNo(){
		return secretNo;
	}

}///end of class
//========================================================
public class ModifierTest01{
	//main
	public static void main(String[] args){
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

		// ==> secretNo 변경하면
		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());
	}//end of main
}//end of class

// TopSecret.class의 문제점
// secretNo는 중요한 attribute이다. 그러나 누구나 접근 및 변경이 가능.