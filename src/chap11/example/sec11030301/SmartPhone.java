package chap11.example.sec11030301;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) { //Generate Construcotr using Fields
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {		// toString() 재정의
		return company + "," + os;  //Override/Implement Methods 에서 toString()
	}
}
