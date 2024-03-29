package Day07.Ex01_NestedClass;

/**
 * 중첩 클래스
 */
public class X {

	X() {

		System.out.println("X 객체 생성");

	}

	// 인스턴스 이너 클래스
	// * 인스턴스 이너 클래스 안에서는 static 멤버 사용불가
	class Y {

		int value1;
		// static int value2;

		Y() {

			System.out.println("X의 B 객체 생성");

		}

		void method1() {
			System.out.println("Y의 메소드");

		}

		/*
		 * static void method2() { System.out.println("static 메소드 사용불가");
		 * 
		 * }
		 */
	}

	// Static 이너 클래스
	
	static class Z {
		int value1;
		static int value2;
		Z() {
			
			System.out.println("X의 Z 객체 생성");
			
			
		}
		void method1() {
			
			System.out.println("Z의 메소드");
			
		}
		
		static void method2() {
			System.out.println("Z의 static 메소드");
			
		}
		
	}
	
	//로컬 크래스
    //	: 메소드 내의 정의한 클래스
	// - 메소드
    	
	void method() {
    	class L {
    		int value1;
    		L() {
    			
    			System.out.println("L 객체가 생성");
    			
    		}
    		void method1() {
    			System.out.println("L의 메소드");
    			
    		}
    		
    		
    		/*static void method2(){
    		 * 
    		 * System.out.println()
    		 * 
    		 * 
    		 * */
    		
    	}
    	L l = new L();
    	l.value1 = 10;
    	System.out.println("로컬 클래스 L의 변수 - "+l.value1);
    	l.method1();   
    }
    	
     
	
	

}
