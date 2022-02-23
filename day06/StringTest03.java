//package jb01.part03;

//각각의 method를 API에 확인하고, 출력결과를 확인.

public class StringTest03{
	//main
	public static void main(String[] args){
		String name = "012ABCedf";
		String hi = "Hi !";

		String s1 = hi.concat(name);
		System.out.println(s1);

		System.out.println("=========================");


		String s2 = s1.substring(7);
		System.out.println(s2);

		System.out.println("=========================");


		int a = name.indexOf("ABC");
		System.out.println(a);
		System.out.println(name.substring(a));

		System.out.println("=========================");

		int b = name.indexOf("ABC");
		System.out.println(b);
		System.out.println(name.substring(b));
		System.out.println(name.substring(b, 5));

		System.out.println("=========================");


		int c = name.indexOf("z");
		System.out.println(c);

	}
}//end of class