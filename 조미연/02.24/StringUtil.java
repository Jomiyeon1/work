public class StringUtil{
	private static String replaceString(String[] arr){
		int count = 0;
		String result = "";

		for(int i = 0; i < arr.length(); i++){
		
			char c = arr.charAt(i);
			if(c == 'a'){
				String newchar = arr.replace('a','A');
				count++;

			}

		}//for i
		//arr = arr.replace('a','A');
		return result;
	}

	//main
	public static void main(String[] args){
		
		String[] arr ={"Java program", "array", "java Program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : " + result);
	}//end of main

}//end of class