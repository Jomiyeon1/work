//package jb05.part03;

/*
	1. ModifierTest01 ~ 04�� ���� class������ 
	   Modifer / Access Modifer ��� Ȱ��, ����Ǵ��� ���캸��..
	2. TopSecret01.class�� Access Modifier, Modifier�� ��� �����Ű������ ����
*/

class TopSecret01{
	///Field
	int secretNo = 7777;
	//Constructor
	public TopSecret01(){
		
	}

	///Method
	///getter
	public int getSecretNo(){
		return secretNo;
	}

}///end of class
//========================================================
public class ModifierTest01{
	//main
	public static void main(String[] args){
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

		// ==> secretNo �����ϸ�
		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());
	}//end of main
}//end of class

// TopSecret.class�� ������
// secretNo�� �߿��� attribute�̴�. �׷��� ������ ���� �� ������ ����.