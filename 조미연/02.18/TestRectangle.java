import java.util.Scanner;

public class Rectangle
{
}

public class TestRectangle{
	//Field
	int width;
	int length;
	String color;
	int area; // ����
	int perimiter; // �ѷ�

	//======================
	int width2;
	int length2;
	String color2;
	int area2; // ����
	int perimiter2; // �ѷ�

	public TestRectangle(){
	}
	
	//ù��° setter
	public void setWidth(int width, int length, String color){
		this.width = width;
		this.length = length;
		this.color = color;
	}

	//�ι�° setter
	public void setWidth(int width, int length, String color){
		this.width = width;
		this.length = length;
		this.color = color;
	}
		



	//main
	public static void main(String s[]){
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("ù��° ���簢���� ����");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����");
		rec1.setLength(keyboard.nextInt());

		//================== �ι�° �簢�� ���
		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setLength(keyboard.nextInt());

		//���̿� �ѷ� ���
		System.out.println(rec1.getColor() + "���簢���� ���̴�" + rec1.area()+"�̰�, �ѷ��� "+ rec1.perimter() + "�Դϴ�");
		System.out.println(rec2.getColor() + "���簢���� ���̴�" + rec2.area()+"�̰�, �ѷ��� "+ rec2.perimter() + "�Դϴ�");


		// �� ���簢���� ���� ��

		//�� ���簢���� �ѷ� ��

	}//main

}// end of class