
public class MOS 
{
 
 private boolean lvl1C, lvl2C, lvl3C, cert;
 private boolean[] levels;
 private String test;
 public MOS(String test, boolean lvl1C, boolean lvl2C, boolean lvl3C, boolean cert)
 {
	 this.test = test;
	 this.lvl1C = lvl1C;
	 this.lvl2C = lvl2C;
	 this.lvl3C = lvl3C;
	 this.cert = cert;
//	 levels = {};
 }
 
   public String getTest() 
   {
	return test;
   }

   public void setLvl1C(boolean lvl1c) {
	lvl1C = lvl1c;
   }

   public void setLvl2C(boolean lvl2c) {
	lvl2C = lvl2c;
   }

    public void setLvl3C(boolean lvl3c) {
	lvl3C = lvl3c;
    }

    public boolean isLvl1C() 
    {
		return lvl1C;
	}
	public boolean isLvl2C() 
	{
		return lvl2C;
	}
	public boolean isLvl3C() 
	{
		return lvl3C;
	}
	
	public boolean isCert() {
		return cert;
	}

	public void setCertification(boolean cert) {
		this.cert = cert;
	}
	
	public boolean allComplete()
	{
		if(lvl1C && lvl2C && lvl3C && cert)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String str;
		str = ("Program: " + test + " level 1: " + isLvl1C() + " level 2: " + isLvl2C() + 
				" level 3: " + isLvl3C() +" "+ test + " Cert: " + cert + " Score: " + score() +  "\n");
		return str;
	}

	public int score()
	{	
	 int scr = 0;
	 if(allComplete())
	   scr += 40;
	 if(lvl1C)
		 scr+=10;
	 if(lvl2C)
		 scr+=10;
	 if(lvl3C)
		 scr+=10;
	 if(cert)
		 scr+=10;
	 return scr;
	
	}
}

   
