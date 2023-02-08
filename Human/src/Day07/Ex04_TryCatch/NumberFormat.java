package Day07.Ex04_TryCatch;

public class NumberFormat {

	public static void main(String[] args) {
		
		
		String numberString = "100";
		String numberAndString = "a100";
		
		
		int num1 = Integer.parseInt(numberString);
		int num2 = 0;
		
		try {
		
		 num2 = Integer.parseInt(numberAndString);
		}catch(NumberFormatException e) {
			
			System.err.println("문자열숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다.");
		}
		//NumberFormatException : For input string :"a100"
	    //문자열 숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다.
	
	   System.out.println("num1 : "+(num1+10));
	   System.out.println("num2 : "+num2);
		
		
	}
	
	
}
