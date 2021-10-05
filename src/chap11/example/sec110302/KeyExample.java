package chap11.example.sec110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하느 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
//		// 식별키 "new Key(1)"로 "김태희"을 저장함
//		hashMap.put(new Key(1), "김태희");
		
		//선생님 깃허브 자료에서 우리가 배운식으로 확인
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		System.out.println(k1.equals(k2));		// equals() 리턴값은 같음
		System.out.println(k1.hashCode());		// k1,k2의 hashCode() 값들이 다름
		System.out.println(k2.hashCode());
		hashMap.put(k1,"김태희");
		
		
		// 식별키 "new Key(1)"로 "김태희"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		

	}
}
