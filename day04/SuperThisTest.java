//package jb04.part05;
/*
	- 상위 Method, Field 호출할 수 있는 keyword > super
	- 하위 Method, Field 호출할 수 있는 keyword > this
*/

class JuniorHighSchool{
	//Field
	String name = "대한민국중학교";

	//Constructor
	public JuniorHighSchool(){
		
	}

	//Method
	public void SchoolName(){
		System.out.println("중학교 이름 : " + name);
	}
} // end of JuniorHighSchool Class

class HighSchool extends JuniorHighSchool{
	//Field
	String name = "대한민국고등학교";

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
	System.out.println("중학교 이름 : " + super.name);
	System.out.println("고등학교 이름 : " + this.name);
	System.out.println("고등학교 이름 : " + name);
	}
}// end of HighSchool class

public class SuperThisTest
{
	public static void main(String[] args){
		HighSchool hs01 = new HighSchool();

		hs01.schoolName();

		System.out.println("============================");
		
		HighSchool hs02 = new HighSchool("서울고등학교");
		hs02.SchoolName();

	} // main
}//public class