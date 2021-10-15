package chap11.lecture.wrapper;

import java.util.Arrays;

public class A01Wrapper {
	public static void main(String[] args) {
		//8개 기본타입
		// 나머지는 모두 참조타입
		
		//Wrapper class들
		// Byte, Short, Integer, Long
		//Character, Boolean
		// Float, Double
		
		Integer i1 = new Integer(100);
		System.out.println(i1.hashCode());
		System.out.println(System.identityHashCode(i1));
		
		Object[] arr1 = new Object[] {"java", 3, true, 3.14, 'a'};
		System.out.println(Arrays.toString(arr1));
		
		Object o1 = new Integer(3); //Boxing
		Object o2 = 3;    // Auto Boxing
		
//		int intVar1 = o1; //x
		
		Integer i2 = new Integer(99);
		int intVar2 = i2; //Auti UnBoxing
		
		intVar2 = i2.intValue();  //Boxing
		
	}
}
