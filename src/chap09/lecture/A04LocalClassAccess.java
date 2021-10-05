package chap09.lecture;

public class A04LocalClassAccess {

	void outMethod(final int arg1, int arg2) {
		final int var1 = 1;
		int var2 = 2;
		
		class LocalClass {
		void method() {
			int result = arg1 + arg2 + var1 + var2;

		}
	}
}
//
		
//		class LocalClass {
//			int arg2 = 매개값;
//			int var2 = 2;
//			void method() {
//				int arg1 = 매개값;
//				int var1 = 1;
//				
//				int result = arg1 + arg2 + var1 + var2;
//			}
//		}
//	}
		
		
		
		
//		class LocalClass {
//			void method() {
//				int result = arg1 + arg2 + var1 + var2;
//
//			}
//		}
//	}
//	
	
	
	
	

//	void method(int param) {
//		// param과 localVar는 묵시적 final(effectively final)
//		int localVar = 3;
////		localVar = 4;
////		param = 1;
////		param = 2;
//		
//		
//		class LocalClass {
//			void method1() {
//				System.out.println(localVar);
//				System.out.println(param);
//			}
//		}

}
