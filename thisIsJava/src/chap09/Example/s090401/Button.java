package chap09.Example.s090401;

public class Button {
	OnClickListener listener;			
	
	void setOnclickListner (OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	interface OnClickListener {
		void onClick();
	}
	
}
