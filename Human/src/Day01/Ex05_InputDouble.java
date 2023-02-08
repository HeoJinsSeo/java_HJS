package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
	    System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		//강제형변환 : (double) sum / 3
		double avg = (double)sum / 3.0;  //double 실수형
		//자동 형변환
		// - 작은타입을 큰타입에 대입할 때, 자동으로 큰 타입으로 변환되는 것
		//강제 형변환
		
		// sum(int) + 3(int)
		//(int)+(int)=(int)
		// (정수)+(실수)=(실수)
		//(int)+(double)=(double)
		// 4byte  8byte
		
		//일반적으로,작은타입과 큰타입 연산하면 연산결과는 큰타입니 된다. 
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		sc.close();
		
		
	}
	
	
	
}
