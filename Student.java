package firstpart;

import java.util.Arrays;

public class Student {
   private String name;
   private int age;
   private String studySubject;
   
public Student(String name, int age, String studySubject) {
	this.name = name;
	this.age = age;
	this.studySubject = studySubject;
}
public static void numSub(Student s) {
	char[] arr=s.getStudySubject().toCharArray();
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(Character.isUpperCase(arr[i])) {
			count++;
		}
	}
    System.out.println(String.format("the student %s has to learn %s courses",s.getName(),count));	
}

public static int randSub() {
    int a=(int)(Math.random()*10);
    if(a<6) {
    	return a;
    }else return a-5;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("the student: %s aged: %s learns: %s", this.name,this.age,this.studySubject);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	try {
		if(age>20 && age<120) {
			this.age = age;}		
		}catch (Exception ex){
			System.out.println("Age is not in value range "+ex);
			ex.printStackTrace();
		}
	}
	
public String getStudySubject() {
	return studySubject;
}
public void setStudySubject(String studySubject) {
	this.studySubject =" "+studySubject;
}
   
   
}
