package chap03.Example.binary;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 = "김태희";
		String strVar2 = "김태희";
		String strVar3 = new String("김태희");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar2 == strVar3);	
		System.out.println();
		System.out.println( strVar1.equals(strVar2) );
		System.out.println( strVar2.equals(strVar3) );
		
	}
}
