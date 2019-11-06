//Pieces

//**import java.util.Scanner;
public class Pieces{
	public static void main(String[] args){
	/**Scanner sc=new Scanner(System.in);
		
	*/System.out.println((int)(Math.random()*(65535+1)));
		/**System.out.println("Enter the values of a, b and c:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		*/double c = sc.nextDouble();
		
		
		char ch='c';
		switch(ch){
			case 'a':
			case 'b':
			case 'c':System.out.print(ch);break;
			case 'd':System.out.print(ch);
			}
			
		/**int x=4;
		double y=9.335;
		System.out.printf("y is %f and x is %d",y,x);
		
		double x=2.0/3;
		System.out.printf("x is %-4.2f\n",x);
		
		int count=0;
		while(count<100){
		
		System.out.println(count);
		*/count++;
		}
		
		
		
	}

}*/
//MultiplicationTable.java

class MultiplicationTable{
	public static void main(String[] args){
	System.out.println("This program prints out a multiplication table");
	//display the number titles
	System.out.println("\t");
	for(int i=1;i<=7;i++)
	System.out.print("\t"+i);
	System.out.println("\n.............................................................................................................................");
		
	//print table body
	for(int j=1;j<=7;j++){
	System.out.println(j+"|");

	for(int i=1;i<=7;i++){
		//display the product and align properly
	System.out.printf("%4d",(i*j));
	}
		System.out.println();
		}
	}

}

