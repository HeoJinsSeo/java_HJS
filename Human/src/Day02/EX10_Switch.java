package Day02;

import java.util.Scanner;

public class EX10_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요 :");
		int channel = sc.nextInt();
		
	
		switch (channel) {
		case 1:
			System.out.println("넷플릭스");   
		    break;
		case 2:
			System.out.println("디즈니플러스");   
		break;
		case 17:
			System.out.println("(tvN) 일타스캔들");
			break;
		case 27:
			System.out.println("(Mnet) 쇼미더머니12");
	    default:
				System.out.println("유투브 포에버~!");
				break;
		}
		
		sc.close();
		
		
	}
	
	
	
}
