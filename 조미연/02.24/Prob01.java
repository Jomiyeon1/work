public class Prob01{
	
	//method
	public class Util{

		//���ڷ� ���� limit���� �Ҽ��� ������ return�ϴ� Method
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

		//���ڷ� ���� limit���� �Ҽ����� �迭ũ�⸦ ���� int �迭�� ��� return�ϴ� Method
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
		System.out.println("1 ~ " + limit + "������ �Ҽ��� ������ " + primeCount +"EA�̸� �Ҽ��� �Ʒ��� ����.");
		System.out.println("/////////////////////////////////////////////");

//		int[] primeArray = util.findPrimeReturnArray(limit);

//		for(int i = 0; i < primeArray.length; i++){
//			System.out.print(primeArray[i] + ( (primeArray.length - 1) != i ? "," : " "));
//		}

	}
}