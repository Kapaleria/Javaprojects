//TypeOfYear.java
//this program replies Leap Year or Not Leap Year for a given year
import java.util.Scanner;
public class TypeOfYear{
	public static void main(String[] args){
	int year;
	Scanner sc=new Scanner(System.in);
	//prompt the user to enter the year
	System.out.println("Enter the year here please: ");
	year=sc.nextInt();
		//condition
	if((year%4==0)&&(year%100!=0)||(year%400==0))
	System.out.println("Leap Year");
	else
	System.out.println("Not a Leap Year");
	}
}