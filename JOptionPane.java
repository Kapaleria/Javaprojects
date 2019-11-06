import javax.swing.JOptionPane;

public class JoptionPane{
	public static void main(String[] args){
	System.out.println("This program prints out the average of three intergers.");

	String temp;//temporary storage for input

	temp=JOptionPane.showInputDialog(null,"Enter first number please:");
	int a=Interger.parseInt(temp);//String to int

	temp=JOptionPane.showInputDialog(null,"Enter second number please:");
	int b=Interger.parseInt(temp);
	
	temp=JOptionPane.showInputDialog(null,"Enter third number please:");
	int c=Interger.parseInt(temp);
	
	JOptionPane.showMessageDialog(null,"Average is" + (a+b+c)/3);

	}


}