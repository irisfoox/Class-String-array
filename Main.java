package firstpart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studySubject= {"Math","History","Biology","Music","Geography","English"};
        Student yossi=new Student("yossi",24,studySubject[1]);
        Student moshe=new Student("moshe",23,studySubject[2]);
        Student yehuda=new Student("yehuda",25,studySubject[4]+studySubject[3]);
        System.out.println(yehuda.toString());   //what exactly this object is
        moshe.setStudySubject(studySubject[Student.randSub()]+studySubject[Student.randSub()]+studySubject[Student.randSub()]);
        System.out.println(moshe.toString());
        for(int i=0;i<6;i++) {
        	if(studySubject[i].equals("Music")) {
        		studySubject[i]="Sport";
        	}
        	System.out.println(studySubject[i]);
        }
        Student.numSub(moshe);
        yehuda.setAge(24);
        System.out.println(yehuda.getAge());
	}

}
