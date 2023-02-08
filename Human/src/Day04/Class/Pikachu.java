package Day04.Class;


// Classification(분류)-->class
public class Pikachu {
	
	
	public int energy;
	public String type;
	
	
	public Pikachu() {
		this(100,"전기");
	//	energy = 100;
	//	type = "전기";
	}
	
	
//	public Pikachu(int energy, String type) {
		
//	this.energy = energy;
//	this.type = type;
    //생성자 자동완성
	//alt + shift + s ->o
	//매개변수가 있는 생성자
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	
	}
		public String aAttack() {
		return "십만볼트";
		
		
	}
	
	


	public String bAttack() {
		
		return "전광석화";
	}
	
	
	

}
