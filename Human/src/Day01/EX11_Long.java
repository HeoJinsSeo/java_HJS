package Day01;

public class EX11_Long {

	public static void main(String[] args) {
		//int (4byte : 32bite) : 2^32개  : 42억 개
        //int 수 표현 범위 : -21억xxx ~ 21억xxx  		
		// int intMax = 2200000000;
		long ln1= 1000;        //(long) = (int)
		long ln2= 2100000000;  //(long) = (int)
		// long 타입 리터럴 : 숫자 L
		long ln3= 2200000000L;
		
		int max = Integer.MAX_VALUE;   //int 형의 최댓값(21억xxx)
		int min = Integer.MIN_VALUE;   //int 형의 최솟값(-21억xxx)
	
	System.out.println("int의 최댓값 : " + max);
	System.out.println("int의 최솟값 : " + min);
	
	System.out.println("int1 : " + ln1);
	System.out.println("int2 : " + ln2);
	System.out.println("int3 : " + ln3);
	
	
	
	}
	
	
}
