import java.util.Scanner;

public class Prob01
{
	public static void main(String[] args) 
	{
		// ���α׷� ���� �� ����� �Ű������� �Է¹��� ���ڸ� �̿��Ͽ�
		// �ش� ���ڸ� �������� ���ﰢ�� ����� '*'�� �ܼ�â�� ����Ͻÿ�.
		//1. ���ڸ� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� ū Ȧ���� �Է����ּ���. >> ");
		int i = sc.nextInt();

		// �߸��� �� �ɷ��ֱ�.
		if(i < 1 || i % 2 == 0){
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
			return;
		}
		//2. ������ ������ŭ * ��� �� �� ����(println)�� -2�� ��ŭ�� �� ��� && ��� ����.
		int j = 1;
/*		for( ;i < j-1;i--){
			System.out.print("*");
		
		}

*/
/*		while(i == j){
			System.out.print("*");
			i--;

		}
*/
		while(true){
			i--;
			if( i < 0){
			System.out.println("��!");
			break;

			}
		}


	}///main
}///class
