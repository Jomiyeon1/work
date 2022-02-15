//package jb04.part02;
// = Human.class 와 일반화 관계
// = Human.class와 속성과 행위를 공유하며 추가적, 구체적인 속성, 행위를 갖는다.

public class Iam extends Human{
	//Field
	String job;

	//Constructor
	public Iam(){
		System.out.println("Iam class default Constructor");
	}

	//method
	//setter
	public void setJob(String str){
		job = str;
	}
	//getter
	public String getJob(){
		return job;
	}



	public static void main(String[] args){
		//1. 아래의 인스턴스 생성시 출력 결과를 확인/이해
		//2. OOP의 일반화관계인 공유(속성, 행위)를 OOPL에서 어떻게 지원하는지 이해
		//3. 아래의 주석을 풀고 속성, 행위의 공유를 확인한다.
		Iam iam = new Iam();
/*
		iam.setName("홍길동");
		iam.setAge(100);
		iam.setJob("개발자");

		System.out.println("이름 : " + iam.getName());
		System.out.println("나이 : " + iam.getAge());
		System.out.println("직업 : " + iam.getJob());
*/
	
	}//main
}//class
