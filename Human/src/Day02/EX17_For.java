package Day02;

public class EX17_For {

	public static void main(String[] args) {
		
		//for(1. 초기식 ; 2.조건식 ;4.증감식 ) {3.실행문;}
		//실행순서 : 1
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i + "");
			
		}
		System.out.println();
		
		// 2. 50~100까지으 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.println(i + "");
			
			
		}
		
		System.out.println();
		
	     for (int i = 2; i <= 20; i+=2) {
			System.out.println(i + "");
			
			
			for (int j = 1; j <= 20; j+=2) {
				
				System.out.println(i + "");
				
			}
			
			System.out.println();
		}
		// 3. 1~20까지의 정수 중, 짝수만 출력하시오.
	    // 4. 1~20까지의 정수 중, 홀수만 출력하시오.	
		
	}
	
	
	
	
	
}
