
public class isPalindromeThread extends Thread
{
	String str;
	String rstr;
	boolean isPal;
	public isPalindromeThread(String str)
	{
		isPal=false;
		this.str=str;
	}
	public void run()
	{
		determinePal();
	}
	public void determinePal()
	{
		rstr = new StringBuilder(str).reverse().toString();		
		if(str.replaceAll("\\s", "").toLowerCase().equals(rstr.replaceAll("\\s", "").toLowerCase()))
			isPal=true;
		else
			isPal=false;
	}
	public boolean isPal()
	{
		return isPal;
	}
	

}
