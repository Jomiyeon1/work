// package jb03.part05;

class Developer1
{
	//Field
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer;
	// 변수 선언만 했을 경우, 출력해보면 오류가 뜬다. 
	// 초기값은 0이라고 하나, 출력은 안되는듯?

	public void participateProject(){
		System.out.println("프로그램 개발로 수입 증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}

	/* 추가된 method (OverLoading Method) ======================
	* project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
	  1. income을 1 증가
	  2. projectCareer 를 1 증가
	   행위 및 참여 project의 name을 디스플레이하는 행위	
	*/
	
	public void participateProject(String project){
		System.out.println( project + "==> project 참여로 수입 증가, 경력쌓음.");
		avgIncome++;
		projectCareer++;

	}

	// 강의를 통해 수입의 증가 => income 1 증가 행위

	public void instruct(){
		System.out.println("강의를 통한 수입 증가");
		avgIncome++;

	}


	// 추가된 method(OverLoading Method)
	// 강의를 통해 수입의 증가
	// 강의 수에 따라 income 증가 행위

	public void instruct(int lectureCount){
		System.out.println(lectureCount + "개 강의를 통한 수입 증가");
		avgIncome += lectureCount;
	}

}//class
