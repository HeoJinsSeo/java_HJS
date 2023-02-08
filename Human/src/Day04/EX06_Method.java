package Day04;

import java.util.Scanner;

public class EX06_Method {

	//메소드 : 특정 기능을 하는 코드의 모음

	
	 public static int plus(int a, int b) {
	       int result = a + b;
	       return result;
	 }

	 //접근지정자(static) 반환타입 메소드명(매개변수1, 매개변수2,....){실행문;}
	 //-접근지정자 : public,protected,default,private
	 //-static : 생략, static
	 //-반환타입   : 기본타입,참조타입(int,double,String ...)
	 //             return(값); - 반환하는 (값)의 자료형을 지정
     //-메소드명   : 직접 이름을 지정, 관례적으로 카멜케이스를 사용
	 //             ex) simpleExamble()
	 //-매개변수  :
	 
	 public static int minus(int a, int b) {
	       int result = a - b;
	       return result;
	 }
	 
	 
	 
      public static void main(String[] args) {
		  
    	  
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("a : ");
    	  int a = sc.nextInt();
    	  
    	  System.out.print("b : ");
    	  int b = sc.nextInt();
    	  
    	  
    	  System.out.println(plus(a,b));
    	  System.out.println(minus(a,b));
    	  
    	  
    	  
    	  
    	  
	}	
	
	
	
}
