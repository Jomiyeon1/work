//package jb05.part03;

/*
	1.TopSecret02.class가 중요한 class라면 modifier를 통해 상속할 수 없도록 했으며
	2. secretNo를 readOlny를 명확히 함
	   또한 중요한 class라면 객체 생성을 불가능하게 한다.
	   	==> 아래 coding을 이해하자. 생성자를 외부에서 접근하지 못하게 private 선언.
		    ex> java.langSystem.class의 소스와 API를 통해 확인
	3. static method를 통해 인스턴스를 리턴할 수 있도록한다.
	     ==> 단, 조건을 만족한 경우만 인스턴스를 return함
*/

//final modifier를 활용 상속 불가.
final class TopSecret04{
	//access modifier를 활용한 information hiding
	// fianl modifier를 활용한 수정불가
	private final int secretNo = 7777;
	
	//Access modifier를 통한 객체생성 불가.(private Constructor을 사용한 이유 이해
	private TopSecret04(){
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
//static method를 이용한 instance return 하게하여 다른 class에서 사용가능함.
// managerNk를 인자로 받아 Instance 를 return할 것인지를 판단

	public static TopSecret04 getInstance(int managerNo){
		if(managerNo ==1234){
			return new TopSecret04();
		}else{
			return null;
		}
	}

}//final class

public class ModifierTest04{
	//main
	public static void main(String[] args){
		//instance 생성불가로 static method를 통해 인스턴스 return받는다.
		// 또한 instance를 return받는 경우도 조건(managerNo)를 충족해야함.

		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));

		// ModifierTest01.class ~ ModifierTest04.class까지 변경하면서
		// Access Modifier 와 modifier의 사용 활용을 이해하자.
	}//end of main
}// end of class