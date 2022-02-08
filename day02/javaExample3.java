import java.util.Scanner;

class javaExample3 
{
	public static void main(String[] args) 
	{
		//두 수를 입력받고, 두 사이 값의 합 구하기.
		// 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요. :");
		int i = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요. :");
		int j = sc.nextInt();

		//같은 값일 경우 다시 입력받기.
		while( i == j){
		System.out.println("같은 숫자는 입력할 수 없습니다. 다시 입력해주세요.");
		System.out.println("첫 번째 숫자를 입력해주세요. :");
		i = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요. :");
		j = sc.nextInt();
		} // while

		// 합계를 담을 변수 선언
		int sum = 0;

		//두 수 사이의 합계 구하기.
		// i > j 일경우
		if(i>j){ 			
			     for(int a = j; a<=i; a++){
			     sum += a;
				 } System.out.println(j + "~" + i + "의 합은" + sum + "입니다.");
			}else if(i<j){ 			
			for(int a = i; a<=j; a++){
			sum += a;
			}
				System.out.println(i + "~" + j + "의 합은" + sum + "입니다.");
		}//if   i>j
		
	} // main
} // class
