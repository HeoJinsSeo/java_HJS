package Day03;

import java.util.Scanner;

public class EX02_Max {

	public static void main(String[] args) {

		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하여 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[];

		arr = new int[N];

		// N : 5
		// i : 0 1 2 3 4 5
		for (int i = 0; i < N; i++) {
			arr[i]	= sc.nextInt();
			
			// 배열선언
		}
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];

			}

			// 배열 생성

			// 배열의 길이: 배열요소의 개수 = 배열.length

			// 5.배열 arr를 반복하여, i번재 요소와 i+1번째 요소의 크기를 비교한다.


		}

		System.out.println("최댓값: " + max);
		sc.close();

	}

}