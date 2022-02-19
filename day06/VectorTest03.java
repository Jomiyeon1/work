//package jb01.part07;

/*
	Generic : jdk 1.5 �߰� ���
	- vector ���� �� ������ Data Type �̸� ���� ����
	- Data ����� ������ Data Type�� �����Ǿ� ������ ����� ����ȯ�� ���ʿ�
*/

import java.util.*;

public class VectorTest03{
	//main
	public static void main(String[] args){
		
		//Vector ��ü ���� �� ����(����, ����)�� �ν��Ͻ� DataType ���
		Vector<String> vector = new Vector<String>(10, 10);

		//Vector�� String ����
		//add(E obj) : E�� ���ڷ� �޴´ٴ� �ǹ̴�? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1 = new String("1. ȫ");
		vector.add(s1);
		vector.add(new String("2. ��"));
		vector.add("3.�� �ȳ�?!");

		//Vector�� ����� ���� ���
		for(int i = 0 ; i < vector.size(); i++){
			//Generic ������� ����� ����ȯ ���ʿ�
			String s = vector.elementAt(i);
			System.out.print(s);
			//System.out.print(vector.elementAt(i));
		}

		System.out.println("\n JDK 1.5 �߰� ��� :: Generic, Enhanced Loop ���");
		// > �� for���� ���Ͽ� ��������. JDK �߰���� Enhan For Loop
		// Vector ���ο� ���ܵ� ���� size()��ŭ �ݺ�, 1EA�� ���� String ���ش�.(Generic �������..)
		for(String value : vector){
			System.out.print(value);
		}

	System.out.println("\n ==> API Ȯ��");
	vector.insertElementAt("4. ��", 1);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}

	System.out.println("\n ==> API Ȯ��");
	vector.setElementAt("5. ȫ���", 3);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}
	System.out.println("\n ==> API Ȯ��");
	vector.removeElementAt(3);
	for(int i = 0; i < vector.size(); i++){
		System.out.print( (String)vector.elementAt(i) );
	}

	}//end of main

}//end of class