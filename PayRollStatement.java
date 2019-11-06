//PayRollStatement.java
import java.util.Scanner;
//this programs gives out the pay roll statement of a worker
public class PayRollStatement{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);

			String employeeName;
			int hoursWorked;
			double grossPay,federalTax,stateTax,deductions,netPay,hourlyPayRate;
			
		
		System.out.println("Enter the employee's name: ");
		employeeName =input.nextLine();
		System.out.println();
		System.out.println("You are welcome "+employeeName);
		System.out.println();
		System.out.println("Enter the number of hours worked in a week: ");
		hoursWorked=input.nextInt();

		System.out.println("Enter the hourly pay rate: ");
		hourlyPayRate=input.nextDouble();

		grossPay = hoursWorked * hourlyPayRate;

		System.out.println(employeeName+"'s gross pay is: " + grossPay);
		

		System.out.println("Enter the federal tax withholding rate: ");
		federalTax =input.nextDouble();

		System.out.println("Enter the state tax withholding rate: ");
		stateTax =input.nextDouble();
		
		deductions=(federalTax * grossPay) + (stateTax * grossPay);
		System.out.println("The total deductions amount to: "+deductions);		
		
		netPay = grossPay-(deductions);
		System.out.println("The employee's net pay is: "+netPay);
	}

}