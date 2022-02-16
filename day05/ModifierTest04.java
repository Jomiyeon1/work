//package jb05.part03;

/*
	1.TopSecret02.class�� �߿��� class��� modifier�� ���� ����� �� ������ ������
	2. secretNo�� readOlny�� ��Ȯ�� ��
	   ���� �߿��� class��� ��ü ������ �Ұ����ϰ� �Ѵ�.
	   	==> �Ʒ� coding�� ��������. �����ڸ� �ܺο��� �������� ���ϰ� private ����.
		    ex> java.langSystem.class�� �ҽ��� API�� ���� Ȯ��
	3. static method�� ���� �ν��Ͻ��� ������ �� �ֵ����Ѵ�.
	     ==> ��, ������ ������ ��츸 �ν��Ͻ��� return��
*/

//final modifier�� Ȱ�� ��� �Ұ�.
final class TopSecret04{
	//access modifier�� Ȱ���� information hiding
	// fianl modifier�� Ȱ���� �����Ұ�
	private final int secretNo = 7777;
	
	//Access modifier�� ���� ��ü���� �Ұ�.(private Constructor�� ����� ���� ����
	private TopSecret04(){
	}

	//getter
	// => method�� ���� ������ ������ ��츸 secretNo�� return
	public int getSecretNo(int pwd){
		if(pwd ==0){
			return secretNo;
		}else{
			return 0;
		}
	}
//static method�� �̿��� instance return �ϰ��Ͽ� �ٸ� class���� ��밡����.
// managerNk�� ���ڷ� �޾� Instance �� return�� �������� �Ǵ�

	public static TopSecret04 getInstance(int managerNo){
		if(managerNo ==1234){
			return new TopSecret04();
		}else{
			return null;
		}
	}

}//final class

public class ModifierTest04{
	//main
	public static void main(String[] args){
		//instance �����Ұ��� static method�� ���� �ν��Ͻ� return�޴´�.
		// ���� instance�� return�޴� ��쵵 ����(managerNo)�� �����ؾ���.

		TopSecret04 topSecret = TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo(0));

		// ModifierTest01.class ~ ModifierTest04.class���� �����ϸ鼭
		// Access Modifier �� modifier�� ��� Ȱ���� ��������.
	}//end of main
}// end of class