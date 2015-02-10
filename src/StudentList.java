import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentList {
	private ArrayList<Student> studentList;
	public StudentList()
	{
		studentList = new ArrayList<Student>();
	}

	public void addStudent(Student students)
	 {
		 studentList.add(students);
	 }
	public String toString()
	{
		return studentList.toString();
	}

	public void getStudentsFromFile() throws FileNotFoundException
	  {
		  Scanner fileIn = new Scanner(new File("src\\StartData.txt"));
		  int numSaves = fileIn.nextInt();
		  fileIn.nextLine();
		  int numLines = fileIn.nextInt();
		  fileIn.nextLine();

		  String[] list;

		  for(int i = 0; i < numLines; i++)
			{
			  	MOS word;
			  	MOS excel;
			  	MOS outlook;
			  	MOS powerPoint;
			  	MOS access;
				list = fileIn.nextLine().split(",");
				if(numSaves > 0)
				{
					word = new MOS("Word",Boolean.parseBoolean(list[4]),Boolean.parseBoolean(list[5]),Boolean.parseBoolean(list[6]),Boolean.parseBoolean(list[7]));
			    	excel = new MOS("Excel",Boolean.parseBoolean(list[8]),Boolean.parseBoolean(list[9]),Boolean.parseBoolean(list[10]),Boolean.parseBoolean(list[11]));
			    	outlook = new MOS("Outlook",Boolean.parseBoolean(list[12]),Boolean.parseBoolean(list[13]),Boolean.parseBoolean(list[14]),Boolean.parseBoolean(list[15]));
			    	powerPoint = new MOS("Power Point",Boolean.parseBoolean(list[16]),Boolean.parseBoolean(list[17]),Boolean.parseBoolean(list[18]),Boolean.parseBoolean(list[19]));
			    	access = new MOS("Access", Boolean.parseBoolean(list[20]),Boolean.parseBoolean(list[21]),Boolean.parseBoolean(list[22]),Boolean.parseBoolean(list[23]));

			    	Student stud = new Student(list[0],Integer.parseInt(list[1]),list[2],list[3],word, excel, outlook, powerPoint, access);
			    	addStudent(stud);
				}/*else
				{

				}*/
	        }
		  fileIn.close();
	  }

	  public void sendStudentsToFile() throws IOException
	  {
			PrintWriter fileOut = new PrintWriter(new FileWriter("src\\TestSave.txt"));

			fileOut.println(studentList.size());
			for(int i = 0; i < studentList.size(); i++)
			{
				//MOS temp = studentList.get(i).getTestList().get(i);
//				for(int k = 0; k < 4; k++)
//				{
//
//				}
				MOS temp = studentList.get(i).getTestList().get(0);
				boolean getW1 = temp.isLvl1C();
				boolean getW2 = temp.isLvl2C();
				boolean getW3 = temp.isLvl3C();
				boolean getWC = temp.isCert();
				temp = studentList.get(i).getTestList().get(1);
				boolean getE1 = temp.isLvl1C();
				boolean getE2 = temp.isLvl2C();
				boolean getE3 = temp.isLvl3C();
				boolean getEC = temp.isCert();
				temp = studentList.get(i).getTestList().get(2);
				boolean getO1 = temp.isLvl1C();
				boolean getO2 = temp.isLvl2C();
				boolean getO3 = temp.isLvl3C();
				boolean getOC = temp.isCert();
				temp = studentList.get(i).getTestList().get(3);
				boolean getP1 = temp.isLvl1C();
				boolean getP2 = temp.isLvl2C();
				boolean getP3 = temp.isLvl3C();
				boolean getPC = temp.isCert();
				temp = studentList.get(i).getTestList().get(4);
				boolean getA1 = temp.isLvl1C();
				boolean getA2 = temp.isLvl2C();
				boolean getA3 = temp.isLvl3C();
				boolean getAC = temp.isCert();
				fileOut.print(studentList.get(i).getName() + "," + studentList.get(i).getID() + "," + studentList.get(i).getAtcClass() + "," + studentList.get(i).getSession() + "," + getW1 + "," + getW2 + "," + getW3 + "," + getWC + "," + getE1 + "," + getE2 + "," + getE3 + "," + getEC + "," + getO1 + "," + getO2 + "," + getO3 + "," + getOC + "," + getP1 + "," + getP2 + "," + getP3 + "," + getPC + "," + getA1 + "," + getA2 + "," + getA3 + "," + getAC + "\n");
			}

			fileOut.close();
	  }
}
