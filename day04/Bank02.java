package jb04.part01;
// 입력받은 인자의 값에 따라 주거래 은행, 입금, 출금을 수행하는 Application

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

// 입금
public void deposit(){
	balance += money;
	System.out.println(money + "원을 입금함");
}

//출금
public void withdrawal(){
	balance -= money;
	System.out.println(money + "원을 출금함.");
}
//현재 금액을 display하는 method
public void displayMoney(){
	System.out.println("현재 금액은 : " + balance +"입니다.");
}
}//class