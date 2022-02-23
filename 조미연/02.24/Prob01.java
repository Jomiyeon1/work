public class Prob01{
	
	//method
	public class Util{

		//인자로 받은 limit까지 소수의 갯수를 return하는 Method
		public int findPrimeCount(int limit){
			int num = 0;
			int count = 0;
			for(int i = 2; i < limit+1; i++){
				for( int j = 2; j < i + 1; j++){
					if( i % j == 0){
						num++;
					}//if
				}//for j
				if( num == 1){
					count++;			
				}//if
			}//for i
			return count;
		}

		//인자로 받은 limit까지 소수갯수 배열크기를 같는 int 배열에 담아 return하는 Method
		public int[] findPrimeReturnArray(int limit){
		
			return null;
		}
	}

//========================================

	//main
	public static void main(String[] args){
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1 ~ " + limit + "까지의 소수의 개수는 " + primeCount +"EA이며 소수는 아래와 같다.");
		System.out.println("/////////////////////////////////////////////");

//		int[] primeArray = util.findPrimeReturnArray(limit);

//		for(int i = 0; i < primeArray.length; i++){
//			System.out.print(primeArray[i] + ( (primeArray.length - 1) != i ? "," : " "));
//		}

	}
}