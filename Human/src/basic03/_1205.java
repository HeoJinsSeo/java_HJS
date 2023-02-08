package basic03;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		
		double arr[] = new double[10];
		arr[0] = a+b;
		arr[1] = b+a;
		arr[2] = a-b;
		arr[3] = b-a;
		arr[4] = a*b;
		arr[5] = b*a;
		arr[6] = a/b;
		arr[7] = b/a;
		arr[8] = Math.pow(a ,b);
		arr[9] = Math.pow(b, a);

			
			
		double max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
			
				max = arr[i];

			}


		}

		System.out.printf("%.6f",max);
		sc.close();

	}

		
		
		
	}
	
