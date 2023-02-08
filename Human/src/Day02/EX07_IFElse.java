package Day02;

import java.util.Scanner;

public class EX07_IFElse {
	

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		// 홀수, 짝수 조건?
		// 1,3,5,7... :홀수
		// 2,4,6,8 ....
		
		
		
		
		
		if(input %2 ==1) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
		sc.close();
		
}
}