package Day03;

import java.util.Scanner;

public class EX03_Min {

	public static void main(String[] args) {
		
		
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
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];

			}

			// 배열 생성

			// 배열의 길이: 배열요소의 개수 = 배열.length

			// 5.배열 arr를 반복하여, i번재 요소와 i+1번째 요소의 크기를 비교한다.


		}

		System.out.println("최솟값: " + min);
		sc.close();

	}

		
		
		
		
		
	}
	
	
	
	
