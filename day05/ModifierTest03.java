//package jb05.part03;
/*
	1. TopSecret02.class�� �߿��� class��� modifier�� ���� ����� �� ������ ������
	2. secretNo�� readOnly�� ��Ȯ����
	   ���� �߿��� class��� ��ü ������ �Ұ����ϰ� �Ѵ�.
	    ==> �Ʒ��� coding�� ��������. �����ڸ� �ܺο��� �������� ���ϰ� private����.
		    ex>java.lang.System.class �� �ҽ��� API�� ���� Ȯ��
	3. static method�� ���� �ν��Ͻ��� ������ �� �ֵ����Ѵ�.
*/

//final modifier : ��ӺҰ�
final class TopSecret03{
	//access modifier�� Ȱ���� information hiding
	//final modifier�� Ȱ���� �����Ұ�
	private final int secretNo = 7777;

	//Access modifier�� ���� ��ü���� �Ұ�.(private Constructor�� ����� ���� ����
	private TopSecret03(){
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

//static method�� �̿��� instance return�ϰ��Ͽ� �ٸ� class���� ��밡���ϰ� ��
	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
	//return new TopSecret03();
	}
}//end of class

public class ModifierTest03{
	//main
	public static void main(String[] args){
		//�����ڰ� private�� instance ����.(������ ȣ��)�Ұ���
		//TopSecret topSecret = new TopSecret();

		//instance ������ �Ұ��� static method�� ���� ��ü�� return �޴´�.
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
	}


} // end of class