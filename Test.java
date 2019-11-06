import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Test{
	public static void main(String[] args){

	 double y=36734.3545478376452356;
	DecimalFormat fmt=new DecimalFormat("0.###");
	NumberFormat ft=new NumberFormat.getCurrencyInstance();
	System.out.println(fmt.format(y));
	System.out.println(ft.format(y));
	int sum=0;
	for(int i=0;i<100000;i++){
	Scanner input=new Scanner(System.in);
	sum+=input.nextInt();
		}
	}
}