package chap09.Example.s090401;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListner(new CallListener());
		btn.touch();
		
		btn.setOnclickListner(new MessageListener());
		btn.touch();
		
	}
}
