import java.util.Scanner;

public class Prob01
{
	public static void main(String[] args) 
	{
		// 프로그램 실행 싱 명령행 매개변수로 입력받은 숫자를 이용하여
		// 해당 숫자를 기준으로 역삼각형 모양의 '*'을 콘솔창에 출력하시오.
		//1. 숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("0보다 큰 홀수를 입력해주세요. >> ");
		int i = sc.nextInt();

		// 잘못된 값 걸러주기.
		if(i < 1 || i % 2 == 0){
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
			return;
		}
		//2. 숫자의 개수만큼 * 출력 후 그 밑줄(println)에 -2개 만큼의 별 출력 && 가운데 정렬.
		
		for(int j = i ; j == 1 ; j--){
			System.out.print("*");
			System.out.println( j );
		
		}


		


	}
}///class
