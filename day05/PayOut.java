//package jb05.part08;
/*
	1. ���� ������ �ϴ� ���̶�� ��ݾ���(���)�� �ʼ����
	2. ����, �ݰ�, ���� �� ������̳� ����� ������ ��ݾ���(���)�� interface ����
*/
public interface PayOut{
	//interface Field (member variable) => public static final Ư���� ���´�.
	public final static String payOut = "���";

	//interface method ==> public abstract Ư���� ���´�.
	public abstract void payOut(int money);
}//end of class