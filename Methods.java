//Methods.java
import javax.swing.JOptionPane;
public class Methods{
	public static void main(String[] args){
	
	JOptionPane.showMessageDialog(null,"The sum from 1 to 10 is:"+addition(1,10));
	
	}
public static int addition(int x1,int x2){
int sum=0;
for(int x=x1;x<=x2;x++)
sum+=x;
return sum;
	}
}
