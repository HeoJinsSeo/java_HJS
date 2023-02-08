package Day04;

import java.util.Scanner;

/**
 * 화폐 매수 구하기
 * 
 * 금액 : 534760
 * 50000   :  10개
 * 10000   :   3개
 * 5000    :   0개
 * 1000    :   4개
 * 500     :   1개
 * 100     :   2개
 * 50      :   1개
 * 10      :   1개
 * 5       :   0
 * 1       :   0
 * 
 * 위와 같이 금액을 입력하면,
 * 큰 화폐단위부터 계산하여 화펴단위별로 화폐매수를
 * 출력하는 프로그램을 작성하시오.
 * 
 * 
 * @author h
 *
 */


public class EX02_NumberOfCurrency {
/*
  (순서도)
 
   1. 필요한 변수 선언
    - 입력금액, 화폐매수, 화폐단위
   2.       입력금액 입력
   3. 화폐매수 계산
   :큰 화폐단위부터계산
   3-1. 화폐매수 계산
     화폐매수 = 입력금액/화폐단위
   3-2. 잔액 계산
   i) 잔액 = 입력금액-화페단위x화폐매수
   ii) 잔액 = 입력금액%화폐단위
   
   3-3. 화폐단위 변환
     번갈아 가면서, /5,/2연산을 반복한다.
     화폐단위 = 화폐단위/5
     화폐단위 = 화폐단위/2
     
     4. 3번의 과정을 반복
      -반복조건 : (화폐단위)1보다 크거나 같으면 반복
     5. 3-1에서 구한 화폐매수를 출력한다. 
     
	
*/
	public static void main(String[] args) {
		
		int input;
		int count;
		int money = 50000;
		boolean sw = true;
		
		
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		while( money >= 1) {
		
		
		count = input / money;
        System.out.println(money + "\t : " + count + "개" );		
		input = input % money;
		
        
        
		if(sw) {
			
			money = money / 5;
			//sw = false;
			
			
		}else {
			
			money = money / 2;
			//sw = true;
		}
		
		sw = !sw;
		
		
		
	}
	
}
	
}
