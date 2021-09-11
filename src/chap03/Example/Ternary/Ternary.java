package chap03.Example.Ternary;

public class Ternary {
	public static void main(String[] args) {
		// 항1?  항2 : 항3
		// 결과값은 항2 or 항3
		// 항1 true -> 항2
		// 항1 false -> 항3
		
		System.out.println(true ? 3 : 4);
		System.out.println(false? 3 : 4);
		
		System.out.println(true ? 3.14 : 2.21);
		System.out.println(false ? "가" : "나");
		
		System.out.println( (3 < 2) ?  'x' : 'y');
		System.out.println( (10 % 2 == 0) ?  false : true);
		
	}
}
