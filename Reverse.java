import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the ten numbers here: ");
	int[] numbers=new int[10];
 	for(int x=0; x<numbers.length; x++){
		numbers[x]=sc.nextInt();
		}
		// calculate the sum
		int sum=0;
	for(int y=0; y<numbers.length; y++){
		sum+=numbers[y];
		}
		// find the average
	int average= sum/numbers.length;
	System.out.println("The sum is  "+ sum);
	System.out.println("The average is " + average);
	System.out.println("The reverse order is : "+ reverse(numbers));
	//display user input in reverse order
		//for(int y = numbers.length-1; y>=0 ; y--){
	//System.out.println(numbers[y]);
		//}
	}
		// use a method that will be invoked to return 
		//the reverse order of elements
	public static int[] reverse(int[] list){
			//gonna create an array in which elements from other arrays
			//are gonna be inserted
		int[] temp=new int[list.length];

		for(int i=0,  j=temp.length-1;  i<list.length;i++, j--){
			temp[j]=list[i];
			}
			return temp;
		}
}