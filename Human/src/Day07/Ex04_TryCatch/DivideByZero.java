package Day07.Ex04_TryCatch;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		System.out.print("a :");
		a = sc.nextInt();

		System.out.print("b : ");
		b = sc.nextInt();

		// 예외 메시지 : java.lang.ArithmeticException: / by zero

		// 예외 처리문 : try ~ catch
		try {
			// 예외 발생 가능성 있는 문장
			System.out.println("a/b =" + a / b);

		} catch (ArithmeticException e) {
			System.err.println("0으로 나누는 연산은 수학적으로 정의되지 않습니다.");
		}
		// finally 블록은 생략가능
		finally {
			// 예외 발생과 무관하게 실행하는 문장
			// 예외 처리와 관련한 10문장을 작성(메모리를 해제하는 문장 등을 작성)
			sc.close();

		}
	}
}