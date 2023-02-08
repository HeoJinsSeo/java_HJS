package Day05.EX04_02_AccessModifier;

import Day05.EX04_01_AccessModifier.Person;

public class Student extends Person {
            
	public Student() {
	super();
	
	
}
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
      
	public void defaultSetting() {
		name = " 이름없음";
		height = 175;
		
		setAge(20);
		setWeight(60);
		
		
		
		
	}
	
	
	
	
}