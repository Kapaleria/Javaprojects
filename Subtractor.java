//Subtractor.java
import java.util.Scanner;
class Subtractor{
	public static void main(String[] args){
		int num1,num2,temp,answer;
	num1=(int)(Math.random()*10);
	num2=(int)(Math.random()*10);
		
	if(num1<num2){
		temp=num1;
		num1=num2;
		num2=temp;
	}
		Scanner input=new Scanner(System.in);
	System.out.println("What is " +num1 +"-" +num2+ "?");
	answer=input.nextInt();
	
	if(answer==(num1-num2))
		System.out.println("True");
	else
		System.out.println("False");
	}
}



