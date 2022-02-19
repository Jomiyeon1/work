//package jb01.part07;

/*
	1. Vector, Array�� Hierarchy�� ���� �� Ŭ������ ������ ���� ������ ���´�.
	   ���� �н��� Thread�� ����ȭ �κп��� �ٸ� ������ �Ѵ�.
	2. Generic(jdk 1.5�߰� ���)
	  - ArrayList ������ ������ Data Type�� �̸� ���𰡴�
	  - Data ���� �� ������ Data Type�� �����Ǿ� ������ ����� ����ȯ�� ���ʿ�
*/

import java.util.*;

public class ArrayListTest03{

	public static void main(String[] args){

	//ArrayList ������ ����(����, ����)�� ��ü�� Data Type ����
	ArrayList<String> arrayList = new ArrayList<String>(10);

	//add(E obj) : E�� ���ڷ� �޴´ٴ� �ǹ̴�? Generic ������� ������ ����ȯ ���ʿ�
	String s1 = new String("1. ȫ");
	arrayList.add(s1);
	arrayList.add(new String("2. ��"));		
	arrayList.add("3.�� �ȳ��ϼ���");

	//ArrayList����� ���� ���
	for(int i = 0 ; i < arrayList.size(); i++){
		// Generic ������� ������ ����ȯ ���ʿ�
		System.out.print( arrayList.get(i));
	}
	System.out.println("\n JDK 1.5 �߰� ��� :: Generic, Enhanced Loop ���");
	// > �� for���� ���Ͽ� ��������. JDK �߰���� Enhan For Loop
	// arrayList ���ο� ���ܵ� ���� size()��ŭ �ݺ�, 1EA�� ���� String ���ش�.(Generic �������..)
	for(String value : arrayList){
		System.out.print(value);
	}
	System.out.println("\n ==> API Ȯ��");
	arrayList.add(1, "4. ��");
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}

	System.out.println("\n ==> API Ȯ��");
	arrayList.set(3, "5. ȫ���");
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}
	System.out.println("\n ==> API Ȯ��");
	arrayList.remove(3);
	for(int i = 0; i < arrayList.size(); i++){
		System.out.print( (String)arrayList.get(i) );
	}

	
	}//end of main
}//end of class