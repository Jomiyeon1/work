//package jb02.part05;

/*
	<<Inner Member Class>>
	1. innerMember Class는 class를 구성하는 Field, method와 같이 Class가 구성하는 Member가 될 수 있다.
	2. 사용이유는 : OuterClass와 밀접한 관련
	3. 컴파일 후 innerClass는 어떤 형태의 class가 되는지 확인(~~~$~~~.class)
*/

public class OuterClass01{

	//Field
	private String outer = "OuterClass의 Field";
	
	//Constructor
	public OuterClass01(){
	}

	//Method
	public void outerMethod(){
		System.out.println("::" + this.getClass().getName() + "start..");
		//innerClass에 접근할 경우 인스턴스 생성 후 접근
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::" + this.getClass().getName() + "end...");
	}

	//InnerMember Class
	public class InnerClass{
		//Field
		private String inner = "InnerClass 의 Field";
		//Contructor
		public InnerClass(){
		}

		//Method
		public void innerMethod(){
		//innerClass에서 out class로 접근
		//OuterClass의 Field, method에 쉽게 접근 :: 레퍼런스 불필요
		System.out.println("==> " + this.getClass().getName()+ "start..");
		//==> OuterClass의 Field 접근 방식 2가지
		System.out.println(outer);
		System.out.println(OuterClass01.this.outer);
		//==> 아래의 실행문을 주석을 풀면 compile error이 발생한다 이유는..
		//System.out.println(this.outer);
		System.out.println(inner);
		System.out.println("==> " + this.getClass().getName() + "End...");
		}
	}//inner class

	//main
	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}
}//end of class