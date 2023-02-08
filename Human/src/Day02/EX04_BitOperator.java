package Day02;

public class EX04_BitOperator {
	public static void main(String[] args) {
		//AND
		//20 (십진수)  --->0001 0100(이진수)
		//16 (십진수0  --->0001 0000(이진수)
		// 이진수 : 0 또는 1로만 표현한 수
		
		int result = 20 & 16;
		System.out.println(20 & 16);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result2 = 20 | 16;
		System.out.println(20|16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		//XOR
		//0001 0100
		//0001 0000
		//-----------
		//0000 0100
		
		int result3 = 20 ^ 16;
		System.out.println(20^16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("--------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
	
		// NOT
		// ~0001 0100 
		//----------------
		// 1110 1011
		
		int result4 = ~20;
		System.out.println(~20);
		System.out.println(Integer.toBinaryString(20));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		
		// 시프트 연산

		
		// 0000 0010   -> 2 : 2^1
		// 0000 0100   -> 4 : 2^2
		// 0000 1000   -> 8 : 2^3
		
		System.out.println(" << 연산하면 2배씩 증가");
		System.out.println(2 << 1);   
		System.out.println(2 << 2);    
		System.out.println(2 << 3);    
		System.out.println();
		
		
		System.out.println(" >> 연산하면 1/2배씩 감소");
		System.out.println(16 >> 1);
		System.out.println(16 >> 2);
		System.out.println(16 >> 3);
		System.out.println();
		
		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1);
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		
	System.out.println(2 >> 1);
	System.out.println(-2 >>> 31);
	System.out.println(Integer.toBinaryString(2));
	System.out.println(Integer.toBinaryString(-2));
	System.out.println();
		
	
	//
	//
	//
	//
	//
	
	// 양수 10을 음수 -10으로 변환
	// 0000 1010  --> 10
	//1.비트를 반전시킨다.
	// 1111 0110  -->-10
	//2.  +1 더한다
	// 1111 0101
	//0000 0001
	// -----------
	// 1111 0110
	// 1111 0110  --> -10
	
	}
}
	
	


