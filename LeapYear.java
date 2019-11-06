//LeapYear.java
import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		int year;
	Scanner dinnah=new Scanner(System.in);

	System.out.println("Enter the year");
	year=dinnah.nextInt();
	if(((year%4)==0)&&((year%100)!=0)||((year%400)==0))
	System.out.println("the year is a leap year");
	else
	System.out.println("the year is lunar year");
	}
}
	
	
	