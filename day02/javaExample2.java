import java.util.Scanner;

class javaExample2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력을 원하는 단의 숫자를 입력해주세요. :");
		int dan = scanner.nextInt();

		// 1~9사이의 숫자 입력이 아닐경우, 재입력받기.
		while(dan < 0 || dan >9 ){
		System.out.println("잘못입력하셨습니다. 1 ~ 9 사이의 숫자를 다시 입력해주세요. :");
		dan = scanner.nextInt();
		} 
		System.out.println(dan + "단을 출력합니다.");

		for(int i = 1; i < 10; i++){
			System.out.println( dan + " * " + i + " = " + dan*i);
		}
	}//main
} // class
