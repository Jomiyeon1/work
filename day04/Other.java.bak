// package jb04.part07;

public class Other{
	//Field
	String name = "홍길동";
	String job = new String("개발자");
	// 위 String Data Type 의 name job 상태값을 정의한 것을 이해한다면..
	// Other.class Has A String.class ( ~~~ Has A ~~ : Assocation Relation)
	// 아래의 Father Data Type 와 Other 간의 관계는..

	Father owner = new Father(); // ==> Father 인스턴스 생성

	//Constructor
	public Other(){
		System.out.println(this.owner.name); // public String name = "홍길동";
		System.out.println(owner.bank);  //protected String bank = "한양은행";
		System.out.println(owner.branch); // String branch = "역삼동지점";
		// System.out.println(f.password); //private int password = 1234;

		//Field는 Method를 이용 접근
		System.out.println("은행 비밀번호 : " + this.owner.getPassword(0));

	}

}