//package jb04.part01;

public class Bank03{
	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Constructor
	public Bank03(){
		
	}
	public Bank03(String[] str){
		validate(str); // 인자값 검증
		initialize(str); // Field 초기화
		work(); // commad가 입출금 판단하여 해당 method 호출
		displayMoney(); // 잔액표시
	}

	//인자값 검증
	public void validate(String args[]){
		//data 유효성 검사
		if(!(args.length == 2 || args.length ==4) ) {
			System.out.println("[usage]:: java Bank03 [costomerName][bankName][option][money] ");
			System.out.println("[usage]:: option을 확인하세요. 1. 입금 / 2. 출금");
			System.exit(0);
		}
		if(args.length != 2 && Integer.parseInt(args[2]) != 1 && Integer.parseInt(args[2]) != 2){
			System.out.println("[usage]:: java Bank03 [costomerName][bankName][option][money] ");
			System.out.println("[usage]:: option을 확인하세요. 1. 입금 / 2. 출금");
			System.exit(0);
		}
	}
//Field 를 초기화 시키는 Method
public void initialize(String[] value){
	userName = value[0];
	bankName = value[1];
	if(value.length == 4){
		command = Integer.parseInt(value[2]);
		money = Integer.parseInt(value[3]);
	}
	 System.out.println(userName + "님의 주거래 은행은 " + bankName + "입니다.");
}

// 입출금을 판단 후 관련 method 호출
public void work(){
	if(command == 1){
		deposit();
	}else if(command ==2){
		withdrawal();
	}
}

// 입금 수행
public void deposit(){
	balance += money;
	System.out.println(money + "원을 입금함.");
}
// 출금 수행
public void withdrawal(){
	balance -= money;
	System.out.println(money + "원을 출금함.");
}
// 잔액
public void displayMoney(){
	System.out.println("현재 금액은 : " + balance + "입니다.");
}
//main method
public static void main(String[] args){
	new Bank03(args);
}


}//class