package chap06.Example.sec061102.package1;		// public class A 와 동일한 패키지

public class B {
	
	public B() {
		A a = new A();
		a.field1 = 1; 		//가능
		a.field2 = 1; 		//가능
//		a.field3 = 1;		//불가능       private 필드 접근 불가(컴파일 에러)
		
		a.method1(); 		//가능
		a.method2();		//가능
//		a.method3();		//불가능 	   private 메소드 접근 불가(컴파일 에러)
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 필드
//	A a1 = new A(true);				//가능
//	A a2 = new A(1);				//가능
//	A a3 = new A("문자열");			// private 생성자 접근 불가(컴파일에러)
	
}
