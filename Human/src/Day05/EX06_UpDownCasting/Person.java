package Day05.EX06_UpDownCasting;

public class Person {

	String name;
	int age;
	
	
	
	public Person() {
		this("이름없음",0);
		
		
		
		
	}
    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    	
    	
    }

	public String work() {
		return"일을 합니다.";
		
		
		
	}
	
	public String toString() {
		
		return "Person [name =" + name + ",age=" + age + "]";
		
		
	}
	
	
	
}
