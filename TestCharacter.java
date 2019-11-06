import java.util.Scanner;
public class TestCharacter{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	String myChar;
	
	System.out.println("Enter the character: ");
	myChar =input.nextLine();
	char ch = myChar.charAt(0);
	
	if(ch>='A' && ch <='Z')
		System.out.println("Uppercase.");
	else if(ch>='a' && ch <='z')
		System.out.println("Lowercase.");
	else if(ch>='0' && ch <='9')
		System.out.println("Numeric character.");
	else
		System.out.println("Other characters");
	String name="Irene";
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	}
}
	
	
	