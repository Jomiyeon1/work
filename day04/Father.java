//package jb04.part07;

/*
	1. Encapsulation(information hiding)�� �����ϴ� Accsee Modifier ����.
	2. public / protected /   / private �� ��� �� ����.
*/

public class Father{
	//Field
	public String name = "ȫ�浿"; // public  : ������ ���ٰ���.
	protected String bank = "�Ѿ�����"; // protected : ��Ӱ���. package ���ٰ���
	String branch = "���ﵿ����"; // (     ) : ���� package ���ٰ���
	private int password = 1234; // private �ڽŸ� ���ٰ���

	//Constructor
	public Father(){
		
	} 

	//Method
	public String getBank(int pwd){
		if(pwd != 7777){
			return "Ű���� ��Ȯ�� �Է��ϼ���.";
		}else{
			return this.bank;
		}
	}
	//�����й�ȣ�� �˱����� key�� �˰� ������ password�� return
	public int getPassword(int key){
		if(key != 7777){
			return 0;
		}else{
			return this.password;
		}
	}

	public String getName(){
		return name;
	}
	public String getBranch(){
		return branch;
	}
}//class