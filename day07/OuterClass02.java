//package jp02.part05;

/*
	<<Inner local Class의 이해>>
	1. inner localClass는 method와 내부의 local variable와 같은 level
	2. 컴파일 후 innerClass는 어떤 형태의 class가 되는지 확인할 것. ( ~~~$~~~.class)
*/

public class OuterClass02{
	//Field
	private String outer = "outerClass의 Field";

	//Contructor
	public OuterClass02(){
	}

	//Method
	public void outerMethod(){
		System.out.println("::" + this.getClass().getName()+"start..");

		final String localVariable = "OuterClass 내의 outetMethod의 localVatiable";

		//Inner local Class
		class InnerLocalClass{
			//Field
			private String inner = "innerClass의 Field";
			//Constructor
			public InnerLocalClass(){
			}

			//Method
			public void innerMethod(){
				System.out.println("==>" + this.getClass().getName() + "start..");
				//innerClass에서 Outer에서 OuterClass접근하기
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==> " + this.getClass().getName() + "end...");
			}

		}//InnerLocalClass

		System.out.println("::" + this.getClass().getName() + "start..");
		//inner local class를 둘러썬 method에서 인스턴스 생성가능
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();
	}//end of method

	//main
	public static void main(String[] args){
	new OuterClass02().outerMethod();
	}//end of main
}//end of class