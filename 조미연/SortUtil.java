//package february.miyeon17;

public class SortUtil {
	
	public int[] ascending(int[] inputNumber[]) {
		int temp = 0;
		
		for(int i = 0; i < inputNumber.length; i++) {
			for(int j = (i+1); j < inputNumber.length; j ++) {
				if(inputNumber[i] > inputNumber[j]) {
					temp = inputNumber[i];
					inputNumber[j] = inputNumber[i];
					inputNumber[i] = temp;
				} // if
				
			}//end of for > j
			
			
		}//end for > i
		
		
		return inputNumber;
	}

	
	//main
	public static void main(String[] args) {
		
		SortUtil util = new SortUtil();
		int[] numbers = new int[] {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		
		numbers = util.ascending(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
			if( i != numbers.length-1) {
				System.out.print(", ");
				
			}else{
				System.out.println("");
				
			}
			System.out.println("Successful!!!");
		}

	}//end of main

}//end of class
