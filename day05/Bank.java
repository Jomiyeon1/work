//package jb05.part08;

// 1. abstract class �� intreface(����� ����)�� �޸� �Ϲ� ���� method�� Field�� ���� �� �ִ�.

public abstract class Bank{
	//Field
	private String name;

	//Constructer
	public Bank(){		
	}
	public Bank(String name){
		this.name = name;
	}

	//Method
	//������� ����ϴ� display method�� �߻� Method�� ����
	public abstract void display();
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
	
	
}//end of class