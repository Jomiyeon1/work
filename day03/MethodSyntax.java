//package jb03.part04;

class MethodSyntax
{

		//Field
		String name = "홍길동";
		String add = "한양";

		//Method
		public void browerOn(){
			System.out.println("brower를 켜다.");
		}


		// 작업을 하고 작업 유무를 boolean type로 return하는 행위
		public boolean documentWork(){
			System.out.println("document 작업을 하고 작업완성 유무를 boolean return");
			return true;
		}


		//두개의 정수를 받아 합을 return
		public int sum(int i, int j){
			System.out.println("<<"+i+">>와 <<"+j+">>값을 받아 합 return");
			return(i+j);
		}


		//이름을 return
		public String getName(){
			System.out.println("이름을 전달합니다.");
			return name;
		}


		//주소
		public String getAdd(){
			System.out.println("주소를 전달합니다.");
			return add;
		}


	
		//이름, 주소 array type으로 return
		public String[] getAllInformation(){
			String[] str = {name, add};
			return str;
		}
		
	
}//class
