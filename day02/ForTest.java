//package jb02.part02;

class ForTest 
{
	public static void main(String[] args) 
	{

		int j = 5;
		System.out.println(j + "단을 출력합니다.");
		
		for(int i = 1; i<10; i++){
		System.out.println(j + " * " + i + " = " + j*i);
		}

		 for( ; ; ){
		 System.out.println("여기는 반복문 내부의 무한 루프");
		 }
		
	} // end of main
} // end of class
