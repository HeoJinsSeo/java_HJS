package Day05.EX04_02_AccessModifier;

import Day05.EX04_01_AccessModifier.Person;

public class Manager {
          public static void main(String[] args) {
			
        	  Student student = new Student();
        	  student.defaultSetting();
        	  System.out.println("name : "+student.name);
        	  System.out.println("height : "+student.getHeight());
        	  System.out.println("age : "+student.getAge());
        	  System.out.println("weight : "+student.getWeight());
        	  
        	  System.out.println();
        	  
        	  Person person = new Person("김휴먼",175,20,60);
        	  System.out.println("name : "+person.name);
        	  System.out.println("height : "+person.getHeight());
        	  System.out.println("age : "+person.getAge());
        	  System.out.println("weight : "+person.getWeight());
        	  
        	  
        	  
        	  System.out.println();
        	  
        	  
		}
	
	
	
	
}
