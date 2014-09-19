import java.util.*;
import java.util.Scanner;
public class AnalyzeString
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		DigitCountThread dc = new DigitCountThread(str);
		isPalindromeThread pal = new isPalindromeThread(str);
		upperCountThread uct = new upperCountThread(str); 
		dc.start();
		pal.start();
		uct.start();
		
		try {
			dc.join();
			pal.join();
			uct.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c = dc.getDigitCount();
		boolean palin = pal.isPal();
		int upcnt = uct.getUpperCount(); 
		System.out.println("Count: "+ c);
		if(palin)
			System.out.println("Is a palindrome");
		else
			System.out.println("Is not a palindrome");
		System.out.println("No of Upper Case letter are: "+ upcnt);	
	}
}