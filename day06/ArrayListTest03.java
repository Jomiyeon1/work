//package jb01.part07;

/*
	1. Vector, Array의 Hierarchy를 보면 두 클래스는 동일한 공유 구조를 갖는다.
	   추후 학습할 Thread의 동기화 부분에서 다른 동작을 한다.
	2. Generic(jdk 1.5추가 기능)
	  - ArrayList 생성시 관리할 Data Type을 미리 선언가능
	  - Data 추출 시 관리할 Data Type이 결정되어 있으니 명시적 현변환이 불필요
*/

import java.util.*;

public class ArrayListTest03{

	public static void main(String[] args){

	//ArrayList 생성시 관리(저장, 추출)될 객체의 Data Type 선언
	ArrayList<String> arrayList = new ArrayList<String>(10);

	//add(E obj) : E를 인자로 받는다는 의미는? Generic 사용으로 묵시적 형변환 불필요
	String s1 = new String("1. 홍");
	arrayList.add(s1);
	arrayList.add(new String("2. 동"));		
	arrayList.add("3.님 안녕하세용");

	//ArrayList저장된 값을 출력
	for(int i = 0 ; i < arrayList.size(); i++){
		// Generic 사용으로 묵시적 형변환 불필요
		System.out.print( arrayList.get(i));
	}
	System.out.println("\n JDK 1.5 추가 기능 :: Generic, Enhanced Loop 사용");
	// > 위 for문과 비교하여 이해하자. JDK 추가기능 Enhan For Loop
	// arrayList 내부에 저잔된 값을 size()만큼 반복, 1EA씩 추출 String 해준다.(Generic 사용으로..)
	for(String value : arrayList){
		System.out.print(value);
	}
	System.out.println("\n ==> API 확인");
	arrayList.add(1, "4. 길");
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}

	System.out.println("\n ==> API 확인");
	arrayList.set(3, "5. 홍길순");
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}
	System.out.println("\n ==> API 확인");
	arrayList.remove(3);
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}

	
	}//end of main
}//end of class