package chap06.Example.sec061101;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "uas";				//final 필드값 수정 불가 컴파일오류
//		p1.ssn = "654321-7654321";		//final 필드값 수정 불가 컴파일오류
		p1.name = "을지문덕";
		
	}
	
}
