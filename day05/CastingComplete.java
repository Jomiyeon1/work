//package jb05.part06;

/*
	1. Primitive type 형변환(묵시적/명시적) : data의 크기
	2. Reference type 형변환(묵시적/명시적) : 개념의 크기(추상화 정도)
	★★객체의 형변환 조건 : ~~ is a ~~ Relationship★★ !! 중요 !!
*/

//상위 class super 정의
class Super{
	//Method
	public void a(){
		System.out.println("Super : a()");
	}
}//end of class

// 상위 class Super를 상속받는 하위 class Sub 정의
class Sub extends Super{
		public void a(){
			System.out.println("overriding된 Sub : a()");
		}
		public void b(){
		System.out.println("overriding된 Sub : a()");
	}
} // end of class

public class CastingComplete{
	//main Method
	public static void main(String args[]){
		// 1. 상위 class 인스턴스 생성(Data type == 인수턴스 의 경우)
		System.out.println("\n 여기는 Super s1 = new Super() 부분");
		Super s1 = new Super();
		s1.a();

		// 2. 하위 class 인스턴스 생성 (Data type == 인스턴스의 경우)
		System.out.println("\n 여기는 Sub s2 = new Sub() 부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		// 3. 상위 data type 으로 하위 인스턴스 생성 (Data type != 인스턴스)
		System.out.println("\n 여기는 Super s3 = new Sub() 부분");
		Super s3 = new Sub(); // <= 묵시적 형변환
		s3.a();
		
		//아래의 사항은 error이 발생한다. s3은 b()를 참조할 수 없다.
		// ★ 꼭! 이해할 것!!!! ★
		//s3.b();
		//s3.b();를 사용하려면 ==> casting 연산자 사용(즉 자신의 원상태복귀(???))
		System.out.println("\n s3은 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3; // <= casting 연산자를 이용 명시적 형변환
		sub.b();

		// 4. 하위 data type으로 상위 인스턴스 생성 (Data type != 인스턴스)
		// error 부위 ( 하위 레퍼런스 변수는 상위 인스턴스를 레퍼런스할 수 없다.)
		// Sub s4 = new Super();

 

	}

} // end of public class

