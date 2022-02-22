//package jb02.part05;

/*
	<<Inner Member Class>>
	1. innerMember Class�� class�� �����ϴ� Field, method�� ���� Class�� �����ϴ� Member�� �� �� �ִ�.
	2. ��������� : OuterClass�� ������ ����
	3. ������ �� innerClass�� � ������ class�� �Ǵ��� Ȯ��(~~~$~~~.class)
*/

public class OuterClass01{

	//Field
	private String outer = "OuterClass�� Field";
	
	//Constructor
	public OuterClass01(){
	}

	//Method
	public void outerMethod(){
		System.out.println("::" + this.getClass().getName() + "start..");
		//innerClass�� ������ ��� �ν��Ͻ� ���� �� ����
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::" + this.getClass().getName() + "end...");
	}

	//InnerMember Class
	public class InnerClass{
		//Field
		private String inner = "InnerClass �� Field";
		//Contructor
		public InnerClass(){
		}

		//Method
		public void innerMethod(){
		//innerClass���� out class�� ����
		//Outer
		}
	}//inner class
}//end of class