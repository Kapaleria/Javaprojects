//Lottery.java
import java.util.Scanner;
public class Lottery{
	public static void main(String[] args){
	System.out.println("Enter any first digit");
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	System.out.println("Enter any second digit");
	int b=input.nextInt();
	//generate two random numbers
	int c=(int)(Math.random()*10);
	int d=(int)(Math.random()*10);
	
	System.out.println("the two random numbers are "+c +"and "+d);

	if((a==c)&&(b==d))
		System.out.println("Congs,you have won $10,000");
	else if(((a==c)|(a==d))&&((b==c)|(b==d)))
		System.out.println("Congs,you have won $3,000");
	else if((a==(c|d))|((b==(c|d))))
		System.out.println("Congs,you have won $1000");
		else{
		System.out.println("Sorry,you have lost");
}
	}
}