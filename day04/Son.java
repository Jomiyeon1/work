//package jb04.part02;
// iam.class 와 일반화관계
// iam.class 와 속성과 행위를 공유하며 추가적 구체적인 속성, 행위를 갖는다.


class Son extends Iam{
	//Field
	String school;

	//Constructor
	public Son(){
		System.out.println("Son class default Constructor");
	}

	// setter
	public void setSchool(String str){
		school = str;
	}

	//getter
	public String getSchool(){
		return school;
	}

	//mian method
	public static void main(String[] args) {
		Son son = new Son();

		son.setName("홍길동 이름");
		son.setAge(50);
		son.setJob("개발자준비중");
		son.setSchool("아이티교육센터");
		
		System.out.println("이름 : " + son.getName());
		System.out.println("나이 : " + son.getAge());
		System.out.println("직업 : " + son.getJob());
		System.out.println("소속 : " + son.getSchool());

	} // mian
}//class
