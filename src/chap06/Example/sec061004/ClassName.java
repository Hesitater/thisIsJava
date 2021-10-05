package chap06.Example.sec061004;

public class ClassName {
		//인스턴스 필드와 메소드
		int field1;
		
		void method1() {
			
		}
		
		//정적 필드와 메소드
//		static int field2;
//		static void method2() {
//			
//		}
		
		//정적 블록
//		static {
//			field1 = 10;		//컴파일에러
//			method1();			//컴파일에러
//			field2 = 10;
//			method2();
//		}
		
		static void Method3() {
			ClassName obj = new ClassName();
			obj.field1 = 10;
			obj.method1();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
