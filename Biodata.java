//Biodata .java
import java.util.Scanner;
	
public class BioData{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		String name,gender,nationality,status;
		int age,phoneNumber;
	System.out.println("Enter your name");
	name=sc.nextLine();

	System.out.println("Gender");
		gender=sc.nextLine();
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Telephone number");
	phoneNumber=sc.nextInt();
	System.out.println("Nationality");
	nationality=sc.nextLine();
	System.out.println("status");
	status=sc.nextLine();
	}
}