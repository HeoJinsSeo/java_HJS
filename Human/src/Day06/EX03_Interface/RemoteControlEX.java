package Day06.EX03_Interface;

public class RemoteControlEX {

		public static void main(String[] args) {
			RemoteControl tvRc =  new Television();
			tvRc.trunOn();
			tvRc.setVolume(5);
			tvRc.setVolume(100);
			tvRc.setMute(true);
			tvRc.trunOff();
			System.out.println();
			
			RemoteControl speakerRc = new Speaker();
			speakerRc.trunOn();
			speakerRc.setVolume(5);
			speakerRc.setVolume(100);
			speakerRc.setMute(true);
			speakerRc.trunOff();
			System.out.println();
			
			
			
			RemoteControl.changeBattery();
			
		}
	
	
	
	
}
