import java.util.Scanner;

class Prob03 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");

		int inputInt = keyboard.nextInt();
		
		if(inputInt < 1 || inputInt > 10){
			System.out.println("잘못된 숫자가 입력되었습니다..");
			return;
		}//if
		for(int i = 1; i < inputInt+1 ; i++){
			System.out.println( i + "! = " + i*(i+1) ); 

		}//for

	}//main
}//class
