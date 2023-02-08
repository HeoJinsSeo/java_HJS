package Day03;

public class EX09_String {

	public static void main(String[] args) {
		
		//String은 참조타입
		
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java"); //힙영역 별도
		
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a.equals(d));

		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		//== :해당변수의 레퍼런스(참조정보)를 비교
		//equals(): 해당변수의 문자열 자체를 비교
		
	}
	
	
	
	
}
