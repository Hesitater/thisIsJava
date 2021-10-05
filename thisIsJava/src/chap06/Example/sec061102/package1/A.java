package chap06.Example.sec061102.package1;

public class A {		
	// 필드
	public int field1;		//public 접근 제한
	int field2;				//default 접근 제한
	private int field3; 	//private 접근 제한
	
	//생성자
	public A() {
		field1 = 1;	//가능
		field2 = 1;	//가능
		field3 = 1;	//가능
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {} 			//public 접근 제한
	void method2() {} 					// default 접근 제한
	private void method3() {} 			//private 접근 제한
	
	
	
	
	
	
	
	
	
	
	
//	//필드
//	A a1 = new A(true);			//가능
//	A a2 = new A(1);			//가능
//	A a3 = new A("문자열");		//가능
//	
//	
//	//생성자
//	public A(boolean b) {			// public 접근 제한
//		
//	}
//	A (int b) {						// default 접근 제한
//		
//	}
//	private A(String s) {			//  private 접근 제한
//		
//	}
}
