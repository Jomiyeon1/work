//package jb05.part03;

/*
	TopSecret01.class�� secretNo�� �߿��� attribute�̴�.
	�׷��� ������ ���� �� ������ ������.
	=>Access Modifier�� ���� information hiding�� method�� ���� ����.
*/

class TopSecret02{
	//access modifier �� Ȱ���� information hiding
	//private ���� ��� ����Ͽ� ���� ������ �� �������ϰ� getter Method�� ���� ����
	private int secretNo = 7777;

	public TopSecret02(){
		
	}
	//getter Method
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	} 
}//end of class

public class ModifierTest02{
	///main
	public static void main(String[] args){
		TopSecret02 topSecret = new TopSecret02();
		/*
			private Field�� information hiding �Ǿ� �־� ���� �� ������ �Ұ�
			Method�� ���� ���ٸ� ����/ ����Ұ�
		*/
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo(0));
	}///end of main

}//end of class