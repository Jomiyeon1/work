//package jb01.part06;

/*
	1. Vector �� ���� ���ڿ����� ����ϴ� for���� Method�� ����, ����
	2. Vector �� Ȯ���Ͽ� �ʿ��� ���(method) �߰�.
*/

import java.util.*;

// Vector �� final class�� �ƴ϶�� Ȯ�尡��
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
//Vector�� ����( ? , ����) �� ���ڿ� ���� ����ϴ� Method ����
public void pringString(Vector vector){

//	for(int i = 0 ; i < vector.size(); i++){
//		System.out.print( ( String ) vector.elementAt(i));
//	}

	// ���� for���� ���Ͽ� ��������. JDK 1.5�� �߰��� ��� :: Enhanced Foe Loop
	// Vector ������ ���ܵ� ���� size()��ŭ �ݺ�, 1EA�� ���� Object�� ��� �ش�.
	for(Object object : vector){
		//==> �� for���� elemnetAt()�� Casting�� �Ͱ� ���Ͽ� ����
		System.out.print( (String)object);
	} 
}//method

//main
public static void main(String[] args){
	VectorTest02 vectorTest = new VectorTest02(10, 10);

	//Vector�� Object����
	String s1 = new String("1. ȫ");
	vectorTest.add(s1);
	vectorTest.add(new String("2. ��"));
	vectorTest.add("3.�� �Ⱦȳ��ϼ���.");

	//vectorTest.pringString(vectorTest);
	System.out.println("\n ==> API Ȯ��");
	vectorTest.insertElementAt("4. ��", 1);
	vectorTest.pringString(vectorTest);

	System.out.println("\n ==> API Ȯ��");
	vectorTest.setElementAt("5. ȫ���", 3);
	vectorTest.pringString(vectorTest);

	System.out.println("\n ==> API Ȯ��");
	vectorTest.removeElementAt(3);
	vectorTest.pringString(vectorTest);


}//end of main
}//end of class