	import java.util.ArrayList;
    
public class Student  
{
	 private String name;
	 private int ID;
	 private String session;
     private String atcClass;
	 private ArrayList<MOS> testList;
    
		
	 public Student(String name, int ID,String atcClass,String session, MOS word, MOS access, MOS excel, MOS outlook, MOS powerPoint)
	 {
		 this.name = name;
		 this.ID = ID;
		 this.atcClass = atcClass;
		 this.session = session;
		 testList = new ArrayList<MOS>();
		 
		 testList.add(word);
		 testList.add(excel);
		 testList.add(outlook);
		 testList.add(powerPoint);
		 testList.add(access);
	 }

	public ArrayList<MOS> getTestList() {
		return testList;
	}
	 public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String getSession() {
		return session;
	}

	public String getAtcClass() {
		return atcClass;
	}

	public int calcScore()
	{
		int scr = 0;
		for(int i = 0; i < testList.size();i++)
		{
			scr += testList.get(i).score();
		}
		if(testList.get(0).allComplete() && testList.get(1).allComplete() && testList.get(2).allComplete() && testList.get(3).allComplete() && testList.get(4).allComplete())
		  scr += 80;
		return scr;
	}
	
	public String toString()
	{
		String str;
		str = ("" + testList.toString());
	    str += ("" + name + " " + calcScore());	
	    return str;
	}
}
