//package jb02.park03;

class ContinueTest 
{
	public static void main(String[] args) 
	{
		int inputData = Integer.parseInt(args[0]);

		int sum = 0;

			for(int i = 0; i <= inputData; i++){
				if(i % 2 ==1){
					continue;
				}//if( i % 2 ==1)
				sum = sum + i;
			}// for

			System.out.println(" 0 ~ " + inputData + "까지의 짝수의 합은 " + sum);

	} // main
} // class
