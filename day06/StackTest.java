//package jb01.part09;

import java.util.Stack;

/*
	java.util.Stack( Last In First Out)
	���� �Ʒ��� API�� Ȯ���ϰ� Method�ǹ̸� Ȯ��
*/

public class StackTest{
	//main
	public static void main(String[] args){
		
		//Stack<String> stack = new Stack<String>();
		List<String> stack = new Stack<String>();
		
//		String value = new String("1. : ȫ�浿");
//		stack.push(value);
//		stack.push( new String("2. : �̼���"));
//		stack.push("3. �ָ�");

				
		String value = new String("1. : ȫ�浿");
		stack.add(value);
		stack.add( new String("2. : �̼���"));
		stack.add("3. �ָ�");



//		System.out.println("==> ����� Data ���� : " + stack.size());
//		String str1 = stack.pop();
//		System.out.println(str1);


		System.out.println("==> ����� Data ���� : " + stack.size());
		String str1 = stack.remove();
		System.out.println(str1);


//		System.out.println("==> ����� Data ���� : " + stack.size());
//		String str2 = stack.peek(); //==> pop(), peek() ��������?
//		System.out.println(str2);

		System.out.println("==> ����� Data ���� : " + stack.size());
		String str2 = stack.get(2); //==> pop(), peek() ��������?
		System.out.println(str2);



//		System.out.println("==> ����� Data ���� : " + stack.size());
//		while( !stack.isEmpty()){
//			String str3 = (String)stack.pop();
//			System.out.println(str3);
//		}
		
		System.out.println("==> ����� Data ���� : " + stack.size());
		while( !stack.isEmpty() ){
			String str3 = stack.remove();
			System.out.println(str3);
		}



	}//end of main

}//end of class