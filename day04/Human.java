//package jb04.park02;
// �߻�ȭ ������ ����, �Ϲ����� ������ �𵨸�

public class Human{
	//Field
	String name;
	int age;

	//Constructor
	public Human(){
		System.out.println("Human class default Constructor");
	}

	public Human(String str){
		System.out.println("Human class�� name�� �޴� Constructor");
		name = str;
	}

	//Method :: setter method
	public void setName(String str){
		name = str;
	}
	public void setAge(int b){
		age = b;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}



} //class