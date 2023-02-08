package Day01;

import java.util.Scanner;

public class EX06_Triangle {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("삼각형의 넓이");
	System.out.print("밑변 : ");
    double width = sc.nextDouble();  //실수(double)값 하나를 입력받음
    
    System.out.print("높이 : ");
    double height = sc.nextDouble();  //실수(double)값 하나를입력받음
    
    
    //삼각형의 넓이 구하는 공식
    //(넓이) = (밑변 ) X (높이 )/2
    double area = width * height / 2;
    System.out.println("넓이 : " + area);
    
    
	sc.close();
	
	
	
	
	
}
	
	
	
	
	
	
	
}
