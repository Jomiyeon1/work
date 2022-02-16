//package jb05.part03;

/*
	TopSecret01.class는 secretNo는 중요한 attribute이다.
	그러나 누구나 접근 및 변경이 가능함.
	=>Access Modifier를 통한 information hiding과 method를 통한 접근.
*/

class TopSecret02{
	//access modifier 를 활용한 information hiding
	//private 접근 제어를 사용하여 직접 접근할 수 없도록하고 getter Method를 통해 접근
	private int secretNo = 7777;

	public TopSecret02(){
		
	}
	//getter Method
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	} 
}//end of class

public class ModifierTest02{
	///main
	public static void main(String[] args){
		TopSecret02 topSecret = new TopSecret02();
		/*
			private Field는 information hiding 되어 있어 접근 및 변경이 불가
			Method를 통해 접근만 가능/ 변경불가
		*/
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo(0));
	}///end of main

}//end of class