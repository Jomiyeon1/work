//package jb05.part08;
/*
	1. ���� ������ �ϴ� ���̶�� ��ݾ���(���)�� �ʼ����
	2. ����, �ݰ�, ���� �� ������̳� ����� ������ ��ݾ���(���)�� interface ����
*/

public interface Deposit{
	//interface Field (member variable) => public static final Ư���� ���´�.
	String deposit = "���";

	//interface method ==> public abstract Ư���� ���´�.
	void deposit(int money);

} //end of class