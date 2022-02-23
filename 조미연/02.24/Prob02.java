public class Prob02{
	//method
	public String leftPad(String str, int size, char padChar){
		
		
		if(str.length() > size){
			return str;
		}
		
	}//end of method


	//main
	public static void main(String args[]){
		
		Prob02 prob03 = new Prob02();

		System.out.println(prob03.leftPad("ABC",6,'#'));
		System.out.println(prob03.leftPad("ABC",5,'$'));
		System.out.println(prob03.leftPad("ABC",2,'&'));

	}//end of main
}//end of class