import java.util.Scanner;

public class Rectangle
{
}

public class TestRectangle{
	//Field
	int width;
	int length;
	String color;
	int area; // 넓이
	int perimiter; // 둘레

	//======================
	int width2;
	int length2;
	String color2;
	int area2; // 넓이
	int perimiter2; // 둘레

	public TestRectangle(){
	}
	
	//첫번째 setter
	public void setWidth(int width, int length, String color){
		this.width = width;
		this.length = length;
		this.color = color;
	}

	//두번째 setter
	public void setWidth(int width, int length, String color){
		this.width = width;
		this.length = length;
		this.color = color;
	}
		



	//main
	public static void main(String s[]){
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로");
		rec1.setLength(keyboard.nextInt());

		//================== 두번째 사각형 출력
		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로");
		rec2.setLength(keyboard.nextInt());

		//넓이와 둘레 출력
		System.out.println(rec1.getColor() + "직사각형의 넓이는" + rec1.area()+"이고, 둘레는 "+ rec1.perimter() + "입니다");
		System.out.println(rec2.getColor() + "직사각형의 넓이는" + rec2.area()+"이고, 둘레는 "+ rec2.perimter() + "입니다");


		// 두 직사각형의 넓이 비교

		//두 직사각형의 둘레 비교

	}//main

}// end of class