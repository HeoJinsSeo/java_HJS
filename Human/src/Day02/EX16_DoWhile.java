package Day02;

import java.util.Scanner;

public class EX16_DoWhile {

	public static void main(String[] args) {

		// 변수선언: 메뉴번호, 메뉴이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("##### 점심 메뉴판 #####");
			System.out.println("1. 참치마요덮밥");
			System.out.println("2. 잔치국수");
			System.out.println("3. 카레");
			System.out.println("4. 맥도날드");
			System.out.println("5. 바나나 우유");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : ");

			menuNo = sc.nextInt();

			switch (menuNo) {
			case 1:
				menuName = "참치마요덮밥";
				break;
			case 2:
				menuName = "잔치국수";
				break;
			case 3:
				menuName = "카레";
				break;
			case 4:
				menuName = "맥도날드";
				break;
			case 5:
				menuName = "바나나우유";
				break;
			default:
				menuName = "(굶음)";
				break;

			}

			if (menuNo != 0) {
				System.out.println(menuName + "(을/를) 먹었습니다.");

			}
		} while (menuNo != 0);

		System.out.println("메뉴판을 종료합니다.");
		sc.close();

	}

}
