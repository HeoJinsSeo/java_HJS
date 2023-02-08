package Day06.EX02_Phone;

public abstract class Phone {

		//변수
	   public String owner;   //  Phone 사용자명
	   
	   // 생성자
	   
	   public Phone(String owner) {
		   
		   this.owner = owner;
		   
	   }
	   
	   //추상 메소드
	   abstract public void turnOn();
	   abstract public void turnOff();
	   
	   
	
	
	
	
}
