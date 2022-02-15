//package jb04.part.outer;

public class Son1 extends Father{ // jb04.park07.Father
	public Son1(){
		System.out.println(this.name);
		System.out.println(bank);
		//System.out.println(branch);
		//System.out.println(password);

		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}
}