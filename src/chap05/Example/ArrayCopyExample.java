package chap05.Example;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "김태희", "전지현", "한지민" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0 , newStrArray, 1, oldStrArray.length);
		//				   원본배열 , 몇번인덱스부터 넣을지 , 새배열 , 몇번인덱스부터 넣을지, 복사할개수
		
		for(int i = 0; i < newStrArray.length; i++ ) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
