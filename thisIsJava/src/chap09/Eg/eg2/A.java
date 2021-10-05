package chap09.Eg.eg2;

public class A {
	//*정적 멤버 클래스 **//
	
	static class C {
		C() {}							// 생성자
		int filed1;						// 인스턴스 필드
		static int field2;				//정적 필드
		void method1() {				//인스턴스 메소드
		}
		static void method2() {		//정적 메소드
		}
		
	}
		public static void main(String[] args) {
			A.C c = new A.C();
			c.filed1 = 3;			//인스턴스 필드 사용
			c.method1(); 			//인스턴스 메소드 호출
			A.C.field2 = 3; 		//정적 필드 사용
			A.C.method2(); 			//정적 메소드 호출
			
			System.out.println(c.filed1);
			
			
		}
}
