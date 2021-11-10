package chap11.example.sec110702;

public class StringSplitExample {
	public static void main(String[] args) {
		
		String text ="김태희&한가인,김희선,한지민-고윤하";
		
		String[] names = text.split("&|,|-");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
