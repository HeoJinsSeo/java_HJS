package Day05.EX01_ObjectArray;

/*
 *     반지름이 1~5인 Circle 객체5개를 가지는 
 */

class Circle{
	// 변수    :  반지름
	// 메소드   :  넓이
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		
	}
	
	public double getArea() {

		  return 3.14 * radius* radius;
	}
	
	
	
	
}


public class CircleArray {
		public static void main(String[] args) {
			
			Circle[] c;    
			c = new Circle[5];
			
			for (int i = 0; i < c.length; i++) {
				//반지름이 1~5인 Circle 객체 5개 생성 후 배열요소에 대입
				
				c[i] = new Circle(i+1);
			}
			
			for (Circle circle : c) {
				
				System.out.println("넓이 : "+ circle.getArea() );
				
				
			}
			
			
		}
	
	
	
	
}
