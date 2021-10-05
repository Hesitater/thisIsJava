package chap09.Eg.eg1;

public class A {
	/** 인스턴스 멤버 클래스**/			//교재 391
	class B {
		B() {}    					//생성자
		int filed1;					//인스턴스 필드
//		static int field2;			//정적필드 (x)
		void method1() {}			//인스턴스 메소드
//		static void method2() {}		// 정적 메소드 (x)
		
		void method2() {
			//*로컬 클래스**//
			class D {
				D() { }						//생성자
				int field1;					//인스턴스 필드
//				static int field2;			//정적필드 (x)
				void method3() {}			//인스턴스 메소드
//				static void method2() {}	//정적 메소드(x)
			}
			D d = new D();
			d.field1 = 3;
			d.method3();
		}
		
		
		void method() {
			class DownloadThread extends Thread {}
			DownloadThread thread = new DownloadThread();
			thread.start();
		}
		
		
	}
		public static void main(String[] args) {
			A a = new A();
			A.B b= a.new B();
			b.filed1 = 3;
			b.method1();
			
		}
}
