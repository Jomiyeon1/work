//package jb03.part08;

class User01 
{
	//Field
	String name = "ȫ�浿";
	int javaLevel = 0 ;

	//default Constructor
	//1. ClassName = MethodName
	//2.return Type�� ����.
	public User01(){
		System.out.println("Constructor Method");
	}

	//Method
	//getter Method definition
	public String getName(){
		return name;
	}
	public int getJavaLevel(){
		return javaLevel;
	}

	//main method
	public static void main(String[] args) {
		
		System.out.println("==================");
		User01 user = new User01();
		System.out.println("==================");


		//��� ����� Ȯ���ϰ� �Ʒ��� �ּ��� Ǯ�� Ȯ��
/*		System.out.println("=================");
		User01 user;
		System.out.println("=================");
		User = new User01();
		System.out.println("=================");
		new User01();
		System.out.println("=================");

*/


		System.out.println("name : " + user.getName());
		System.out.println("javaLevel : " + user.getJavaLevel());
	}//main
}//class