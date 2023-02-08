package Day04;

import java.util.Scanner;

/*
#############메 뉴 판############
1. BHC         - 뿌링클치킨
2. BBQ         - 황금올리브 반반치킨
3. 노랑통닭       - 후라이드 치킨
4. KFC         - 핫크리스피 치킨
5. 치킨나라       - 양념치킨
0. 종료
############# 입력 :


메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
"(해당메뉴)가 주문되었습니다." 라고 출력하시오. 
0을 입력하기 전까지 반복하고,
0을 입력하면 반복을 종료합니다.
종료 시, "?개의 주문을 완료하였습니다."라고 출력하시오.
*/
public class EX05_ChickenMenu {

	//메소드 : 코드의 모음
	// - 메소드 정의
	//접근지정자(static) 반환타입 메소드명(매개변수1, 매개변수2){실행문;}
	//*void - 반환할 값이 없음을 알려주는 키워드 
	//메뉴판 출력
	public static void printMenu() {
		System.out.println(" #############메 뉴 판############ ");
		System.out.println("1. BHC         - 뿌링클치킨 ");
		System.out.println("2. BBQ         - 황금올리브 반반치킨");
		System.out.println("3. 노랑통닭       - 후라이드 치킨 ");
		System.out.println("4. KFC         - 핫크리스피 치킨 ");
		System.out.println("5. 치킨나라       - 양념치킨 ");
		System.out.println("0. 종료                   ");
		System.out.println("############# 입력 :      ");
		
	
	}
	public static void main(String[] args) {
		
		int menuNo = 0;
		String menuName = "";
		int count = 0;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		do {

			printMenu();

			menuNo = sc.nextInt();

			if (menuNo == 0)
				break;
			switch (menuNo) {

			case 1:
				menuName = "뿌링클치킨";
				break;

			case 2:
				menuName = "황금올리브 반반치킨";
				break;

			case 3:
				menuName = "후라이드 치킨";
				break;

			case 4:
				menuName = "핫크리스피 치킨";
				break;

			case 5:
				menuName = "양념치킨";
				break;

			default:
				menuName = "(선택안함)";
				break;

			}
			if (menuNo >= 0 && menuNo <= 5) {

				System.out.println(menuName + "이 주문되었습니다.\n");
				count++;

			} else {
				System.out.println("0~5번 사이의 정수를 입력해주세요.\n");
			}
		} while (true);

		System.out.println(count + "개의 주문을 완료하였습니다.");
	}

}
