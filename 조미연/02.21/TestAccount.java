//Bean
public class Account{
	// Field
	String accNo;
	int balance;

	//Constructor
	public Account(){	
	}

	//setter method
	public void Account(String accNO){
		this.accNo = accNo;
	}
	//getter method
	///���¹�ȣ
	public void getAccNo(){
		System.out.print(accNo +"���°� �����Ǿ����ϴ�.");
	}
	//�ܾ�
	public int getBalance(){
		return balance;
	}

	//save method
	public int save(int balance){
		this.balance += balance;
		return this.balance;
	}
	
	//deposit method
	public int deposit(int balance){
		this.balance -= balance;
		return this.balance;
		
	}


}



//App
public class TestAccount{
	
//
	//main
	public static void main(String[] args) throws Exception{
		String accNo = null;
		int balance = 0;

		Account.accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		blance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�Դϴ�.");



	}
}//end of class



