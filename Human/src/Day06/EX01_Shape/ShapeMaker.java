package Day06.EX01_Shape;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {

	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  Shape shape = null;
		  double width = 0.0;
		  double height = 0.0;
		  double radius = 0.0;
		  
		  double roundSum = 0.0;
		  double areaSum = 0.0;
		  
		//리스트 : 동적 자료구조, 컬렉션
		//여기서는 Shape 객체들을 담는 목록이다.  
		List<Shape> list = new LinkedList<Shape>();  
		  
		  
		while(true) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			
			
			if(input.equals("그만"))break;
			
			int menuNo = Integer.parseInt(input);
			
						
			switch(menuNo) {
			case 1:
				
				   System.out.print("가로>>");
			       width = sc.nextDouble(); 
                   System.out.print("높이>>");			
			       height = sc.nextDouble();
			       shape = new Triangle(width,height);
			       list.add(shape);
			       break;
			       
			case 2 :      
			       

				   System.out.print("가로>>");
			       width = sc.nextDouble(); 
                   System.out.print("높이>>");			
			       height = sc.nextDouble();
			       shape = new Rectangle(width,height);
			       list.add(shape);
			       break;
			    
			case 3 :
				
				    System.out.print("반지름>>");
			        radius = sc.nextDouble();
			        shape = new Circle(radius);
			        list.add(shape);
			        break;
			}
			
			
		}
	   for(Shape s : list) {	
		if(s instanceof Triangle)
		   System.out.println("[삼각형]");
		if(s instanceof Rectangle)
			   System.out.println("[사각형]");
		if(s instanceof Circle)
			   System.out.println("[원형]");
				   
		double area = s.area();
		double round = s.round();
		
		roundSum = roundSum + round;
		areaSum = areaSum + area;
		
		System.out.println("넓이 : " + area +"\t");
		System.out.println("둘레 : " + round +"\t");
		System.out.println();   
	   }
		   
	   System.out.println("둘레 총합 : " + roundSum);
	   System.out.println("넓이 총합 : " + areaSum);
	   
		   
		  sc.close();
		  
	}
	
	 
	}
	  
	
