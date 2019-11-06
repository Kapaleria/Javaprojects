import javax.swing.JOptionPane;

public class SwingInput{
	public static void main(String[] args){
	System.out.println("This program prints out the average of three intergers.");

	String temp;//temporary storage for input

	temp=JOptionPane.showInputDialog(null,"Enter first number please:");
	int a=Integer.parseInt(temp);//String to int

	temp=JOptionPane.showInputDialog(null,"Enter second number please:");
	int b=Integer.parseInt(temp);
	
	temp=JOptionPane.showInputDialog(null,"Enter third number please:");
	int c=Integer.parseInt(temp);
	
	JOptionPane.showMessageDialog(null,"Average is" + (a+b+c));
	
}
}