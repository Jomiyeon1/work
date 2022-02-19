//package jb01.part06;

/*
	1. Vector 가 갖는 문자열값을 출력하는 for문을 Method로 추출, 정의
	2. Vector 를 확장하여 필요한 기능(method) 추가.
*/

import java.util.*;

// Vector 가 final class가 아니라면 확장가능
// VectorTest02 is a Vector :: ~is a~

public class VectorTest02 extends Vector{
	//Constructor
	public VectorTest02(){
		super();
	}

public VectorTest02(int intialCapacity, int CapacityIncrement){
	super(intialCapacity, CapacityIncrement);
}

//method
//Vector가 관리( ? , 저장) 한 문자열 값을 출력하는 Method 정의
public void pringString(Vector vector){

//	for(int i = 0 ; i < vector.size(); i++){
//		System.out.print( ( String ) vector.elementAt(i));
//	}

	// 위의 for문과 비교하여 이해하자. JDK 1.5에 추가된 기능 :: Enhanced Foe Loop
	// Vector 내부의 저잔된 값을 size()만큼 반복, 1EA씩 추출 Object에 담아 준다.
	for(Object object : vector){
		//==> 위 for문의 elemnetAt()후 Casting한 것과 비교하여 이해
		System.out.print( (String)object);
	} 
}//method

//main
public static void main(String[] args){
	VectorTest02 vectorTest = new VectorTest02(10, 10);

	//Vector에 Object저장
	String s1 = new String("1. 홍");
	vectorTest.add(s1);
	vectorTest.add(new String("2. 동"));
	vectorTest.add("3.님 안안녕하세요.");

	//vectorTest.pringString(vectorTest);
	System.out.println("\n ==> API 확인");
	vectorTest.insertElementAt("4. 길", 1);
	vectorTest.pringString(vectorTest);

	System.out.println("\n ==> API 확인");
	vectorTest.setElementAt("5. 홍길순", 3);
	vectorTest.pringString(vectorTest);

	System.out.println("\n ==> API 확인");
	vectorTest.removeElementAt(3);
	vectorTest.pringString(vectorTest);


}//end of main
}//end of class