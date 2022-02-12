//package jb03.part04

class MethodSyntaxTestApp {
	public static void main(String[] args) 
		{
		MethodSyntax methodSyntax = new MethodSyntax();


		System.out.println("\n===================================");
		methodSyntax.browerOn();

		System.out.println("\n===================================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc 직업 유무 :"+result);
		
		System.out.println("\n===================================");
		int value = methodSyntax.sum(1,1);
		System.out.println("계산 결과 값: " + value);
		//위 코드와 같은 내용임. 출력 결과 확인 하단의 주석 풀고 확인할 것.
		//System.out.println("계산 결과 값: " + methodSytax.sum(1.1));

		System.out.println("\n===================================");
		String name = methodSyntax.getName();
		System.out.println("Field정보 name : " + name);
		//위 코드와 같은 내용임. 출력 결과 하단의 주석 풀고 확인 할 것.
		//System.out.println("Field정보 name : " + methodSyntax.getName());

		System.out.println("\n===================================");
		String add = methodSyntax.getAdd();
		System.out.println("Field 정보 add : " + add);
		//Systemo.out.println("Field 정보 add : " + methodSyntax.getAdd());

		System.out.println("\n==========");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field정보 모두 출력");

		for(int i = 0 ; i < info.length ; i++ ){
			
			System.out.println( (i+1) + "번째 정보 :" + info[i] );
		}
		


	}//main
}//class
