package chap11.example.sec111104;

import java.util.Arrays;

import chap11.example.sec111103.Member;

public class SearchExample {
	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스:" + index);
		
		// 문자열 검색
		
		String[] names = { "한가인", "전지현", "김태희"};
		Arrays.sort(names);
		System.out.println("찾은 인덱스:" + index);
		
		//객체 검색
		Member m1 = new Member("한가인");
		Member m2 = new Member("전지현");
		Member m3 = new Member("김태희");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스:" + index);
		
	}
}


















