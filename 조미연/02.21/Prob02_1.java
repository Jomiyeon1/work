class Info{
	//Field
	private String name;
	private int age;
	//constructor
	public Info(){
		
	}

	public Info(String name){
		this.name = name;
	}
	public Info(int age){
		this.age = age;
	}
		public Info(String name, int age){
		this.name = name;
		this.age = age;
	}
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}

	//getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}


}//end of Info class

class Student extends Info{
	private int id;
	
	public Student(){
		super();
	}
	public Student(String name, int age, int id){
		super(name, age);
		this.id = id;
	}

	//setter
	public void setId(int id){
		this.id = id;
	}
	//getter
	public int getId(int id){
		return id;
	}

	//출력
	public void print(){
		System.out.println("이름: " +getName() + "\t 나   이 : " + getAge() + "\t 학   번 :" + id);
	}

}//end of Student
//=========================================
class Teacher extends Info{
	private String subject;

	public Teacher(){
		super();
	}

	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	public void print(){
		System.out.println("이름: " +getName() + "\t 나   이 : " + getAge() + "\t 과   목 :" + subject);
	}

}//end of Teacher class

class Employee extends Info{
	private String dept;

	public Employee(){
		super();
	}

	public Employee(String name, int age, String dept){
		super(name, age);
		this.dept = dept;
	}

	public void print(){
		System.out.println("이름: " +getName() + "\t 나   이 : " + getAge() + "\t 과   목 :" + dept);
	}


}// end of class



public class Prob02_1{
	//main
	public static void main(String[] args){
		
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
	}
}//end of class