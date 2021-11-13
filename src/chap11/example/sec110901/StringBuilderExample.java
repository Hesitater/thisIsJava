package chap11.example.sec110901;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");
		sb.append("Program Study");					//문자열을 끝에추가
		System.out.println(sb.toString());
		
		sb.insert(4, "2");							//index4 위치 뒤에 2를삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');						//index4 위치뒤에 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6,  13,  "Book");				//index6부터 index13 '전'까지를 "Book"문자열로 대치
		System.out.println(sb.toString());
		
		sb.delete(4,5);								//index4부터 index5 '전'까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();					//총 문자수 얻기
		System.out.println("총문자수:" +length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}
