package Day02;

import java.util.Scanner;

public class EX20_Star1 {
	public static void main(String[] args) {
		
		//자연수 N을 입력받아, 삼각형 모양의 "*"을 출력하시오.
		// 입력 : 5
		// 출력
		// *
		// **
		// ***
		// ****
		// *****
		//도전!
		
		Scanner  sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int N = sc.nextInt();
		
		
		//N줄이 나오도록 반복
	    //N줄일 때, N번 *이 출력되도록 반복
		
		for (int i = 1; i <= N ; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		sc.close();
		
		
		
		
		
		
		
	}
	
	
	
	

}
