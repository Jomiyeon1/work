//package jp01.part05;

/*
	1. Array : 같은 Data type의 묶음, 고정 길이
	2. java.util.Vecter : 다른 Data type도 묶음, 가변길이
*/

import java.util.*;

public class VectorTest01{
	public static void main(String[] args){
	//Vector 생성 : API의 생성자를 확인, 인자로 전달된 10, 10 의미 확인
	Vector vector = new Vector(10, 10);

	//Vector 에 Object 저장 => add(Object obj) > Object를 인자로 받는다는 의미는?
	String s1 = new String("1. 홍");
	vector.add(s1);
	vector.add(new String("2. 동"));
	vector.add("3.님 안안녕하세요.");
	
	//Vector 저장된 값을 출력 :: vector.capacity() 무엇을 return 하는가 > 갖고있는 방의 개수를 int로 return
	for(int i = 0; i < vector.size(); i++){ // size > 값을 담고 있는 개수
		Object obj = vector.elementAt(i); // 어떤 타입이 들어있는지 모르니 Object(모든 타입 수용가능)로 받는다.
		String s = (String)obj;
		//String s = (String)vector.elementAt(i) // 위 두 라인과 비교
		System.out.print(s);
		//System.out.print( (String)vector.elementAt(i) );
	}// for
	
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
	}//main

}//class