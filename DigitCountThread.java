
public class DigitCountThread extends Thread
{
	int digitCount;
	String str;
	public DigitCountThread(String str)
	{
		digitCount=0;
		this.str=str;		
	}
	public void run()
	{
		count();
	}
	public void count()
	{
		for (int i=0;i<str.length();i++)
			if(Character.isDigit(str.charAt(i)))
				digitCount++;
	}
	public int getDigitCount()
	{
		
		return digitCount;
	}
}
