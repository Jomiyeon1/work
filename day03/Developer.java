//package jb03.part03;

class Developer 
{

		//Fiels ==> 특성, 속성(attribute) 표현
		String name = "홍길동";
		String job = "개발자";
		int avgIncome = 100;
		int projectCareer; // <== Field 선언만 한 경우(변수를 선언만 한 경우) 초기화 유무는?
		// System.out.println(projectCareer); int 초기값이 없어 에러남.
		
		//Method => 기능, 행위(behavior)표현


		public void participateProject(){
			System.out.println("프로그램 개발로 수입증가, 경력쌓음)");
				avgIncome++;
				projectCareer++;
		
		}//수입증가, 경력쌓음 void



		public void instruct(){
			System.out.println("강의를 통한 수입증가");
			avgIncome++;
		
		}//강의 수입 증가 void


	
} //class
