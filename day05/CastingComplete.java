//package jb05.part06;

/*
	1. Primitive type ����ȯ(������/������) : data�� ũ��
	2. Reference type ����ȯ(������/������) : ������ ũ��(�߻�ȭ ����)
	�ڡڰ�ü�� ����ȯ ���� : ~~ is a ~~ Relationship�ڡ� !! �߿� !!
*/

//���� class super ����
class Super{
	//Method
	public void a(){
		System.out.println("Super : a()");
	}
}//end of class

// ���� class Super�� ��ӹ޴� ���� class Sub ����
class Sub extends Super{
		public void a(){
			System.out.println("overriding�� Sub : a()");
		}
		public void b(){
		System.out.println("overriding�� Sub : a()");
	}
} // end of class

public class CastingComplete{
	//main Method
	public static void main(String args[]){
		// 1. ���� class �ν��Ͻ� ����(Data type == �μ��Ͻ� �� ���)
		System.out.println("\n ����� Super s1 = new Super() �κ�");
		Super s1 = new Super();
		s1.a();

		// 2. ���� class �ν��Ͻ� ���� (Data type == �ν��Ͻ��� ���)
		System.out.println("\n ����� Sub s2 = new Sub() �κ�");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		// 3. ���� data type ���� ���� �ν��Ͻ� ���� (Data type != �ν��Ͻ�)
		System.out.println("\n ����� Super s3 = new Sub() �κ�");
		Super s3 = new Sub(); // <= ������ ����ȯ
		s3.a();
		
		//�Ʒ��� ������ error�� �߻��Ѵ�. s3�� b()�� ������ �� ����.
		// �� ��! ������ ��!!!! ��
		//s3.b();
		//s3.b();�� ����Ϸ��� ==> casting ������ ���(�� �ڽ��� �����º���(???))
		System.out.println("\n s3�� b()�� ���� �Ұ��ϴ�.");
		System.out.println("casting �����ڸ� �̿� Sub sub = (Sub)s3 ������ ����ȯ");
		Sub sub = (Sub)s3; // <= casting �����ڸ� �̿� ������ ����ȯ
		sub.b();

		// 4. ���� data type���� ���� �ν��Ͻ� ���� (Data type != �ν��Ͻ�)
		// error ���� ( ���� ���۷��� ������ ���� �ν��Ͻ��� ���۷����� �� ����.)
		// Sub s4 = new Super();

 

	}

} // end of public class
