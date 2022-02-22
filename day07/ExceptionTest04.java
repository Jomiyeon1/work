//package jp02.part02;
/*
	java ExceptionTest 10 20 0 실행시 3번째 인자값이 0이면 실행시 문제발생.
	> 출력 결과(실행시 에러)읽고 출력결과 확인
	해결 1. try{}catch()로 문제(Exception:: 예외) 발생사항 처리. 정상종료
	해결 2. throws로 JVM에서 던지듯 호출한(문제를 발생시킨)곳으로 발생한 Exception을 던진다
			(?, 위임). (어디로? 호출한 곳.(문제 유발한 곳))
    ----------------------------------------------------------------------------------------
	해결 3. JVM에서 던지건, program 내부에서 throws 하던 Exception(예외처리)의 해결책은 try- catch

*/

public class ExceptionTest04{
	//Field
	private int sum;
	private int avg;

	//Contructor
	public ExceptionTest04(){
	}

	//Method
	public void sum(int x, int y){
		System.out.println("1. ==> 시작");
		sum = x + y;
		System.out.println("1. ==> 합 : " + sum);
		System.out.println("1. ==> sum 끝");
	}
	//JVM에서 던진 AritmethicException을 다시 자신을 호출한 곳으로 던진(?, 위임)다.
	public void avg(int z) throws ArithmeticException{
		System.out.println("2. ==> avg시작");
		//z = 0 인경우 불능
		avg = sum/z;
		System.out.println("평균 : " + avg);
		System.out.println("2. ==> avg끝");
	}
	//main
public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i, j);
		
		//JVM에서 던지건 program에서 throws하던 Exception(예외처리)dml gorufcordms try-catch
		try{
			et.avg(k);
		}catch(ArithmeticException e){ // 현재 라인을 주석처리하고 아래를 주석풀고 실행하면?
		//}catch(Exception e){		  //  Exception e = new ArithmeticException() 가능?
		
		System.out.println("1. >> ================================");
		System.out.println("et.avg(k)에서 Exception이 발생한 모양");
		System.out.println("2. >> ================================");
		System.out.println(e);
		System.out.println("3. >> ================================");
		e.printStackTrace();
		System.out.println("4. >> ================================");

		}
		System.out.println("main Method End....");

}//end of main



}//end of class
