package chap11.lecture.arrays;

import java.util.Arrays;

public class A01Arrays {
	public static void main(String[] args) {
		
		int[] arr1 = {2,9,4,8,4,8};
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4);   // 인덱스 1이상 4미만인듯
		System.out.println(Arrays.toString(arr3));
	}
}
