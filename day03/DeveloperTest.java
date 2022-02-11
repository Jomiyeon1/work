//package jb03.part03;

class DeveloperTest
{
	public static void main(String[] args) 
	{
		//Developer.class 를 instance화 함. ( keyword new사용 )
		Developer developer = new Developer();

		//developer 식별성을 갖는 Instance 연산자를 통해 사용.
		System.out.println("이름 : " +developer.name);
		System.out.println("직업 : " +developer.job);
		System.out.println("평균수입 : " + developer.avgIncome);
		System.out.println("PJT경력 : " + developer.projectCareer);

		System.out.println("===========================");


		//project에 참여
		developer.participateProject();
		System.out.println("평균 수입은 : " + developer.avgIncome);
		System.out.println("project 참여 경력은 : " + developer.avgIncome);

		System.out.println("==========================");

		//1개의 과목을강의
		deverloper.instruct();
		System.out.println("평균 수입은 : " + developer.avgIncome);



	}//main
} //class
