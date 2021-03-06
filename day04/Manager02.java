//package jb04.part05;

public class Manager02 extends Employee02{
	
	//Field
	int salary;

	//Constructor
	public Manager02(){
		System.out.println("Manager 의 default Constructor");
	}
	public Manager02(String name){
		super(name);
		System.out.println("Manager 의 name 을 받는 Constructor");

	}
	public Manager02(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Manager의 name, part를 받는 Constructor");
	}

	public Manager02(String name, String part, int age){
		this(name, part);
		this.age = age;
		System.out.println("Manager의 name, part, age를 받는 Constructor");
	}
	public Manager02(String name, String part, int age, int salary){
		this(name, part, age);
		this.salary = salary;
	}

	//Method
	public int salary(){
		System.out.println("Manager의 salay method");
		baseSalary = 200;
		return baseSalary;
	}

	public void callSalary(){
		System.out.println("Employee의 기본급은 : " + super.salary());
		System.out.println("manager의 기본급은 1. : " + this.salary());
		System.out.println("manager의 기본급은 2. : " + salary());
	}


	//main method
	public static void main(String args[]) {

		Manager02 m1 = new Manager02("홍길동");
		Manager02 m2 = new Manager02("홍길동", "EJB");
		Manager02 m3 = new Manager02("홍길동", "EJB", 25);
		Manager02 m4 = new Manager02("홍길동", "EJB", 25, 300);
		
		System.out.println("\n");
		System.out.println("overriding된 salary 호출 : " + m4.salary());
		m4.callSalary();
	
	}//main
}//class
