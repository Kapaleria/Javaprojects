import java.util.Scanner;

public class Swap{
	public static void main(String[] args){
		int x,y;
	System.out.println("Enter the values of x and y respectively: ");
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		y=input.nextInt();
	System.out.println("Before swapping\nx="+x +"\ny="+y);
		x=x+y;
		y=x-y;
		x=x-y;
	System.out.println("After swapping\nx="+x +"\ny="+y);	

	}

}