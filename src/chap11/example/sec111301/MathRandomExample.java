package chap11.example.sec111301;

public class MathRandomExample {
	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6) +1;
		System.out.println("주사위 눈:" + num);
		
		int numlo1 = (int) (Math.random()*45) + 1;
		System.out.println("로또번호중하나:" + numlo1);
		
	}
}
