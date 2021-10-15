package chap11.example.sec110302;

public class Key { // hashCode() 메소드를 재정의 추가 //
	public int number;

	public Key(int number) {
		this.number = number;
	}

	
	@Override
	public int hashCode() {
		return number;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
