//package jb05.part03;
/*
	1. TopSecret02.class가 중요한 class라면 modifier를 통해 상속할 수 없도록 했으며
	2. secretNo를 readOnly를 명확히함
	   또한 중요한 class라면 객체 생성을 불가능하게 한다.
	    ==> 아래의 coding을 이해하자. 생성자를 외부에서 접근하지 못하게 private선언.
		    ex>java.lang.System.class 의 소스와 API를 통해 확인
	3. static method를 통해 인스턴스를 리턴할 수 있도록한다.
*/

//final modifier : 상속불가
final class TopSecret03{
	//access modifier를 활용한 information hiding
	//final modifier를 활용한 수정불가
	private final int secretNo = 7777;

	//Access modifier를 통한 객체생성 불가.(private Constructor을 사용한 이유 이해
	private TopSecret03(){
	}

	//getter
	// => method를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd){
		if(pwd ==0){
			return secretNo;
		}else{
			return 0;
		}
	}

//static method를 이용한 instance return하게하여 다른 class에서 사용가능하게 함
	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
	//return new TopSecret03();
	}
}//end of class

public class ModifierTest03{
	//main
	public static void main(String[] args){
		//생성자가 private로 instance 생성.(생성자 호출)불가능
		//TopSecret topSecret = new TopSecret();

		//instance 생성을 불가로 static method를 통해 객체를 return 받는다.
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
	}


} // end of class