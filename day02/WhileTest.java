//package jb02.part02;

class  WhileTest
{
	public static void main(String[] args) 
	{
		//while문
		int i = 0;
		while(i < 10){
		System.out.println("여기는 while문 내부안임 i = " + i);
		i++;
		}

		//do while문
		int j = 0;
		do{
		System.out.println("\n\t 여기는 do문 내부임 j = " + j);
		j++;
		}while(j<1);
		System.out.println("\n=============================\n");

		//while문을 이용해 5단을 출력하는 프로그램
		int k = 1;
		while(k<10){
			System.out.println("5 * " + k + " = " + 5*k);
			k++;
		}

		//무한루프 compile error이해
		while(true){
		System.out.println("여기는 반복문내부의 무한루프");
		}


	}//end of main
}//end of class
