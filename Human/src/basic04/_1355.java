package basic04;

import java.util.Scanner;

public class _1355 {
     public static void main(String[] args) {
		
	Scanner  sc = new Scanner(System.in);
	int N = sc.nextInt();
	
	for (int i = 1; i <= N ; i++) {
		
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
			
		}
		
	
	

	for (int k = 1; k <= (N+1)-i ; k++) {
		
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		
	
	}
	
	sc.close();
	
	
	
	}

     }	
}
