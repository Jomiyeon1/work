package jb04.part01;
// �Է¹��� ������ ���� ���� �ְŷ� ����, �Ա�, ����� �����ϴ� Application

public class Bank02{
	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	public Bank02(){
	}
	public Bank02(String[] str){
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
	}

	//method
	public void work(){
		if(command == 1){
		deposit();
	}else if(command == 2){
		withdrawal();
	}
	
}

// �Ա�
public void deposit(){
	balance += money;
	System.out.println(money + "���� �Ա���");
}

//���
public void withdrawal(){
	balance -= money;
	System.out.println(money + "���� �����.");
}
//���� �ݾ��� display�ϴ� method
public void displayMoney(){
	System.out.println("���� �ݾ��� : " + balance +"�Դϴ�.");
}
}//class