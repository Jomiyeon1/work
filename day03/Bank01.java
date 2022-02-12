//package jb03.part08.hw;

// 입력받은 인자의 값에 따라 주거래 은행, 입금 행위를 수행하는 Application
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
		System.out.println( money + "원을 입금함.");
	}
	// 현재 금액을 출력하는 method
	public void displayMoney(){
		System.out.println("현재 잔고는 : " + balance +"입니다.");
	}
	//getter/setter method생략.====================

	//main Method
	public static void main(String[] args) {
		//입력 data의 유효성 check.
		if(args.length < 2) {
		System.out.println("[usage]:: javaBank [customerName][bankName][option][money]");
		System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
		System.exit(0);
		}
	
		System.out.println(args[0] +"님의 주거래은행은 " + args[1] + "입니다.");
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
				System.out.println(" 인자값이 적거나, 많습니다.");
			break;
		}
	
		b.displayMoney();
	
	}//main
}//class
