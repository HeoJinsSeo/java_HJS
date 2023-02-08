package Day02;

import java.util.Scanner;

public class EX11_Grade {
	
	public static void main(String[] args) {
		
		//학점을 입력받아, 점수대를 출력하시오.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점 :");
		 //charAt(0)-->문자열에서 해당 index(순서번호)의 문자를 추출
		

		
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch(grade) {
		

		case 'A' :
			System.out.println("90~100점입니다.");
			break;

		
			

		case 'B' :
			System.out.println("80~90점입니다.");
			break;

			
			
			

		case 'C' :
			System.out.println("70~80점입니다.");
			break;

			
			
			

		case 'D' :
			System.out.println("60~70점입니다.");
			break;

			
			
			

		case 'F' :
			System.out.println("60점 미만입니다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력해주세요");
			break;
			
			

			
		}
		
		
		
		sc.close();
		
		
	}
	
	
	

}
