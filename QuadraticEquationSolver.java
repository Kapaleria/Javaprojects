//QuadraticEquationSolver.java
/**Nakabugo Irene  17/U/0081/GCS
     Acen Marion Pamela  17/U/2130/GIT/PS
     Akumu Annet  16/U/0735/GIT/PS
*/
import java.util.Scanner;
public class QuadraticEquationSolver{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		
	System.out.println("This program solves a quadratic equation");
		//prompt the user for values
		System.out.println("Enter the values of a, b and c:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("The equation is:"+a+"x^2"+"+"+b+"x"+"+"+c);
		
		double r1=(-b+(Math.sqrt(Math.pow(b,2))-4*a*c))/2*a;
		double r2=(-b-(Math.sqrt(Math.pow(b,2))-4*a*c))/2*a;
		
		if(((Math.pow(b,2))-4*a*c)>0)
			System.out.println("The two roots of the equation are:\n\t\tr1="+r1+"\n\t\tr2="+r2);
			else if(((Math.pow(b,2))-4*a*c)==0)
			System.out.println("This equation has one root and it is:\n\t\t"+ r1);
			else
				System.out.println("The equation has no real roots!");

	}

}