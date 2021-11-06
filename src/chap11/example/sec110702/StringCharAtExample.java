package chap11.example.sec110702;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010103-1230123";
		
		char sex = ssn.charAt(7);
		
		if (sex == '1' || sex == '3') {
			System.out.println("이사람은 남자입니다");
		} else if (sex == '2' || sex == '4') {
			System.out.println("이사람은 여자입니다.");
		}
		
		System.out.println("------------------------------------");
		String ssn1 = "010103-2310123";
		char sex1 = ssn1.charAt(7);
		
		switch (sex1) {
		case '1':
		case '3':
			System.out.println("1 or 3 이니 남자");
			break;
		case '2':
		case '4':
			System.out.println("2 or 4 이니 여자");
			break;
			
		default:
			System.out.println("외계인인가요?");
			break;
		}
	}
}
