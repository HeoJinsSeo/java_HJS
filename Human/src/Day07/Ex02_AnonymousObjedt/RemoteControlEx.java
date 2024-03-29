package Day07.Ex02_AnonymousObjedt;

public class RemoteControlEx {

		public static void main(String[] args) {
			
			//익명 구현 객체
			// : 클래스를 정의하지 않고도, 이름없이 구현된 객체
			
			
			// 인터페이스 객체명 = new 인터페이스(인자1,...){객체정의}
			RemoteControl rc = new RemoteControl() {
				
				int volume;
				
				@Override
				public void trunOn() {
				System.out.println("ON");
				}
				
				@Override
				public void trunOff() {
				System.out.println("OFF");	
				}
				
				@Override
				public void setVolume(int volume) {
					this.volume = volume;
					System.out.println("volume : "+this.volume);
				}
			};
			rc.trunOn();
			rc.setVolume(50);
			rc.trunOff();
			
		}
	
}
