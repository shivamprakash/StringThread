
public class upperCountThread extends Thread
{
	int uppercount;
	String str;
	public upperCountThread(String str)
	{
		this.str = str;
	}
	public void run()
	{
		count();
	}
	public void count()
	{
		int len = str.length();
		for(int i = 0;i <len;i++)
			if(Character.isUpperCase(str.charAt(i)))
				uppercount++;
			
	}
	public int getUpperCount()
	{
		return uppercount;
	}
	

}
