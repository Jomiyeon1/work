//package jb01.part07;

/*
	Generic : jdk 1.5 추가 기능
	- vector 생성 시 관리할 Data Type 미리 선언 가능
	- Data 추출시 관리할 Data Type이 결정되어 있으니 명시적 형변환이 불필요
*/

import java.util.*;

public class VectorTest03{
	//main
	public static void main(String[] args){
		
		//Vector 객체 생성 시 관리(저장, 추출)될 인스턴스 DataType 명시
		Vector<String> vector = new Vector<String>(10, 10);

		//Vector에 String 저장
		//add(E obj) : E를 인자로 받는다는 의미는? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1. 홍");
		vector.add(s1);
		vector.add(new String("2. 동"));
		vector.add("3.님 안녕?!");

		//Vector에 저장된 값을 출력
		for(int i = 0 ; i < vector.size(); i++){
			//Generic 사용으로 명시적 형변환 불필요
			String s = vector.elementAt(i);
			System.out.print(s);
			//System.out.print(vector.elementAt(i));
		}

		System.out.println("\n JDK 1.5 추가 기능 :: Generic, Enhanced Loop 사용");
		// > 위 for문과 비교하여 이해하자. JDK 추가기능 Enhan For Loop
		// Vector 내부에 저잔된 값을 size()만큼 반복, 1EA씩 추출 String 해준다.(Generic 사용으로..)
		for(String value : vector){
			System.out.print(value);
		}

	System.out.println("\n ==> API 확인");
	vector.insertElementAt("4. 길", 1);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}

	System.out.println("\n ==> API 확인");
	vector.setElementAt("5. 홍길순", 3);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}
	System.out.println("\n ==> API 확인");
	vector.removeElementAt(3);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}

	}//end of main

}//end of class