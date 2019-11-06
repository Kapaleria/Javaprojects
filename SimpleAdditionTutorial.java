
import java.util.Scanner;

public class SimpleAdditionTutorial{
 	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
		int num1, num2, answer;
	//generate random numbers
	num1 = (int)(Math.random()*10);
	num2 = (int)(Math.random()*10);
	System.out.println("Welcome to the Simple Addition Tutorial!");
	System.out.println();

	System.out.println("What is " + num1 + "+" +num2 +"?");
	answer =sc.nextInt();

	if(answer==(num1 + num2)){
		System.out.println(num1 + "+" +num2 + "= " + answer +" is true!");
		}
	else{
		System.out.println(num1 + " +" + num2 + "= "+ answer + " is false!");
	}
			 
	}

} 