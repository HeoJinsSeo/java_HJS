package EX01_Student;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20230001";
		student.major = "컴퓨터공학과";
		

		Student student2 = new Student("강재영",20,"20230001","경제학과");
		
		
		int[] scores = {10,20,30,40,50};
		int[] scores2 = {100,100,100,90,95};
		
		System.out.println("######학생1######");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - Java 공부하기  " );
		student.study("Java");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10,20));
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30,40,50));
		System.out.println("학생1 - 최종 점수 : " + student.getAverage( scores ));
		
		
	}
	
	
	
}
