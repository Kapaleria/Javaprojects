//MultiplicationTable.java

public class MultiplicationTable{
	public static void main(String[] args){
	System.out.println("This program prints out a multiplication table");
	//display the number titles
	System.out.println("    ");
	for(int i=1;i<=7;i++)
	System.out.print("\t"+i);
	System.out.println("\n..........................................................................................");
		
	//print table body
	for(int j=1;j<=7;j++){
	System.out.println(j+"|\n");

	for(int i=1;i<=7;i++){
		//display the product and align properly
	System.out.printf("\t%4d",(i*j));
	}
		System.out.println();
		}
	}

}
