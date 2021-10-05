package chap02.examples.Ex;

public class VariableEx02 {
	public static void main(String[] args) {
		
		int var1;    //메소드 블록에서 선언
		
		if( true) {
			int var2;         // if 블록에서 선언
			// var1 과 var2사용가능
		}
		
		for( var1 = 1;;) {
			int var3;    	// for 블록에서 선언
			//var1과 var 사용 가능
			//var2는 사용 못함
		}
		
		//var1 사용 가능
		//var2 와 var3은 사용 못함
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
