import java.util.Scanner;

class javaExample2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� ���ϴ� ���� ���ڸ� �Է����ּ���. :");
		int dan = scanner.nextInt();

		// 1~9������ ���� �Է��� �ƴҰ��, ���Է¹ޱ�.
		while(dan < 0 || dan >9 ){
		System.out.println("�߸��Է��ϼ̽��ϴ�. 1 ~ 9 ������ ���ڸ� �ٽ� �Է����ּ���. :");
		dan = scanner.nextInt();
		} 
		System.out.println(dan + "���� ����մϴ�.");

		for(int i = 1; i < 10; i++){
			System.out.println( dan + " * " + i + " = " + dan*i);
		}
	}//main
} // class
