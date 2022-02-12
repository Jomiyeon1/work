//package jb03.part08.hw;

// �Է¹��� ������ ���� ���� �ְŷ� ����, �Ա� ������ �����ϴ� Application
class Bank01 
{
	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Cinstructor
	public Bank01(){
	}

	public Bank01(String s1, String s2){
		bankName = s1;
		userName = s2;
	}
	public Bank01(String s1, String s2, String s3){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
	}
	public Bank01(String s1, String s2, String s3, String s4){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
		money = Integer.parseInt(s4);
	}

	//Method
	public void deposit(){
		balance += money;
		System.out.println( money + "���� �Ա���.");
	}
	// ���� �ݾ��� ����ϴ� method
	public void displayMoney(){
		System.out.println("���� �ܰ�� : " + balance +"�Դϴ�.");
	}
	//getter/setter method����.====================

	//main Method
	public static void main(String[] args) {
		//�Է� data�� ��ȿ�� check.
		if(args.length < 2) {
		System.out.println("[usage]:: javaBank [customerName][bankName][option][money]");
		System.out.println("[usage]:: ���ڰ��� �ּ� 2���� �ʿ��մϴ�.");
		System.exit(0);
		}
	
		System.out.println(args[0] +"���� �ְŷ������� " + args[1] + "�Դϴ�.");
		Bank01 b = new Bank01();

		switch(args.length){
			case 2 :
				b = new Bank01(args[0], args[1]);
				break;
			case 4 :
				b = new Bank01(args[0], args[1], args[2], args[3]);
				b.deposit();
				break;
			default : 
				System.out.println(" ���ڰ��� ���ų�, �����ϴ�.");
			break;
		}
	
		b.displayMoney();
	
	}//main
}//class
