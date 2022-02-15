//package jb04.part01;

public class Bank03{
	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String uesrName;

	//Constructor
	public Bank03(){
		
	}
	public Bank03(String[] str){
		validate(str); // ���ڰ� ����
		initialize(str); // Field �ʱ�ȭ
		work(); // commad�� ����� �Ǵ��Ͽ� �ش� method ȣ��
		displayMoney(); // �ܾ�ǥ��
	}

	//���ڰ� ����
	public void validate(String args[]){
		//data ��ȿ�� �˻�
		if(!(args.length == 2 || args.length ==4) ) {
			System.out.println("[usage]:: java Bank03 [costomerName][bankName][option][money] ");
			System.out.println("[usage]:: option�� Ȯ���ϼ���. 1. �Ա� / 2. ���");
			System.exit(0);
		}
		if(args.length != 2 && Integer.parseInt(args[2]) != 1 && Integer.parseInt(args[2]) != 2){
			System.out.println("[usage]:: java Bank03 [costomerName][bankName][option][money] ");
			System.out.println("[usage]:: option�� Ȯ���ϼ���. 1. �Ա� / 2. ���");
			System.exit(0);
		}
	}
//Field �� �ʱ�ȭ ��Ű�� Method
public void initialize(String[] value){
	userName = value[0];
	bankName = value[1];
	if(value.length == 4){
		command = Integer.parseInt(value[2]);
		money = Integer.parseInt(value[3]);
	}
	 System.out.println(userName + "���� �ְŷ� ������ " + bankName + "�Դϴ�.");
}

// ������� �Ǵ� �� ���� method ȣ��
public void work(){
	if(command == 1){
		doposit();
	}else if(command ==2){
		withdrawal();
	}
}

// �Ա� ����
public void deposit(){
	balance += money;
	System.out.println(money + "���� �Ա���.");
}
// ��� ����
public void withdrawal(){
	balance -= money;
	System.out.println(money + "���� �����.");
}
// �ܾ�
public void displayMoney(){
	System.out.println("���� �ݾ��� : " + balance + "�Դϴ�.");
}
//main method
public static void main(String[] args){
	new Bank03(args);
}


}//class