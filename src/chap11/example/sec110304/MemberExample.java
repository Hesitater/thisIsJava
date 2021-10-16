package chap11.example.sec110304;

public class MemberExample {
	public static void main(String[] args) {
		//원본 객채 생성
		Member original = new Member("Kim Tae-hee","김태희","19800329",41,true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		 Member cloned = original.getMember();
		 cloned.id ="SULLI";						//복제 객체에서 id 변경
		 cloned.name ="최진리";						//복제 객체에서 name 변경
		 cloned.password ="19940329";             //복제 객체에서 password 변경
		 cloned.age = 27;							//복제 객체에서 age 변경
		 
		 System.out.println("[복제 객체의 필드값]");
		 System.out.println("id : " + cloned.id);
		 System.out.println("name :" + cloned.name);
		 System.out.println("passworld : " + cloned.password);
		 System.out.println("age : " + cloned.age);
		 System.out.println("adult : " + cloned.adult);
		 
		 System.out.println();
		 System.out.println("-------------------------------");
		 
		 System.out.println();
		 System.out.println("[원본 객체의 필드값]");
		 System.out.println("id : " + original.id );
		 System.out.println("name :" + original.name );
		 System.out.println("passworld : " + original.password);
		 System.out.println("age : " + original.age );
		 System.out.println("adult : " + original.adult );
		 
	}
}
