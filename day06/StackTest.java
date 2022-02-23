//package jb01.part09;

import java.util.Stack;

/*
	java.util.Stack( Last In First Out)
	각각 아래의 API를 확인하고 Method의미를 확인
*/

public class StackTest{
	//main
	public static void main(String[] args){
		
		//Stack<String> stack = new Stack<String>();
		List<String> stack = new Stack<String>();
		
//		String value = new String("1. : 홍길동");
//		stack.push(value);
//		stack.push( new String("2. : 이순신"));
//		stack.push("3. 주몽");

				
		String value = new String("1. : 홍길동");
		stack.add(value);
		stack.add( new String("2. : 이순신"));
		stack.add("3. 주몽");



//		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
//		String str1 = stack.pop();
//		System.out.println(str1);


		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
		String str1 = stack.remove();
		System.out.println(str1);


//		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
//		String str2 = stack.peek(); //==> pop(), peek() 차이점은?
//		System.out.println(str2);

		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
		String str2 = stack.get(2); //==> pop(), peek() 차이점은?
		System.out.println(str2);



//		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
//		while( !stack.isEmpty()){
//			String str3 = (String)stack.pop();
//			System.out.println(str3);
//		}
		
		System.out.println("==> 저장된 Data 갯수 : " + stack.size());
		while( !stack.isEmpty() ){
			String str3 = stack.remove();
			System.out.println(str3);
		}



	}//end of main

}//end of class