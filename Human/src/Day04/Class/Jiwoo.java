package Day04.Class;

public class Jiwoo {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		
	//	pikachu.energy = 100;
	//	pikachu.type = "전기";
		
		System.out.println("###################피카츄#################");
		System.out.println("에너지 : "+pikachu.energy);
		System.out.println("타입 : "+pikachu.type);
		System.out.println("공격A : "+pikachu.aAttack());
		System.out.println("공격B : "+pikachu.bAttack());
		
		
		
		Pikachu pikach20 = new Pikachu(150,"진화");
		
		System.out.println("###################피카츄(Lv.20)#################");
		System.out.println("에너지 : "+pikachu.energy);
		System.out.println("타입 : "+pikachu.type);
		System.out.println("공격A : "+pikachu.aAttack());
		System.out.println("공격B : "+pikachu.bAttack());
		System.out.println();
		
		
		
		Raichu raichu = new Raichu();
		

		System.out.println("################### 라이츄 #################");
		System.out.println("에너지 : "+raichu.energy);
		System.out.println("타입 : "+raichu.type);
		System.out.println("공격A : "+raichu.aAttack());
		System.out.println("공격B : "+raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400,"메가전기");
		
		System.out.println("################### 라이츄(Lv.40) #################");
		System.out.println("에너지 : "+raichu40.energy);
		System.out.println("타입 : "+raichu40.type);
		System.out.println("공격A : "+raichu40.aAttack());
		System.out.println("공격B : "+raichu40.bAttack());
		System.out.println();
		
		
		
	}
	
	
}
