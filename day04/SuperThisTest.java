//package jb04.part05;
/*
	- ���� Method, Field ȣ���� �� �ִ� keyword > super
	- ���� Method, Field ȣ���� �� �ִ� keyword > this
*/

class JuniorHighSchool{
	//Field
	String name = "���ѹα����б�";

	//Constructor
	public JuniorHighSchool(){
		
	}

	//Method
	public void SchoolName(){
		System.out.println("���б� �̸� : " + name);
	}
} // end of JuniorHighSchool Class

class HighSchool extends JuniorHighSchool{
	//Field
	String name = "���ѹα������б�";

	//Constructor
	public HighSchool(){
		
	}

	//Constructor O/R
	public HighSchool(String str){
		name = str;
	}

	/*
	public HighSchiil(String str){
	this.name = name;
	}
	*/


//method
public void schoolName(){
	System.out.println("���б� �̸� : " + super.name);
	System.out.println("�����б� �̸� : " + this.name);
	System.out.println("�����б� �̸� : " + name);
	}
}// end of HighSchool class

public class SuperThisTest
{
	public static void main(String[] args){
		HighSchool hs01 = new HighSchool();

		hs01.schoolName();

		System.out.println("============================");
		
		HighSchool hs02 = new HighSchool("��������б�");
		hs02.SchoolName();

	} // main
}//public class