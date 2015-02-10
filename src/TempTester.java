import java.io.FileNotFoundException;
import java.io.IOException;

public class TempTester {
	public static void main(String[] args) throws IOException
	{
		
		MOS word = new MOS("Word",true,true,true,true);
		MOS excel = new MOS("Excel",true,true,true,true);
		MOS outlook = new MOS("Outlook",true,true,true,true);
		MOS powerPoint = new MOS("Power Point",true,true,true,true);
		MOS access = new MOS("Access", true,true,true,true);
		
//		Student myStudent = new Student("Jack",123456,"P.M.","Software");
//    	myStudent.addTest(word);
//		myStudent.addTest(excel);
//		myStudent.addTest(outlook);
//		myStudent.addTest(powerPoint);
//		myStudent.addTest(access);
	    //System.out.print(myStudent.getTestList());
	    //System.out.print(myStudent.toString());
	    
//	    Student yourStudent = new Student("Jill",654321,"A.M.","Cisco");
//    	yourStudent.addTest(word);
//    	yourStudent.addTest(excel);
//    	yourStudent.addTest(outlook);
//    	yourStudent.addTest(powerPoint);
//    	yourStudent.addTest(access);
    	
    	//Student theStudent = new Student("Bob",123446,"P.A.","Software1111");
//    	theStudent.addTest(word);
//    	theStudent.addTest(excel);
//    	theStudent.addTest(outlook);
//    	theStudent.addTest(powerPoint);
//    	theStudent.addTest(access);
		
		StudentList allStudents = new StudentList();
//		allStudents.addStudent(myStudent);
//		allStudents.addStudent(yourStudent);
//		allStudents.addStudent(theStudent);
		
		allStudents.getStudentsFromFile();
		
		System.out.print(allStudents);
		
		//allStudents.sendStudentsToFile();
	}
}