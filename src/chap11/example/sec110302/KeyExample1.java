package chap11.example.sec110302;

import java.util.HashMap;

public class KeyExample1 {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap = new HashMap<Key, String>();
		
		//식별키로 "new Key(1)" 로 "김태희"을 저장함
		hashMap.put(new Key(1), "김태희");
		
		//식별키 "new Key(1)" 로 "김태희"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
