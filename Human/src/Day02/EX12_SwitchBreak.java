package Day02;

import java.util.Scanner;

public class EX12_SwitchBreak {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		//- Swith 문을 사용하여 작성하시오.
		
		switch (num % 5) {
		case 0:
		case 1:
			
			System.out.println("*");
		break;
		case 2:
		case 3:
		case 4:
			System.out.println("**");
			break;
			
			// default 블록은 생략 가능
			default:
				
				System.out.println("나머지가 4보다 큽니다.");
			break;
			
		
		}
			
	
	sc.close();
	
	
		
	}
	
	

}
