package chap07.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시s2", "검정", 12);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델:" + dmbCellPhone.model);
		System.out.println("색상:" + dmbCellPhone.color);
		
		
		//DmbCellPhone 의 필드
		
		System.out.println("채널:" + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 김태희라고해용");
		dmbCellPhone.sendVoice("와 연예인?");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
		
	}
}
